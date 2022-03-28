/*
CP3 - Java Guessing Game

By Group 1

Members:
Asanas, Derfel John S.
Ryan Paul Escobidal
Nacar Heartlie
Iresh
*/

package guessTheWord;

import java.util.Scanner;
//import java.util.Random;
//import guessTheWord.ProgramData.answers;
//import guessTheWord.ProgramData.questions;

public class main {
    public static void main(String[] args) {
        //initialization of Scanner
        Scanner userInput = new Scanner(System.in);


        //object class (userdata; "name")
        userdata username = new userdata();
        //userdata answers = new userdata();


        //String Initialization
        String stringUserInput;


        //int initialization
        int score = 100;

        

        
        //===[ INTRO ]===
        System.out.println("[WORKER] Welcome to...");
        System.out.println("[WORKER] ============================\n[WORKER] =                          =\n[WORKER] =      GUESS THE WORD      =\n[WORKER] =                          =\n[WORKER] ====[ Terminal Edition ]====");
        System.out.println("[WORKER] Please type in your name to proceed or type \"QUIT\" to exit");

        
        stringUserInput = userInput.nextLine();
        username.setInput(stringUserInput);

        if (stringUserInput.equals("QUIT")){
            System.out.println("[WORKER] Alright! Closing terminal program");
            System.exit(0);
        }

        System.out.println("[WORKER] Hello " + username.getInput());
        System.out.println("[WORKER] Welcome to the the Guess The Word - Terminal Edition v1.1");
        System.out.println("[WORKER] Press Enter to continue");
        userInput.nextLine();


        //===[ MAIN MENU ]===



        userInput.close();
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