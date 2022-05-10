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
        data.isReplay = false;
        data.isTakingName = true;
        data.isRandom = false;
        data.isReplay = false;
        data.iCorrect = false;

        data.menuBreakCounter = 0;
        data.subMenuBreakCounter = 0;
        data.qScore = 100;
        data.qCorrect = 0;
        data.qAttempt = 0;
        data.qAverageAttempt = 0;

        data.startTime = 0;
        data.endTime = 0;
        data.minutes = 0;
        data.seconds = 0;
        data.timeElapsed = 0;

        data.username.setInput(data.stringUserInput);
        data.conditions.setInput(data.stringUserInput);
    }

    public static void exit() {
        data.menuBreak = false;
        data.globalRun = false;
        data.exitMenu = false;
        data.introLoop = false;
        data.introName = false;
        data.innerLoop = false;
        data.reLoop = false;
    }
}
