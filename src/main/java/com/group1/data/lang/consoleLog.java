package com.group1.data.lang;
import java.util.concurrent.TimeUnit;

import com.group1.data.program.data;

public class consoleLog {

    // MAIN MESSAGES

    public static void triggerRestart() {
        System.out.println("[MAIN THREAD] Program Reset Detected");
        System.out.println("[MAIN THREAD] Restarting");
    }

    public static void intro1() {
        System.out.println("[MAIN THREAD] Welcome to...");
        System.out.println("[MAIN THREAD] ============================\n[MAIN THREAD] =                          =\n[MAIN THREAD] =      GUESS THE WORD      =\n[MAIN THREAD] =                          =\n[MAIN THREAD] ====[ Terminal Edition ]====");
    }

    public static void intro2() {
        System.out.println("[MAIN THREAD] Hello " + data.username.getInput());
        System.out.println("[MAIN THREAD] Welcome to the the Guess The Word - Terminal Edition v1.1");
        System.out.println("[MAIN THREAD] Press Enter to continue");
    }

    // MENUS

    public static void menu() {
        System.out.println("[MENU] =======[MAIN MENU]=======");
        System.out.println("[MENU]      Enter  a  Number    ");
        System.out.println("[MENU]       [1] Play Game      ");
        System.out.println("[MENU]       [2] Mechanics      ");
        System.out.println("[MENU]       [3] Prev Score     ");
        System.out.println("[MENU]       [4] Settings       ");
        System.out.println("[MENU]       [5] Quit Game      ");
        System.out.println("[MENU] =========================");
    }

    public static void menuSettings() {
        System.out.println("[MENU] =======[ SETTINGS ]=======");
        System.out.println("[MENU]       Enter  a  Number    ");
        System.out.println("[MENU]        [1] Change Name (" + data.username.getInput() + ")");
        System.out.println("[MENU]        [2] Back           ");
        System.out.println("[MENU] ==========================");
    }

    public static void menuQuiz() {
        System.out.println("[MENU] =======[ START QUIZ ]=======");
        System.out.println("[MENU]        Enter a Number       ");
        System.out.println("[MENU]   [1] Select a category     ");
        System.out.println("[MENU]   [2] Back                  ");
        System.out.println("[MENU] ============================");
    }

    public static void menuCategory() {
        System.out.println("[MENU] ======[ START QUIZ ]======");
        System.out.println("[MENU]      Select a Category    ");
        System.out.println("[MENU]         [1] Place         ");
        System.out.println("[MENU]         [2] Things        ");
        System.out.println("[MENU]         [3] Names         ");
        System.out.println("[MENU]         [4] Animals       ");
        System.out.println("[MENU]         [5] Random        ");
        System.out.println("[MENU]         [6] Back          ");
        System.out.println("[MENU] ==========================");
    }

    public static void menuQuizStart() {
        System.out.println("[MENU] ==========[ START QUIZ ]==========");
        System.out.println("[MENU]   You're about to start the quiz  ");
        System.out.println("[MENU]   about: \"" + data.qCategory + "\"");
        System.out.println("[MENU]             [1] Start             ");
        System.out.println("[MENU]             [2] Cancel            ");
        System.out.println("[MENU] ==================================");
    }

    public static void menuQuizEnd() {
        System.out.println("[MENU] ======[ QUIZ HAS ENDED ]======");
        System.out.println("[MENU]   Awesome! Here is your final ");
        System.out.println("[MENU]           quiz stats          ");
        System.out.println("[MENU] ");
        System.out.println("[MENU]      You have guessed: " + data.qCorrect + "/5");
        System.out.println("[MENU]      words correctly!         ");
        System.out.println("[MENU] ");
        System.out.println("[MENU]      And you got a total score");
        System.out.println("[MENU]      of " + data.qScore + "/100");
        System.out.println("[MENU] ");
        System.out.println("[MENU]      Your average attempts to ");
        System.out.println("[MENU]      guess the word correctly ");
        System.out.println("[MENU]      is " + data.qAverageAttempt);
        System.out.println("[MENU] ");
        System.out.println("[MENU]       [1] Play again          ");
        System.out.println("[MENU]       [2] Back to Main Menu   ");
        System.out.println("[MENU] ==============================");
    }

