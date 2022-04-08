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

    // initialization of Scanner
    private static Scanner userInput = new Scanner(System.in);

    // initialization of object class referenced as userdata
    private static userdata username = new userdata();
    private static userdata conditions = new userdata();
    // userdata answers = new userdata();

    // String Initialization
    private static String stringUserInput;

    // int initialization
    private static int score = 100;

    // boolean Initialization


    private static void menu() throws InputMismatchException {
        
        while (true) {
            System.out.println("[MENU] =======[MAIN MENU]=======");
            System.out.println("[MENU]      Enter  a  Number    ");
            System.out.println("[MENU]       [1] Play Game      ");
            System.out.println("[MENU]       [2] Mechanics      ");
            System.out.println("[MENU]       [3] Prev Score     ");
            System.out.println("[MENU]       [4] Quit Game      ");
            System.out.println("[MENU] =========================");
            //add option 5 for settings for :name change


            stringUserInput = userInput.nextLine();

            if (stringUserInput.equals("1")) {
                option1();
            } else if (stringUserInput.equals("2")) {
                option2();
            } else if (stringUserInput.equals("3")) {
                option3();
            } else if (stringUserInput.equals("4")) {
                option4();
            } else if (stringUserInput.equals("0")) {
                break;
            }
        }

    }

    private static void option1() {
        while (true) {
            // category selector here
            break;
        }
    }

    private static void option2() {
        System.out.println("[WORKER] Mechanics Here.");
        System.out.println("[WORKER] Type \"BACK\" to go back or type \"QUIT\" to quit the game");
        while (true) {
            stringUserInput = userInput.nextLine();
            if (stringUserInput.equalsIgnoreCase("BACK")) {
                break;
            } else if (stringUserInput.equalsIgnoreCase("QUIT")) {
                option4();
            }
        }
    }

    private static void option3() {
        // none
    }

    private static void option4() {
        System.out.println("[WORKER] Are you sure you want to quit the game? Y/N");

        while (true) {
            stringUserInput = userInput.nextLine();
            if (stringUserInput.equalsIgnoreCase("N")) {
                break;
            } else if (stringUserInput.equalsIgnoreCase("Y")) {
                userInput.close();
                System.exit(0);
            }
        }
    }


    public static void main(String[] args) {

        
        //===[ INTRO ]===

        System.out.println("[MAIN THREAD] Welcome to...");
        System.out.println("[MAIN THREAD] ============================\n[MAIN THREAD] =                          =\n[MAIN THREAD] =      GUESS THE WORD      =\n[MAIN THREAD] =                          =\n[MAIN THREAD] ====[ Terminal Edition ]====");
        System.out.println("[MAIN THREAD] Please type in your name to proceed or type \"QUIT\" to exit");
        
        while (true) {
            stringUserInput = userInput.nextLine();
            username.setInput(stringUserInput);

            System.out.println("[MAIN THREAD] Are you sure your name is " + username.getInput() + "? Type Y/N");
            stringUserInput = userInput.nextLine();
            conditions.setInput(stringUserInput);

            if (stringUserInput.equalsIgnoreCase("QUIT")){
                System.out.println("[MAIN THREAD] Alright! Closing terminal program");
                System.exit(0);
            } else if (stringUserInput.equalsIgnoreCase("n")) {
                System.out.println("[MAIN THREAD] Please type your name again");
            } else {
                break;
            }
        }

        System.out.println("[MAIN THREAD] Hello " + username.getInput());
        System.out.println("[MAIN THREAD] Welcome to the the Guess The Word - Terminal Edition v1.1");
        System.out.println("[MAIN THREAD] Press Enter to continue");
        userInput.nextLine();


        //===[ MAIN MENU ]===

        while (true) {
            menu();

            //debug
            System.out.println("[MAIN THREAD] Program unexpectedly closed");
            System.out.println("[MAIN THREAD] Restarting");
            stringUserInput = "";
            score = 100;
            username.setInput(stringUserInput);
            conditions.setInput(stringUserInput);
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