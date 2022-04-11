package com.group1.data.lang;

import com.group1.data.program.data;

public class consoleprint {

    public static void intro1() {
        System.out.println("[MAIN THREAD] Welcome to...");
        System.out.println("[MAIN THREAD] ============================\n[MAIN THREAD] =                          =\n[MAIN THREAD] =      GUESS THE WORD      =\n[MAIN THREAD] =                          =\n[MAIN THREAD] ====[ Terminal Edition ]====");
    }

    public static void intro2() {
        System.out.println("[MAIN THREAD] Hello " + data.username.getInput());
        System.out.println("[MAIN THREAD] Welcome to the the Guess The Word - Terminal Edition v1.1");
        System.out.println("[MAIN THREAD] Press Enter to continue");
    }
}