    public static void menuPrev() {
        System.out.println("[MENU] ======[ Previous Quiz ]======");
        System.out.println("[MENU]      Score: " + data.qScore + "/100");
        System.out.println("[MENU]      Correct Items: " + data.qCorrect + "/5");
        System.out.println("[MENU]      Average Attempts Taken: " + data.qAverageAttempt);
        System.out.println("[MENU] ");
        System.out.println("[MENU]            [1] Back          ");
        System.out.println("[MENU] =============================");
    }

    // WORKER MESSAGES

    public static void worker1() {
        System.out.println("[WORKER] Please type in your name to proceed or type \"QUIT\" to exit");
    }

    public static void worker2() {
        System.out.println("[WORKER] Are you sure your name is " + data.username.getInput() + "? Type [Y/N]");
    }

    public static void worker3() {
        System.out.println("[WORKER] Please type your name again");
    }

    public static void worker4() {
        System.out.println("[WORKER] Please Enter your new name");
    }

    public static void worker5() {
        System.out.println("[WORKER] You haven't taken a quiz yet!");
        System.out.println("[WORKER] Press enter to continue");
    }

    // SUB MESSAGES

    public static void subRestart() {
        System.out.println("[SUB] Are you sure you would like to restart the program? [Y/N]");
    }

    public static void subMech() {
        System.out.println("[SUB] =======[ GAME MECHANICS ]=======");
        System.out.println("[SUB] Hello " + data.username.getInput() + "!");
        System.out.println("[SUB] Here are the game mechanics for");
        System.out.println("[SUB] you to read!");
        System.out.println("[SUB]");
        System.out.println("[SUB]   - There are 5 random ");
        System.out.println("[SUB]     questions given under the");
        System.out.println("[SUB]     category you have selected");
        System.out.println("[SUB]");
        System.out.println("[SUB]   - In order to win, you must");
        System.out.println("[SUB]     answer all 5 questions");
        System.out.println("[SUB]     correctly");
        System.out.println("[SUB]");
        System.out.println("[SUB]   - a hundred points is given");
        System.out.println("[SUB]     if you are able to complete");
        System.out.println("[SUB]     the quiz without any");
        System.out.println("[SUB]     mistakes!");
        System.out.println("[SUB]");
        System.out.println("[SUB]   - You are given four attempts");
        System.out.println("[SUB]     to answer a question");
        System.out.println("[SUB]     correctly, however, for each");
        System.out.println("[SUB]     incorrect answer you'll");
        System.out.println("[SUB]     receive a deduction of 5");
        System.out.println("[SUB]     points");
        System.out.println("[SUB]     Therefore if you ran out of");
        System.out.println("[SUB]     attempts you'll receive a");
        System.out.println("[SUB]     deduction of 20 points");
        System.out.println("[SUB]");
        System.out.println("[SUB] There ya have it!");
    }

    public static void subOptions1() {
        System.out.println("[SUB] Type \"BACK\" to go back or type \"QUIT\" to quit the game");
    }

    public static void subExit() {
        System.out.println("[SUB] Are you sure you want to quit the game? [Y/N]");
    }

    // ERRORS

    public static void errMismatch1() throws InterruptedException {
        System.out.println("[ERROR] Please enter a number only!");
        TimeUnit.MILLISECONDS.sleep(500);
    }

    public static void errMismatch2() throws InterruptedException {
        System.out.println("[ERROR] Please specify the correct keyword!");
        TimeUnit.MILLISECONDS.sleep(500);
    }

    public static void errExceeded() throws InterruptedException {
        System.out.println("[ERROR] Exceeded mismatch attempts, closing program");
        TimeUnit.MILLISECONDS.sleep(500);
    }
    
    public static void errExceeded2() throws InterruptedException {
        System.out.println("[ERROR] Exceeded mismatch attempts, closing menu");
        TimeUnit.MILLISECONDS.sleep(500);
    }

    public static void errSomethingWentWrong() throws InterruptedException {
        // Unused | Keep it for future use
        System.out.println("[ERROR] Something went wrong, restarting program");
        TimeUnit.MILLISECONDS.sleep(500);
    }
}
