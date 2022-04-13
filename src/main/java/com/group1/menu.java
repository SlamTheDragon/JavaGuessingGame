package com.group1;
import com.group1.data.lang.consoleLog;
import com.group1.data.program.data;

public class menu {
    public static void main(String[] args) {

        while (data.menuBreak) {

            consoleLog.menu();
            data.stringUserInput = data.userInput.nextLine();

            if (data.stringUserInput.equals("1")) {
                data.menuBreakCounter = 0;
                option1();
            } else if (data.stringUserInput.equals("2")) {
                data.menuBreakCounter = 0;
                option2();
            } else if (data.stringUserInput.equals("3")) {
                data.menuBreakCounter = 0;
                option3();
            } else if (data.stringUserInput.equals("4")) {
                data.menuBreakCounter = 0;
                option4();
            } else if (data.stringUserInput.equals("5")) {
                data.menuBreakCounter = 0;
                option5();
            } else if (data.stringUserInput.equals("-1")) {
                consoleLog.subRestart();
                data.stringUserInput = data.userInput.nextLine();
                data.conditions.setInput(data.stringUserInput);

                if (data.conditions.getInput().equalsIgnoreCase("y")) {
                    break;
                }
            } else {
                consoleLog.errMismatch1();
                ++data.menuBreakCounter;
                if (data.menuBreakCounter == 4) {
                    consoleLog.errExceeded();
                    data.globalRun = false;
                    data.menuBreak = false;
                }
            }
        }
    }

    public static void option1() {
        // quiz wrapper

        while (true) {
            consoleLog.menuQuiz();
            data.stringUserInput = data.userInput.nextLine();

            if (data.stringUserInput.equalsIgnoreCase("1")) {
                data.subMenuBreakCounter = 0;
                categoryMenu();
            } else if (data.stringUserInput.equalsIgnoreCase("2")) {
                data.subMenuBreakCounter = 0;
                break;
            } else {
                consoleLog.errMismatch1();
                ++data.subMenuBreakCounter;
                if (data.subMenuBreakCounter == 4) {
                    consoleLog.errExceeded2();
                    data.subMenuBreakCounter = 0;
                    break;
                }
            }
        }
    }

    public static void option2() {

        consoleLog.subMech();
        while (data.subLoop) {
            consoleLog.subOptions1();
            data.stringUserInput = data.userInput.nextLine();
            if (data.stringUserInput.equalsIgnoreCase("BACK") || data.stringUserInput.equalsIgnoreCase("1")) {
                data.subMenuBreakCounter = 0;
                break;
            } else if (data.stringUserInput.equalsIgnoreCase("QUIT") || data.stringUserInput.equalsIgnoreCase("2")) {
                data.subLoop = false;
                option5();
            } else {
                consoleLog.errMismatch2();
                ++data.subMenuBreakCounter;
                if (data.subMenuBreakCounter == 4) {
                    consoleLog.errExceeded2();
                    data.subMenuBreakCounter = 0;
                    break;
                }
            }
        }
    }

    public static void option3() {
        // get previous score

        if (!data.hasTakenQuiz) {
            consoleLog.worker5();
            data.userInput.nextLine();
        } else /*if (data.hasTakenQuiz)*/ {
            consoleLog.menuPrev();
            data.userInput.nextLine();
        }
    }

    public static void option4() {
        // settings

        while (true) {
            consoleLog.menuSettings();
            data.stringUserInput = data.userInput.nextLine();

            if (data.stringUserInput.equals("1")) {
                consoleLog.worker4();
                data.subMenuBreakCounter = 0;
                nameData();
            } else if (data.stringUserInput.equals("2")) {
                break;
            } else {
                consoleLog.errMismatch1();
                ++data.subMenuBreakCounter;
                if (data.subMenuBreakCounter == 4) {
                    consoleLog.errExceeded2();
                    data.subMenuBreakCounter = 0;
                    break;
                }
            }
        }
    }

    public static void option5() {
        // System exit

        consoleLog.subExit();
        while (data.exitMenu) {
            data.subMenuBreakCounter = 0;
            data.stringUserInput = data.userInput.nextLine();
            data.conditions.setInput(data.stringUserInput);

            if (data.conditions.getInput().equalsIgnoreCase("N")) {
                data.subLoop = true;
                if (data.intro) {
                    nameDataIntro();
                }
                break;
            } else if (data.conditions.getInput().equalsIgnoreCase("Y")) {
                data.menuBreak = false;
                data.exitMenu = false;
                data.introLoop = false;
                data.globalRun = false;
                data.introName = false;
            }
        }
    }

    public static void categoryMenu() {
        while (true) {
            consoleLog.menuCategory();
            data.stringUserInput = data.userInput.nextLine();

            if (data.stringUserInput.equalsIgnoreCase("1")) {
                data.subMenuBreakCounter = 0;
                //choice 1
            } else if (data.stringUserInput.equalsIgnoreCase("2")) {
                data.subMenuBreakCounter = 0;
                //chouce 2
            } else {
                consoleLog.errMismatch1();
                ++data.subMenuBreakCounter;
                if (data.subMenuBreakCounter == 4) {
                    consoleLog.errExceeded2();
                    data.subMenuBreakCounter = 0;
                    break;
                }
            }
        }
    }

    public static void nameDataIntro() {
        // Intro Setup
        
        while (data.introName) {
            consoleLog.worker1();
            data.stringUserInput = data.userInput.nextLine();
            data.username.setInput(data.stringUserInput);

            if (data.stringUserInput.equalsIgnoreCase("QUIT")) {
                data.stringUserInput = "";
                data.username.setInput(data.stringUserInput);
                option5();
            }

            while (data.introLoop) {
                consoleLog.worker2();
                data.stringUserInput = data.userInput.nextLine();
                data.conditions.setInput(data.stringUserInput);

                if (data.conditions.getInput().equalsIgnoreCase("n")) {
                    consoleLog.worker3();
                    data.stringUserInput = data.userInput.nextLine();
                    data.username.setInput(data.stringUserInput);
                } else {
                    data.intro = false;
                    data.introLoop = false;
                    data.introName = false;
                    consoleLog.intro2();
                    data.userInput.nextLine();
                    break;
                }
            }

        }

    }

    public static void nameData() {
        // name logic goes here

        while (true) {
            data.stringUserInput = data.userInput.nextLine();
            data.username.setInput(data.stringUserInput);

            consoleLog.worker2();
            data.stringUserInput = data.userInput.nextLine();
            data.conditions.setInput(data.stringUserInput);

            if (data.stringUserInput.equalsIgnoreCase("QUIT")) {
                option5();
            } else if (data.stringUserInput.equalsIgnoreCase("n")) {
                consoleLog.worker3();
            } else {
                break;
            }
        }
    }
}
