/*
========================
CP3 - Java Guessing Game
By Group 1
========================

MEMBERS:
- Asanas, Derfel John S.
- Ryan Paul Escobidal
- Nacar Heartlie
- Iresh
*/

package guessTheWord;

import java.util.InputMismatchException;
import java.util.Scanner;
//import java.util.Random;
//import guessTheWord.ProgramData.answers;
//import guessTheWord.ProgramData.questions;

public class main {
    public static void main(String[] args) {
        //initialization of Scanner
        Scanner userInput = new Scanner(System.in);


        //initialization of object class referenced as userdata
        userdata username = new userdata();
        userdata conditions = new userdata();
        //userdata answers = new userdata();
        intUserdata intInput = new intUserdata();


        //String Initialization
        String stringUserInput;
        int intUserInput;

        //int initialization
        int score = 100;

        //boolean Initialization
        boolean catchloop;

        
        //===[ INTRO ]===

        System.out.println("[WORKER] Welcome to...");
        System.out.println("[WORKER] ============================\n[WORKER] =                          =\n[WORKER] =      GUESS THE WORD      =\n[WORKER] =                          =\n[WORKER] ====[ Terminal Edition ]====");
        System.out.println("[WORKER] Please type in your name to proceed or type \"QUIT\" to exit");

        while (true) {
            stringUserInput = userInput.nextLine();
            username.setInput(stringUserInput);
            System.out.println("[WORKER] Are you sure your your name is " + username.getInput() + "? Type Y/N");
            stringUserInput = userInput.nextLine();
            conditions.setInput(stringUserInput);

            if (stringUserInput.equals("QUIT")){
                System.out.println("[WORKER] Alright! Closing terminal program");
                System.exit(0);
            } else if (stringUserInput.equalsIgnoreCase("n")) {
                System.out.println("[WORKER] Please type your name again");
            } else {
                break;
            }
        }

        System.out.println("[WORKER] Hello " + username.getInput());
        System.out.println("[WORKER] Welcome to the the Guess The Word - Terminal Edition v1.1");
        System.out.println("[WORKER] Press Enter to continue");
        userInput.nextLine();


        //===[ MAIN MENU ]===

        while (true) {
            System.out.println("[MENU] =======[MAIN MENU]=======");
            System.out.println("[MENU]      Enter  a  Number    ");
            System.out.println("[MENU]       [1] Play Game      ");
            System.out.println("[MENU]       [2] Mechanics      ");
            System.out.println("[MENU]       [3] Prev Score     ");
            System.out.println("[MENU]       [4] Quit Game      ");
            System.out.println("[MENU] =========================");


            /*
            
            LEAKS FOUND IN WHILE LOOPS
            
            Description:
            idk how to stop it

            */

            catchloop = true;

            while (catchloop) {
                try {
                    intUserInput = userInput.nextInt();
                    intInput.setInt(intUserInput);
                    catchloop = false;
                } catch (InputMismatchException ignore) {
                    System.out.println("[ERROR] Please enter a number only");
                    catchloop = false;
                }
            }


            if  (intInput.getInt() == 1) {

                while (true) {
                    //category selector here
                    break;
                }

            }
            else if (intInput.getInt() == 2) {
                System.out.println("[WORKER] Mechanics.");
                System.out.println("[WORKER] Type \"BACK\" to go back or type \"QUIT\" to quit the game");
                while (true) {
                    stringUserInput = userInput.nextLine();
                    if (stringUserInput.equalsIgnoreCase("BACK")) {
                        break;
                    } else if (stringUserInput.equalsIgnoreCase("QUIT")) {
                        System.out.println("[WORKER] Are you sure you want to quit the game? Y/N");
                        while (true) {
                            stringUserInput = userInput.nextLine();
                            if (stringUserInput.equalsIgnoreCase("Y")) {
                                System.exit(0);
                            } else {
                                break;
                            }
                        }
                    }
                }
            }
            else if (intInput.getInt() == 3) {
                //get previous score
            }
            else if (intInput.getInt() == 4) {
                System.out.println("[WORKER] Are you sure you want to quit the game? Y/N");
                while (true) {
                    stringUserInput = userInput.nextLine();
                    if (stringUserInput.equalsIgnoreCase("N")) {
                        return;
                    } else if (stringUserInput.equalsIgnoreCase("Y")) {
                        userInput.close();
                        System.exit(0);
                    }
                }
            }
        }
    }
}

class userdata {
    private String input;

    public String getInput() {
        return this.input;
    }
    
    public void setInput(String input) {
        this.input = input;
    }
}

class intUserdata {
    private int intinput;

    public int getInt() {
        return this.intinput;
    }

    public void setInt(int intinput) {
        this.intinput = intinput;
    }
}