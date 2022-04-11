package com.group1.data.lang;

import com.group1.data.program.data;

public class consoleLog {

    // MESSAGES

    public static void triggerRestart() {
        System.out.println("[MAIN THREAD] Program Reset Detected");
        System.out.println("[MAIN THREAD] Restarting");
    }

    public static void intro1() {
        System.out.println("[MAIN THREAD] Welcome to...");
        System.out.println("[MAIN THREAD] ============================\n[MAIN THREAD] =                          =\n[MAIN THREAD] =      GUESS THE WORD      =\n[MAIN THREAD] =                          =\n[MAIN THREAD] ====[ Terminal Edition ]====");
    }

    public static void intro2() {
        System.out.println("[MAIN THREAD] Hello " + data.username.getInput());
        System.out.println("[MAIN THREAD] Welcome to the the Guess The Word - Terminal Edition v1.1");
        System.out.println("[MAIN THREAD] Press Enter to continue");
    }

    // MENUS

    public static void menu() {
        System.out.println("[MENU] =======[MAIN MENU]=======");
        System.out.println("[MENU]      Enter  a  Number    ");
        System.out.println("[MENU]       [1] Play Game      ");
        System.out.println("[MENU]       [2] Mechanics      ");
        System.out.println("[MENU]       [3] Prev Score     ");
        System.out.println("[MENU]       [4] Settings       ");
        System.out.println("[MENU]       [5] Quit Game      ");
        System.out.println("[MENU] =========================");
    }

    public static void menuSettings() {
        System.out.println("[MENU] =======[ SETTINGS ]=======");
        System.out.println("[MENU]       Enter  a  Number    ");
        System.out.println("[MENU]        [1] Change Name (" + data.username.getInput() + ")");
        System.out.println("[MENU]        [2] Back           ");
        System.out.println("[MENU] ==========================");
    }

    // WORKER MESSAGES

    public static void worker1() {
        System.out.println("[WORKER] Please type in your name to proceed or type \"QUIT\" to exit");
    }

    public static void worker2() {
        System.out.println("[WORKER] Are you sure your name is " + data.username.getInput() + "? Type [Y/N]");
    }

    public static void worker3() {
        System.out.println("[WORKER] Please type your name again");
    }

    public static void worker4() {
        System.out.println("[WORKER] Please Enter your new name");
    }

    // SUB MESSAGES

    public static void subRestart() {
        System.out.println("[SUB] Are you sure you would like to restart the program? [Y/N]");
    }

    public static void subMech() {
        System.out.println("[SUB] Mechanics Here.");
        
    }

    public static void subOptions1() {
        System.out.println("[SUB] Type \"BACK\" to go back or type \"QUIT\" to quit the game");
    }

    public static void subExit() {
        System.out.println("[SUB] Are you sure you want to quit the game? [Y/N]");
    }

    // ERRORS

    public static void errMismatch1() {
        System.out.println("[ERROR] Please enter a number only!");
    }

    public static void errExceeded() {
        System.out.println("[ERROR] Exceeded mismatch attempts, closing program");
    }
}
