package com.group1;

import com.group1.data.lang.consoleLog;
import com.group1.data.program.data;
import com.group1.data.program.reset;


public class entry {
    public static void main(String[] args) {

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
            reset.dataReset();
            
            //re-intro
            consoleLog.intro1();
            menu.nameDataIntro();
        }

        data.userInput.close();
    }
}
