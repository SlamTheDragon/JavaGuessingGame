package com.group1;

import com.group1.data.lang.consoleLog;
import com.group1.data.program.data;
import com.group1.data.program.reset;
import com.group1.data.program.userdata;

public class menu {
    public static void main(String[] args) throws InterruptedException {
        // Main Menu
        
        while (data.menuBreak) {
            data.subLoop = true;
            data.isTakingName = true;

            if (!data.isReplay) {
                consoleLog.menu();
                userdata.read();
            }

            if (data.stringUserInput.equals("1") || data.isReplay) {
                data.isReplay = false;
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
                userdata.read();
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

    public static void option1() throws InterruptedException {
        // Quiz Wrapper
        data.isRandom = false;
        data.isReplay = false;

        while (data.subLoop) {
            consoleLog.menuCategory();
            userdata.read();

            if (data.stringUserInput.equalsIgnoreCase("1")) {
                data.subMenuBreakCounter = 0;
                data.qCategory = "place";
                confirmStart();
            } else if (data.stringUserInput.equalsIgnoreCase("2")) {
                data.subMenuBreakCounter = 0;
                data.qCategory = "things";
                confirmStart();
            } else if (data.stringUserInput.equalsIgnoreCase("3")) {
                data.subMenuBreakCounter = 0;
                data.qCategory = "animals";
                confirmStart();
            } else if (data.stringUserInput.equalsIgnoreCase("4")) {
                data.subMenuBreakCounter = 0;
                data.qCategory = "names";
                confirmStart();
            } else if (data.stringUserInput.equalsIgnoreCase("5")) {
                data.subMenuBreakCounter = 0;
                data.qCategory = "random";
                data.isRandom = true;
                confirmStart();
            } else if (data.stringUserInput.equalsIgnoreCase("6")) {
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

    private static void option2() throws InterruptedException {
        // Mechanics

        consoleLog.subMech();

        while (data.subLoop) {
            consoleLog.subOptions1();
            userdata.read();
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

    private static void option3() {
        // Get Previous Score

        if (!data.hasTakenQuiz) {
            consoleLog.worker5();
            data.userInput.nextLine();
        } else {
            consoleLog.menuPrev();
            data.userInput.nextLine();
        }
    }

    private static void option4() throws InterruptedException {
        // Settings

        while (data.isTakingName) {
            consoleLog.menuSettings();
            userdata.read();

            if (data.stringUserInput.equals("1")) {
                consoleLog.worker4();
                data.subMenuBreakCounter = 0;
                nameData();
            } else if (data.stringUserInput.equals("2")) {
                consoleLog.menuInfo();
                userdata.read();
            } else if (data.stringUserInput.equals("3")) {
                break;
            }else {
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

    public static void option5() throws InterruptedException {
        // System exit

        consoleLog.subExit();
        while (data.exitMenu) {
            data.subMenuBreakCounter = 0;
            userdata.read();
            data.conditions.setInput(data.stringUserInput);

            if (data.conditions.getInput().equalsIgnoreCase("n")) {
                data.subLoop = true;
                break;
            } else if (data.conditions.getInput().equalsIgnoreCase("y")) {
                reset.exit();
                guesstheword.kill();
            } else {
                consoleLog.errMismatch2();
                ++data.menuBreakCounter;
                if (data.menuBreakCounter == 4) {
                    consoleLog.errExceeded();
                    reset.exit();
                }
            }
        }
    }

    private static void confirmStart() throws InterruptedException {
        // Quiz Wrapper Entry

        while (data.subLoop) {
            consoleLog.menuQuizStart();
            userdata.read();

            if (data.stringUserInput.equalsIgnoreCase("1")) {
                data.subMenuBreakCounter = 0;
                quiz.main(new String[0]);
                data.subLoop = false;
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

    public static void nameDataIntro() throws InterruptedException {
        // Intro Setup
        
        while (data.innerLoop) {                
            consoleLog.worker1();
                userdata.read();
                
            if (data.stringUserInput.equalsIgnoreCase("QUIT")) {
                data.stringUserInput = "";
                option5();
            } else if (data.stringUserInput.isEmpty()) {
                consoleLog.errEmptyInput();
            } else if (data.stringUserInput.length() >= 8) {
                data.username.setInput(data.stringUserInput.trim().substring(0, 8));
                data.innerLoop = false;
            } else {
                data.username.setInput(data.stringUserInput.trim());
                data.innerLoop = false;
            }
        }

        while (data.introLoop) {
            consoleLog.worker2();
            userdata.read();
            data.conditions.setInput(data.stringUserInput);
                
            if (data.conditions.getInput().equalsIgnoreCase("n")) {
                data.reLoop = true;
                consoleLog.worker3();
                    
                while (data.reLoop) {
                    userdata.read();
                    if (data.stringUserInput.isEmpty()) {
                        consoleLog.errEmptyInput();
                    } else if (data.stringUserInput.length() >= 8) {
                        data.username.setInput(data.stringUserInput.trim().substring(0, 8));
                        data.reLoop = false;
                    } else {
                        data.username.setInput(data.stringUserInput.trim());
                        data.reLoop = false;
                    }
                }
            } else if (data.conditions.getInput().equalsIgnoreCase("y")) {
                data.intro = false;
                data.introLoop = false;
                data.introName = false;
                consoleLog.intro2();
                data.userInput.nextLine();
                break;
            } else if (data.stringUserInput.equalsIgnoreCase("quit")) {
                option5();
            } else {
                consoleLog.errMismatch3();
                ++data.menuBreakCounter;
                if (data.menuBreakCounter == 4) {
                    consoleLog.errExceeded3();
                    data.introName = false;
                    data.username.setInput("DefaultName");
                    break;
                }
            }
        }
    }

    public static void nameData() throws InterruptedException {
        // Name logic goes here

        String nameHold = data.username.getInput();

        while (true) {
            while (data.isTakingName) {    
                userdata.read();
                    
                if (data.stringUserInput.isEmpty()) {
                    consoleLog.errEmptyInput();
                } else if (data.stringUserInput.length() >= 8) {
                    data.username.setInput(data.stringUserInput.trim().substring(0, 8));
                    data.isTakingName = false;
                } else {
                    data.username.setInput(data.stringUserInput.trim());
                    data.isTakingName = false;
                }
            }

            consoleLog.worker2();
            userdata.read();
            data.conditions.setInput(data.stringUserInput);
            
            if (data.stringUserInput.equalsIgnoreCase("QUIT")) {
                option5();
            } else if (data.conditions.getInput().equalsIgnoreCase("n")) {
                data.isTakingName = true;
                consoleLog.worker3();
            } else if (data.conditions.getInput().equalsIgnoreCase("y")) {
                data.isTakingName = false;
                break;
            } else {
                consoleLog.errMismatch1();
                ++data.subMenuBreakCounter;
                if (data.subMenuBreakCounter == 4) {
                    consoleLog.errExceeded2();
                    data.subMenuBreakCounter = 0;
                    data.isTakingName = false;
                    data.username.setInput(nameHold);
                    break;
                }
            }
        }
    }
}