package com.group1.data.lang;
import java.util.concurrent.TimeUnit;
import com.group1.data.program.data;

public class consoleLog {

    // MAIN MESSAGES

    public static void triggerRestart() {
        System.out.println("[MAIN] Program Reset Detected");
        System.out.println("[MAIN] Restarting");
    }

    public static void intro1() {
        System.out.println("[MAIN] Welcome to...");
        System.out.println("[MAIN] ============================\n[MAIN] =                          =\n[MAIN] =      GUESS THE WORD      =\n[MAIN] =                          =\n[MAIN] ====[ Terminal Edition ]====");
    }

    public static void intro2() {
        System.out.println("[MAIN] Hello " + data.username.getInput() + "!");
        System.out.println("[MAIN] Welcome to the the Guess The Word - Terminal Edition v1.1");
        System.out.println("[MAIN] Press Enter to continue");
    }

    // MENUS

    public static void menu() {
        System.out.println("[MENU] =======[MAIN MENU]=======");
        System.out.println("[MENU] ");
        System.out.println("[MENU] Hello and welcome, " + data.username.getInput() + "!");
        System.out.println("[MENU] ");
        System.out.println("[MENU]    Please Enter a Number ");
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
        System.out.println("[MENU]        [2] Info");
        System.out.println("[MENU]        [3] Back           ");
        System.out.println("[MENU] ==========================");
    }

    public static void menuInfo() {
        System.out.println("[MENU] ==========[ INFO ]=========");
        System.out.println("[MENU] ");
        System.out.println("[MENU]      Project by GRP1");
        System.out.println("[MENU] ");
        System.out.println("[MENU]      Leader: ASANAS");
        System.out.println("[MENU]      Members:");
        System.out.println("[MENU]      - Ryan, Escobidal");
        System.out.println("[MENU]      - Nacar, Heartlie");
        System.out.println("[MENU]      - Iresh");
        System.out.println("[MENU] ");
        System.out.println("[MENU]  [Press enter to continue] ");
        System.out.println("[MENU] ===========================");
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
        System.out.println("[MENU]         [3] Animals       ");
        System.out.println("[MENU]         [4] Names         ");
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
        System.out.println("[QUIZ] ======[ QUIZ HAS ENDED ]======");
        System.out.println("[QUIZ]   Awesome! Here is your final ");
        System.out.println("[QUIZ]           quiz stats          ");
        System.out.println("[QUIZ] ");
        System.out.println("[QUIZ]    You have guessed: " + data.qCorrect + "/5");
        System.out.println("[QUIZ]    words correctly!         ");
        System.out.println("[QUIZ] ");
        System.out.println("[QUIZ]    And you got a total score");
        System.out.println("[QUIZ]    of " + data.qScore + "/100");
        System.out.println("[QUIZ] ");
        System.out.println("[QUIZ]    Your average attempts to ");
        System.out.println("[QUIZ]    guess the word correctly ");
        System.out.println("[QUIZ]    is " + data.qAverageAttempt);
        System.out.println("[QUIZ] ");
        System.out.println("[QUIZ]    It took you " + data.minutes + "m and " + data.seconds + "s");
        System.out.println("[QUIZ]    to finish the quiz");
        System.out.println("[QUIZ] ");
        System.out.println("[QUIZ]     [1] Play again          ");
        System.out.println("[QUIZ]     [2] Back to Main Menu   ");
        System.out.println("[QUIZ] ==============================");
    }

    public static void menuQuizEnd2() {
        System.out.println("[QUIZ] ======[ QUIZ HAS ENDED ]======");
        System.out.println("[QUIZ]   Quiz was interrupted by you ");
        System.out.println("[QUIZ] ");
        System.out.println("[QUIZ]      Try again... perhaps?");
        System.out.println("[QUIZ] ");
        System.out.println("[QUIZ]     [1] Play again          ");
        System.out.println("[QUIZ]     [2] Back to Main Menu   ");
        System.out.println("[QUIZ] ==============================");
    }

    public static void menuPrev() {
        System.out.println("[MENU] ======[ Previous Quiz ]======");
        System.out.println("[MENU]    Name: " + data.username.getInput());
        System.out.println("[MENU]    Score: " + data.qScore + "/100");
        System.out.println("[MENU]    Correct Items: " + data.qCorrect + "/5");
        System.out.println("[MENU]    Average Attempts Taken: " + data.qAverageAttempt);
        System.out.println("[MENU]    Time Taken: " + data.minutes + "m " + data.seconds + "s");
        System.out.println("[MENU] ");
        System.out.println("[MENU]   [Press enter to continue]  ");
        System.out.println("[MENU] =============================");
    }

    // WORKER MESSAGES

    public static void worker1() {
        System.out.println("[WORKER] Please type in your name (8 Characters MAX) to proceed or type \"QUIT\" to exit");
    }

    public static void worker2() {
        System.out.println("[WORKER] Are you sure your name is " + data.username.getInput() + "? Type [Y/N]");
    }

    public static void worker3() {
        System.out.println("[WORKER] Please type your name again");
    }

    public static void worker4() {
        System.out.println("[WORKER] Please Enter your new name (8 Characters MAX)");
    }

    public static void worker5() {
        System.out.println("[WORKER] You haven't taken a quiz yet!");
        System.out.println("[WORKER] Press enter to continue");
    }

    // QUIZ MESSAGES

