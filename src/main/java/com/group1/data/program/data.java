package com.group1.data.program;
import java.util.Scanner;
import java.util.Random;

public class data {
    // initialization of Scanner
    public static final Scanner userInput = new Scanner(System.in);

    // initialization of Randomizer
    public static final Random id = new Random();

    // initialization of object class referenced as userdata
    public static final userdata username = new userdata();
    public static final userdata conditions = new userdata();
    // FIXME userdata answers = new userdata();

    // Variables Initialization
    public static String stringUserInput, qCategory;
    public static int menuBreakCounter, subMenuBreakCounter, qScore, qCorrect, qAttempt, qAverageAttempt, randomInt, questionIndex;
    public static int upperbound = 50;
    public static int upperboundRand = 200; // TODO for random quiz

    public static boolean introName = true;
    public static boolean globalRun = true;

    public static boolean menuBreak = true;
    public static boolean introLoop = true;
    public static boolean intro = true;
    public static boolean subLoop = true;
    public static boolean exitMenu = true;
    public static boolean hasTakenQuiz = false; // TODO change this to true after quiz
}
