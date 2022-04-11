package com.group1;

import java.util.InputMismatchException;
import com.group1.data.lang.consoleLog;
import com.group1.data.program.data;
// TODO import java.util.Random;

public class menu {
    //Initialize local variables
    private static int menuBreakCounter;
    private static boolean menuBreak = true;

    public static void main(String[] strings) throws InputMismatchException {

        while (menuBreak) {

            consoleLog.menu();

            data.stringUserInput = data.userInput.nextLine();

            if (data.stringUserInput.equals("1")) {
                menuBreakCounter = 0;
                option1();
            } else if (data.stringUserInput.equals("2")) {
                menuBreakCounter = 0;
                option2();
            } else if (data.stringUserInput.equals("3")) {
                menuBreakCounter = 0;
                option3();
            } else if (data.stringUserInput.equals("4")) {
                menuBreakCounter = 0;
                option4();
            } else if (data.stringUserInput.equals("5")) {
                menuBreakCounter = 0;
                option5();
            } else if (data.stringUserInput.equals("-1")) {
                consoleLog.subRestart();
                data.stringUserInput = data.userInput.nextLine();
                data.conditions.setInput(data.stringUserInput);

                if (data.conditions.getInput().equalsIgnoreCase("y")) {
                    break;
                } else {
                    // skip
                }
            } else {
                consoleLog.errMismatch1();
                ++menuBreakCounter;
                if (menuBreakCounter == 4) {
                    consoleLog.errExceeded();
                    data.globalRun = false;
                    menuBreak =false;
                }
            }
        }

    }

    public static void option1() {
        // TODO quiz wrapper

        while (true) {
            // category selector here
            break;
        }
    }

    public static void option2() {
        // TODO game mechanics

        consoleLog.subMech();
        while (true) {
            consoleLog.subOptions1();
            data.stringUserInput = data.userInput.nextLine();
            if (data.stringUserInput.equalsIgnoreCase("BACK")) {
                break;
            } else if (data.stringUserInput.equalsIgnoreCase("QUIT")) {
                option5();
            }
        }
    }

    public static void option3() {
        // TODO get previous score
    }

    public static void option4() {
        // settings

        while (true) {
            consoleLog.menuSettings();

            data.stringUserInput = data.userInput.nextLine();

            if (data.stringUserInput.equals("1")) {
                consoleLog.worker4();
                nameData();
            } else if (data.stringUserInput.equals("2")) {
                break;
            }
        }
    }

    public static void option5() {
        // system exit
        consoleLog.subExit();

        while (true) {
            data.stringUserInput = data.userInput.nextLine();
            data.conditions.setInput(data.stringUserInput);

            if (data.conditions.getInput().equalsIgnoreCase("N")) {
                break;
            } else if (data.conditions.getInput().equalsIgnoreCase("Y")) {
                menuBreak = false;
                data.globalRun = false;
                break;
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
            // when returning from quit menu program proceeds to confirm name instead of restarting
            while (true) {
                consoleLog.worker2();
                data.stringUserInput = data.userInput.nextLine();
                data.conditions.setInput(data.stringUserInput);

                if (data.conditions.getInput().equalsIgnoreCase("n")) {
                    consoleLog.worker3();
                    data.stringUserInput = data.userInput.nextLine();
                    data.username.setInput(data.stringUserInput);
                } else {
                    data.introName = false;
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
