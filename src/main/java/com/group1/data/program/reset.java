package com.group1.data.program;

public class reset {
    public static void dataReset() {
        data.stringUserInput = null;
        data.qCategory = null;

        data.introName = true;
        data.globalRun = true;
        data.menuBreak = true;
        data.introLoop = true;
        data.intro = true;
        data.subLoop = true;
        data.exitMenu = true;
        data.hasTakenQuiz = false;

        data.menuBreakCounter = 0;
        data.subMenuBreakCounter = 0;
        data.qScore = 0;
        data.qCorrect = 0;
        data.qAttempt = 0;
        data.qAverageAttempt = 0;

        data.username.setInput(data.stringUserInput);
        data.conditions.setInput(data.stringUserInput);
    }
}
