package com.group1;

import com.group1.data.lang.consoleprint;
import com.group1.data.program.data;
// TODO import java.util.Random;



public class entry {
    public static void main(String[] strings) {

        //===[ INTRO ]===

        consoleprint.intro1();
        menu.nameDataIntro();
        consoleprint.intro2();
        data.userInput.nextLine();

        //===[ MAIN MENU ]===

        while (true) {
            menu.main(new String[0]);

            //debug
            System.out.println("[MAIN THREAD] Program Reset Detected");
            System.out.println("[MAIN THREAD] Restarting");
            data.stringUserInput = "";
            data.score = 100;
            data.username.setInput(data.stringUserInput);
            data.conditions.setInput(data.stringUserInput);
            data.introName = true;

            //re-intro
            consoleprint.intro1();
            menu.nameDataIntro();
            consoleprint.intro2();
            data.userInput.nextLine();
        }
    }
}