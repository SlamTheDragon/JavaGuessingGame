package com.group1;

import java.time.Instant;
import com.group1.data.lang.consoleLog;
import com.group1.data.program.answers;
import com.group1.data.program.data;
import com.group1.data.program.questions;
import com.group1.data.program.userdata;

public class quiz {

    // fake thread control
    private static boolean closeQuiz = false;

    public static void main(String[] args) throws InterruptedException {
        
        // Initial Reset
        data.qCorrect = 0;
        closeQuiz = false;

        consoleLog.quizIntro1();
        data.startTime = Instant.now().toEpochMilli();

        // QUIZ logic
        for (data.questionIndex = 1; data.questionIndex < 6; data.questionIndex++) {
            if (closeQuiz) {
                break;
            }
            // reset
            data.iCorrect = false;
            data.qAttempt = 1;
            data.qAttemptsLeft = 5;

            data.randomQLogInt = data.qLog.nextInt(data.upperboundQLog);
            consoleLog.qLog1();

            if (data.isRandom) {
                data.randomInt = data.id.nextInt(data.upperboundRand);
            } else {
                data.randomInt = data.id.nextInt(data.upperbound);
            }

            // Question Selector
            questionSelectorRouter();

            while (true) {
                userdata.read();
                data.answers.setInput(data.stringUserInput);
                data.ansArray = data.answers.getInput().split(" ");

                // answer parser
                answerSelectorRouter();

                if (closeQuiz) {
                    break;
                } else if (data.iCorrect) {
                    consoleLog.qLogCorrect();
                    ++data.qCorrect;
                    data.subMenuBreakCounter = 0;
                    data.qAverageAttempt = data.qAverageAttempt + data.qAttempt;
                    break;
                } else {
                    // reparse next answer
                    ++data.subMenuBreakCounter;
                    ++data.qAttempt;
                    --data.qAttemptsLeft;
                    data.qScore = data.qScore - 4;

                    data.randomQLogInt = data.qLog.nextInt(data.upperboundQLog);
                    consoleLog.qLogIncorrect();
                    consoleLog.qLog2();
                    System.out.print(" You have " + data.qAttemptsLeft + " attempt(s) left.\n");
                    
                    if (data.subMenuBreakCounter == 5) {
                        data.qAverageAttempt = data.qAverageAttempt + data.qAttempt;
                        consoleLog.qLogIncorrectExceeded();
                        data.subMenuBreakCounter = 0;
                        
                        // breakout if attempts has exceeded
                        break;
                    }
                }
            }
        }

        data.endTime = Instant.now().toEpochMilli();
        data.timeElapsed = data.endTime - data.startTime;
        data.minutes = (data.timeElapsed / 1000) / 60;
        data.seconds = (data.timeElapsed / 1000) % 60;
        data.qAverageAttempt = data.qAverageAttempt / 5;

        if (!data.hasTakenQuiz) {
            data.hasTakenQuiz = true;
        }
        
        // End Menu

        while (true) {
            if (closeQuiz) {
                data.hasTakenQuiz = false;
                consoleLog.menuQuizEnd2();
                userdata.read();
            } else {
                data.randomQLogInt = data.qLog.nextInt(data.upperboundQLog);
                consoleLog.qLog3();
                consoleLog.menuQuizEnd();
                userdata.read();
            }

            if (data.stringUserInput.equals("1")) {
                data.menuBreakCounter = 0;
                data.subLoop = false;
                data.isReplay = true;
                break;
            } else if (data.stringUserInput.equals("2")) {
                data.menuBreakCounter = 0;
                data.subLoop = false;
                break;
            } else {
                consoleLog.errMismatch1();
                ++data.subMenuBreakCounter;
                if (data.subMenuBreakCounter == 4) {
                    consoleLog.errExceeded2();
                    data.subLoop = false;
                    data.subMenuBreakCounter = 0;
                    break;
                }
            }
        }
    }

    // Routers

    private static void questionSelectorRouter() {
        if (data.qCategory.equals("place")) {
            qPlace();
        } else if (data.qCategory.equals("things")) {
            qThings();
        } else if (data.qCategory.equals("animals")) {
            qAnimals();
        } else if (data.qCategory.equals("names")) {
            qNames();
        } else if (data.qCategory.equals("random")) {
            qRandom();
        }
    }

