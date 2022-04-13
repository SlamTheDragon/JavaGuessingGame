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
import java.net.URISyntaxException;
import java.awt.GraphicsEnvironment;


public class guesstheword {

    public static void main( String[] args ) throws URISyntaxException, InterruptedException {
        
        //terminal initializer

        Console console = System.console();
        String dir = guesstheword.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath();
        String jarName = dir.substring(dir.lastIndexOf("/") + 1);
        if (console == null && !GraphicsEnvironment.isHeadless()) {
            try {
                Runtime.getRuntime().exec(new String[] { "cmd", "/c", "start", "cmd", "/k", "java -jar " + jarName});
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            entry.main(new String[0]);
            kill();
        }
    }

    public static void kill() {
        try {
            Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