    private static void trippleDot() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(333);
        System.out.print(".");
        TimeUnit.MILLISECONDS.sleep(333);
        System.out.print(".");
        TimeUnit.MILLISECONDS.sleep(333);
        System.out.print(".");
    }

    private static void quizIntroHasntTakenQuiz() throws InterruptedException {
        System.out.println("[QUIZ] Welcome welcome, " + data.username.getInput() + "!");
        TimeUnit.MILLISECONDS.sleep(800);
        System.out.println("[QUIZ] And welcome to...");
    }

    private static void quizIntroHasTakenQuiz() throws InterruptedException {
        System.out.println("[QUIZ] Hello again, " + data.username.getInput() + "!");
        TimeUnit.MILLISECONDS.sleep(800);
        System.out.println("[QUIZ] We're back to...");
    }

    private static void quizIntroHasnt2() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(800);
        System.out.println("\n[QUIZ] " + data.username.getInput() + ", you're quite excited to play this game aren't you?");
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.println("[QUIZ] Well of course... But just a short reminder, if you wanna cancel the quiz anytime, either enter \"X\" or \"QUIT\" (except you'll get deducted if you'll continue)");
        System.out.println("[QUIZ] You may press enter to continue...");
    }

    private static void quizIntroHas2() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(800);
        System.out.println("\n[QUIZ] " + data.username.getInput() + ", I bet you like more challenges aren't you?");
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.println("[QUIZ] I've already told you this but just a reminder, \"X\" or \"QUIT\" to exit your way in this... quiz");
        System.out.println("[QUIZ] You may press enter to continue...");
    }

    public static void quizIntro1() throws InterruptedException {

        if (!data.hasTakenQuiz) {
            quizIntroHasntTakenQuiz();
        } else {
            quizIntroHasTakenQuiz();
        }

        System.out.println("[QUIZ] ===========[ GUESS THE WORD ]===========");
        System.out.println("[QUIZ] ");
        System.out.println("[QUIZ]           THE ULTIMATE QUIZ...");
        System.out.println("[QUIZ]          OF THE CATEGORY \"" + data.qCategory + "\"");
        System.out.println("[QUIZ] ");
        System.out.println("[QUIZ]              (I guess...?)");
        System.out.println("[QUIZ] ");
        System.out.println("[QUIZ] ========================================");
        TimeUnit.MILLISECONDS.sleep(1000);
        System.out.print("[QUIZ] I am the quiz master, and you're");
        trippleDot();
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.print(" the player.");

        if (!data.hasTakenQuiz) {
            quizIntroHasnt2();
        } else {
            quizIntroHas2();
        }

        data.userInput.nextLine();

        System.out.println("[QUIZ] Alright!");
        TimeUnit.MILLISECONDS.sleep(800);
        System.out.print("[QUIZ] We");
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.print(" shall");
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.print(" begin");
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.print(" in...");
        TimeUnit.MILLISECONDS.sleep(700);
        System.out.print(" 3");
        trippleDot();
        System.out.print(" 2");
        trippleDot();
        System.out.print(" 1");
        trippleDot();
        System.out.println("\n[QUIZ] =============[ BEGIN ]=============");
    }

    public static void qLog1() {
        System.out.println(quizLog.quizQuestion[data.randomQLogInt]);
    }

    public static void qLog2() {
        System.out.print(quizLog.quizWrong[data.randomQLogInt]);
    }

    public static void qLog3() {
        System.out.println(quizLog.quizEnds[data.randomQLogInt]);
    }

    public static void qLogCorrect() {
        System.out.println("\n[QUIZ] =============[ CORRECT ]=============");
    }

    public static void qLogIncorrect() {
        System.out.println("\n[QUIZ] =============[ INCORRECT ]=============");
    }

    public static void qLogIncorrectExceeded() {
        System.out.println("\n[QUIZ] Oops... you ran out of attempts");
    }

    // SUB MESSAGES

    public static void subRestart() {
        System.out.println("[SUB] Are you sure you would like to restart the program? [Y]");
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
        System.out.println("[SUB]   - You are given five attempts");
        System.out.println("[SUB]     to answer a question");
        System.out.println("[SUB]     correctly, however, for each");
        System.out.println("[SUB]     incorrect answer you'll");
        System.out.println("[SUB]     receive a deduction of 4");
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

    public static void interruptQuiz() {
        System.out.println("[SUB] Would you like to cancel the quiz? Any progress will be lost (enter \"Y\" to exit or press enter to continue)");
    }

    // ERRORS

    public static void errMismatch1() throws InterruptedException {
        System.out.println("[ERROR] Please enter the correct items shown above!");
        TimeUnit.MILLISECONDS.sleep(500);
    }

    public static void errMismatch2() throws InterruptedException {
        System.out.println("[ERROR] Please specify the correct keyword!");
        TimeUnit.MILLISECONDS.sleep(500);
    }

    public static void errMismatch3() throws InterruptedException {
        System.out.println("[ERROR] Please choose a correct option!");
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

    public static void errExceeded3() throws InterruptedException {
        System.out.println("[ERROR] Exceeded mismatch attempts, skipping setup");
        TimeUnit.MILLISECONDS.sleep(500);
    }

    public static void errSomethingWentWrong() throws InterruptedException {
        // Unused | Keep it for future use
        System.out.println("[ERROR] Something went wrong, restarting program");
        TimeUnit.MILLISECONDS.sleep(500);
    }

    public static void errEmptyInput() throws InterruptedException {
        System.out.println("[ERROR] You haven't typed anything, please try again!");
        TimeUnit.MILLISECONDS.sleep(500);
    }
}