    private static void answerSelectorRouter() {
        if (data.qCategory.equals("place")) {
            aPlace();
        } else if (data.qCategory.equals("things")) {
            aThings();
        } else if (data.qCategory.equals("animals")) {
            aAnimals();
        } else if (data.qCategory.equals("names")) {
            aNames();
        } else if (data.qCategory.equals("random")) {
            aRandom();
        }
    }

    // Questions Printer

    private static void qPlace() {
        System.out.println("[QUIZ] QUESTION " + data.questionIndex + ": " + questions.QPlace[data.randomInt]);
    }

    private static void qThings() {
        System.out.println("[QUIZ] QUESTION " + data.questionIndex + ": " + questions.QThings[data.randomInt]);
    }

    private static void qAnimals() {
        System.out.println("[QUIZ] QUESTION " + data.questionIndex + ": " + questions.QAnimals[data.randomInt]);
    }

    private static void qNames() {
        System.out.println("[QUIZ] QUESTION " + data.questionIndex + ": " + questions.QNames[data.randomInt]);
    }

    private static void qRandom() {
        System.out.println("[QUIZ] QUESTION " + data.questionIndex + ": " + questions.QRandom[data.randomInt]);
    }

    // Answer Logic

    private static void aPlace() {
        for (data.iCheck = 0; data.iCheck < data.ansArray.length; data.iCheck++) {
            if (data.ansArray[data.iCheck].equalsIgnoreCase(answers.APlace[data.randomInt])) {
                data.iCorrect = true;
                break;
            } else if (data.ansArray[data.iCheck].equalsIgnoreCase("X") || data.ansArray[data.iCheck].equalsIgnoreCase("QUIT")) {
                interruptQuiz();
                if (closeQuiz) {
                    break;
                }
            }
        }
    }

    private static void aThings() {
        for (data.iCheck = 0; data.iCheck < data.ansArray.length; data.iCheck++) {
            if (data.ansArray[data.iCheck].equalsIgnoreCase(answers.AThings[data.randomInt])) {
                data.iCorrect = true;
                break;
            } else if (data.ansArray[data.iCheck].equalsIgnoreCase("X")
                    || data.ansArray[data.iCheck].equalsIgnoreCase("QUIT")) {
                interruptQuiz();
                if (closeQuiz) {
                    break;
                }
            }
        }
    }

    private static void aAnimals() {
        for (data.iCheck = 0; data.iCheck < data.ansArray.length; data.iCheck++) {
            if (data.ansArray[data.iCheck].equalsIgnoreCase(answers.AAnimals[data.randomInt])) {
                data.iCorrect = true;
                break;
            } else if (data.ansArray[data.iCheck].equalsIgnoreCase("X")
                    || data.ansArray[data.iCheck].equalsIgnoreCase("QUIT")) {
                interruptQuiz();
                if (closeQuiz) {
                    break;
                }
            }
        }
    }

    private static void aNames() {
        for (data.iCheck = 0; data.iCheck < data.ansArray.length; data.iCheck++) {
            if (data.ansArray[data.iCheck].equalsIgnoreCase(answers.ANames[data.randomInt])) {
                data.iCorrect = true;
                break;
            } else if (data.ansArray[data.iCheck].equalsIgnoreCase("X")
                    || data.ansArray[data.iCheck].equalsIgnoreCase("QUIT")) {
                interruptQuiz();
                if (closeQuiz) {
                    break;
                }
            }
        }
    }

    private static void aRandom() {
        for (data.iCheck = 0; data.iCheck < data.ansArray.length; data.iCheck++) {
            if (data.ansArray[data.iCheck].equalsIgnoreCase(answers.ARandom[data.randomInt])) {
                data.iCorrect = true;
                break;
            } else if (data.ansArray[data.iCheck].equalsIgnoreCase("X")
                    || data.ansArray[data.iCheck].equalsIgnoreCase("QUIT")) {
                interruptQuiz();
                if (closeQuiz) {
                    break;
                }
            }
        }
    }

    // Quiz Interruptor

    private static void interruptQuiz() {
        consoleLog.interruptQuiz();
        userdata.read();
        if (data.stringUserInput.equalsIgnoreCase("y")) {
            close();
        }
    }

    private static void close() {
        data.qCorrect = 0;
        data.iCorrect = false;
        data.qAttempt = 0;
        data.qScore = 100;
        data.qAverageAttempt = 0;
        data.questionIndex = 1;
        data.hasTakenQuiz = false;
        closeQuiz = true;
    }
}