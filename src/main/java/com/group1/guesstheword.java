// ========================
// CP3 - Java Guessing Game
// By Group 1
// ========================

// MEMBERS:
// - Asanas, Derfel John S.
// - Ryan Paul Escobidal
// - Nacar Heartlie
// - Iresh

package com.group1;
import java.io.*;
import java.awt.GraphicsEnvironment;

public class guesstheword {

    public static void main( String[] args ) {
        
        //terminal initializer

        Console console = System.console();
        if (console == null && !GraphicsEnvironment.isHeadless()) {
            String filename = guesstheword.class.getProtectionDomain().getCodeSource().getLocation().toString().substring(6);
            try {
                Runtime.getRuntime()
                        .exec(new String[] { "cmd", "/c", "start", "cmd", "/k", "java -jar \"" + filename + "\"" });
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            entry.main(new String[0]);
            System.out.println("Program has ended, please type 'exit' to close the console");
        }

    }
}

