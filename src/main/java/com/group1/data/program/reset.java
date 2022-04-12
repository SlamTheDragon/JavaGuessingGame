package com.group1.data.program;

public class reset {
    public static void dataReset() {
        data.stringUserInput = "";

        data.introName = true;
        data.globalRun = true;
        data.menuBreak = true;
        data.introLoop = true;
        data.intro = true;
        data.subLoop = true;
        data.exitMenu = true;

        data.menuBreakCounter = 0;
        data.subMenuBreakCounter = 0;
        data.score = 0;

        data.username.setInput(data.stringUserInput);
        data.conditions.setInput(data.stringUserInput);
    }
}
