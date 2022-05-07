package com.group1;
import com.group1.data.lang.consoleLog;
import com.group1.data.program.data;
import com.group1.data.program.questions;

public class quiz {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("quiz.main()");
        System.out.println("QUIZ LOGIC WASNT MADE YET, PLEASE PROCEED TO BRUTE FORCE CRAP THANKS");

        if (data.qCategory.equals("place")) {
            place();
        } else if (data.qCategory.equals("things")) {
            things();
        } else if (data.qCategory.equals("names")) {
            names();
        } else if (data.qCategory.equals("animals")) {
            animals();
        } else if (data.qCategory.equals("random")) {
            random();
        }

        if (!data.hasTakenQuiz) {
            data.hasTakenQuiz = true;
        }
        
        while (true) {
            consoleLog.menuQuizEnd();
            data.stringUserInput = data.userInput.nextLine();

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
        // add while loop to quit or to restart, if restart return to option 1
    }

    private static void place() {
        for (data.questionIndex = 1; data.questionIndex < 6; data.questionIndex++) {

            data.randomInt = data.id.nextInt(data.upperbound);
            System.out.println("Question " + data.questionIndex + ": " + questions.QPlace[data.randomInt]);
            
            while (true) {
                System.out.print("Question selected: " + data.randomInt); // becomes answer
                data.userInput.nextLine();
                break;
                /// question code here, check ANSWERS[questionIndex]. If it's correct, break
                /// still works, it breaks out of this while loop and ignores the for loop
            }
        }
    }

    private static void things() {
        for (data.questionIndex = 1; data.questionIndex < 6; data.questionIndex++) {

            data.randomInt = data.id.nextInt(data.upperbound);
            System.out.println("Question " + data.questionIndex + ": " + questions.QThings[data.randomInt]);

            while (true) {
                System.out.print("Question selected: " + data.randomInt); // becomes answer
                data.userInput.nextLine();
                break;
                /// question code here, check ANSWERS[questionIndex]. If it's correct, break
                /// still works, it breaks out of this while loop and ignores the for loop
            }
        }
    }

    private static void names() {
        for (data.questionIndex = 1; data.questionIndex < 6; data.questionIndex++) {

            data.randomInt = data.id.nextInt(data.upperbound);
            System.out.println("Question " + data.questionIndex + ": " + questions.QNames[data.randomInt]);

            while (true) {
                System.out.print("Question selected: " + data.randomInt); // becomes answer
                data.userInput.nextLine();
                break;
                /// question code here, check ANSWERS[questionIndex]. If it's correct, break
                /// still works, it breaks out of this while loop and ignores the for loop
            }
        }
    }

    private static void animals() {
        for (data.questionIndex = 1; data.questionIndex < 6; data.questionIndex++) {

            data.randomInt = data.id.nextInt(data.upperbound);
            System.out.println("Question " + data.questionIndex + ": " + questions.QAnimals[data.randomInt]);

            while (true) {
                System.out.print("Question selected: " + data.randomInt); // becomes answer
                data.userInput.nextLine();
                break;
                /// question code here, check ANSWERS[questionIndex]. If it's correct, break
                /// still works, it breaks out of this while loop and ignores the for loop
            }
        }
    }

    private static void random() {
        for (data.questionIndex = 1; data.questionIndex < 6; data.questionIndex++) {

            data.randomInt = data.id.nextInt(data.upperboundRand);
            System.out.println("Question " + data.questionIndex + ": " + questions.QRandom[data.randomInt]);

            while (true) {
                System.out.print("Question selected: " + data.randomInt); // becomes answer
                data.userInput.nextLine();
                break;
                /// question code here, check ANSWERS[questionIndex]. If it's correct, break
                /// still works, it breaks out of this while loop and ignores the for loop
            }
        }
    }
}
