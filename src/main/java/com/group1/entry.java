package com.group1;

import com.group1.data.lang.consoleLog;
import com.group1.data.program.data;


public class entry {
    public static void main(String[] strings) {

        //===[ INTRO ]===

        consoleLog.intro1();
        menu.nameDataIntro();

        //===[ MAIN MENU ]===

        while (true) {
            menu.main(new String[0]);

            if (!data.globalRun) {
                data.userInput.close();
                break;
            }
            
            //debug
            consoleLog.triggerRestart();

            data.stringUserInput = "";
            data.score = 0;
            data.username.setInput(data.stringUserInput);
            data.conditions.setInput(data.stringUserInput);
            data.introName = true;
            data.globalRun = true;

            //re-intro
            consoleLog.intro1();
            menu.nameDataIntro();
            consoleLog.intro2();
            data.userInput.nextLine();
        }

        data.userInput.close();
    }
}