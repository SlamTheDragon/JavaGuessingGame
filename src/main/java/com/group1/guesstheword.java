/*========================
CP3 - Java Guessing Game
By Group 1
========================

MEMBERS:
- Asanas, Derfel John S.
- Ryan Paul Escobidal
- Nacar Heartlie
- Iresh*/

package com.group1;
import java.io.*;


public class guesstheword {
    // Start
    public static void main( String[] args ) throws InterruptedException {
        System.out.println("Starting Terminal Game: GuessTheWord v1.1.28 by Group 1");
        entry.main(new String[0]);
    }

    // exe process killer
    public static void kill() {
        try {
            Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
