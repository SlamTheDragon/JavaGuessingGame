package com.group1;

import java.util.InputMismatchException;
import com.group1.data.program.data;


public class menu {
    public static void main(String[] strings) throws InputMismatchException {

        while (true) {
            System.out.println("[MENU] =======[MAIN MENU]=======");
            System.out.println("[MENU]      Enter  a  Number    ");
            System.out.println("[MENU]       [1] Play Game      ");
            System.out.println("[MENU]       [2] Mechanics      ");
            System.out.println("[MENU]       [3] Prev Score     ");
            System.out.println("[MENU]       [4] Settings       ");
            System.out.println("[MENU]       [5] Quit Game      ");
            System.out.println("[MENU] =========================");

            data.stringUserInput = data.userInput.nextLine();

            if (data.stringUserInput.equals("1")) {
                option1();
            } else if (data.stringUserInput.equals("2")) {
                option2();
            } else if (data.stringUserInput.equals("3")) {
                option3();
            } else if (data.stringUserInput.equals("4")) {
                option4();
            } else if (data.stringUserInput.equals("5")) {
                option5();
            } else if (data.stringUserInput.equals("-1")) {
                System.out.println("[SUB] Are you sure you would like to restart the program? [Y/N]");
                data.stringUserInput = data.userInput.nextLine();
                data.conditions.setInput(data.stringUserInput);

                if (data.conditions.getInput().equalsIgnoreCase("y")) {
                    break;
                } else {
                    // skip
                }
            } else {
                System.out.println("[WARN] Please enter a number only!");
                // FIXME Add counter and reset to auto end the program if this continues up to 5
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

        System.out.println("[SUB] Mechanics Here.");
        while (true) {
            System.out.println("[SUB] Type \"BACK\" to go back or type \"QUIT\" to quit the game");
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
            System.out.println("[MENU] =======[ SETTINGS ]=======");
            System.out.println("[MENU]       Enter  a  Number    ");
            System.out.println("[MENU]        [1] Change Name (" + data.username.getInput() + ")");
            System.out.println("[MENU]        [2] Back           ");
            System.out.println("[MENU] ==========================");

            data.stringUserInput = data.userInput.nextLine();

            if (data.stringUserInput.equals("1")) {
                System.out.println("[WORKER] Please Enter your new name");
                nameData();
            } else if (data.stringUserInput.equals("2")) {
                break;
            }
        }
    }

    public static void option5() {
        // system exit
        System.out.println("[SUB] Are you sure you want to quit the game? Y/N");

        while (true) {
            data.stringUserInput = data.userInput.nextLine();
            data.conditions.setInput(data.stringUserInput);

            if (data.conditions.getInput().equalsIgnoreCase("N")) {
                break;
            } else if (data.conditions.getInput().equalsIgnoreCase("Y")) {
                data.userInput.close();
                System.exit(0);
                // FIXME Change main boolean entry point to false of the whileloop to all System.exit
            }
        }
    }

    public static void nameDataIntro() {
        // Intro Setup

        while (data.introName) {
            System.out.println("[WORKER] Please type in your name to proceed or type \"QUIT\" to exit");
            data.stringUserInput = data.userInput.nextLine();
            data.username.setInput(data.stringUserInput);

            if (data.stringUserInput.equalsIgnoreCase("QUIT")) {
                option5();
            }

            while (true) {
                System.out.println("[WORKER] Are you sure your name is " + data.username.getInput() + "? Type Y/N");
                data.stringUserInput = data.userInput.nextLine();
                data.conditions.setInput(data.stringUserInput);

                if (data.conditions.getInput().equalsIgnoreCase("n")) {
                    System.out.println("[WORKER] Please type your name again");
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

            System.out.println("[WORKER] Are you sure your name is " + data.username.getInput() + "? Type Y/N");
            data.stringUserInput = data.userInput.nextLine();
            data.conditions.setInput(data.stringUserInput);

            if (data.stringUserInput.equalsIgnoreCase("QUIT")) {
                System.out.println("[WORKER] Alright! Closing terminal program");
                System.exit(0);
            } else if (data.stringUserInput.equalsIgnoreCase("n")) {
                System.out.println("[WORKER] Please type in your name to proceed");
            } else {
                break;
            }
        }
    }

}
