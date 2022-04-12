package com.group1.data.program;
import java.util.Scanner;

public class data {
    // initialization of Scanner
    public static final Scanner userInput = new Scanner(System.in);

    // initialization of object class referenced as userdata
    public static final userdata username = new userdata();
    public static final userdata conditions = new userdata();
    // userdata answers = new userdata();

    // Variables Initialization
    public static String stringUserInput;
    public static int score;

    public static int menuBreakCounter, subMenuBreakCounter;

    public static boolean introName = true;
    public static boolean globalRun = true;

    public static boolean menuBreak = true;
    public static boolean introLoop = true;
    public static boolean intro = true;
    public static boolean subLoop = true;
    public static boolean exitMenu = true;
}
