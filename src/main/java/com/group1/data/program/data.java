package com.group1.data.program;
import java.util.Scanner;
import java.util.Random;

public class data {
    // initialization of Scanner
    public static final Scanner userInput = new Scanner(System.in);

    // initialization of Randomizer
    public static final Random id = new Random();
    public static final Random qLog = new Random();


    // initialization of object class referenced as userdata

    // object username storage
    public static final userdata username = new userdata();
    // object conditions (for options Y/N)
    public static final userdata conditions = new userdata();
    // object answers (for answers)
    public static final userdata answers = new userdata();


    // Variables Initialization

    // main userinput to be passed to any object | category container for category selection
    public static String stringUserInput, qCategory;
    public static String[] ansArray;

    // while loops and quiz ints
    public static int menuBreakCounter, subMenuBreakCounter, randomInt, randomQLogInt, questionIndex, iCheck, qAttemptsLeft;
    // normal mode randomizer limit
    public static int upperbound = 50;
    // random mode randomizer limit
    public static int upperboundRand = 200;
    // random entertainment message selector 
    public static int upperboundQLog = 5;
    // Score
    public static int qScore = 100;
    // Correct items
    public static int qCorrect = 0;
    // Attempts Taken
    public static int qAttempt = 0;
    // Average attempts taken
    public static int qAverageAttempt = 0;

    // longs for quiz timer
    public static long startTime, endTime, minutes, seconds, timeElapsed;

    // Booleans for while blocks
    public static boolean introName = true;
    public static boolean globalRun = true;

    // Essentials
    public static boolean intro = true;
    public static boolean introLoop = true;
    public static boolean subLoop = true;
    public static boolean menuBreak = true;
    public static boolean exitMenu = true;
    public static boolean hasTakenQuiz = false;
    public static boolean isReplay = false;
    public static boolean isTakingName = true;
    public static boolean innerLoop = true;
    public static boolean reLoop = true;
    public static boolean isRandom = false;
    public static boolean iCorrect = false; 
}
