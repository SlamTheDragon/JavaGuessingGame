import java.util.Scanner;
import java.util.concurrent.TimeUnit;
//am I even allowed to use these? xD
//BY DERFEL JOHN S ASANAS, Java Exam Submission

public class guessTheWord {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(
                "Hello there, lets get guessing!\nYou are about to play a game where you should guess the word I am about to explain\nare you in? [Y|N]");
        Scanner introinp = new Scanner(System.in);
        String introans = introinp.nextLine();

        // Wanna play the game?

        if (introans.equals("Y") || introans.equals("y")) {
            // why are we here, just to suffer
            System.out.println("Let's go!");
        } else if (introans.equals("N") || introans.equals("n")) {
            // rather the user has chosen to save more time, good choice
            System.out.println("Okay bye!");
            System.exit(0);
        } else if (introans.equals("|")) {
            // They might be trying to outsmart us
            System.out.println("That's an interesting answer, we're starting!");
        } else {
            // but it seems the user is undecided, their fate has to give them another
            // chance
            System.out.println("That's neither a yes or no... let's start again");
            System.exit(0);
        }

        // Dialogue time!
        System.out.print("Aight");
        TimeUnit.MILLISECONDS.sleep(300);
        System.out.print(".");
        TimeUnit.MILLISECONDS.sleep(300);
        System.out.print(".");
        TimeUnit.MILLISECONDS.sleep(300);
        System.out.print(".");
        TimeUnit.MILLISECONDS.sleep(300);

        System.out.println(
                "\nThere will be three questions, if you answer all of them correctly I'll get perfect exam score\nAnd that's a deal since you wanted to play this game, right?");
        TimeUnit.MILLISECONDS.sleep(5000);
        System.out.println("You'll get 5 attempts per questions. If you fail, you lose several points");
        TimeUnit.MILLISECONDS.sleep(3000);
        System.out.println("Press enter to continue");
        Scanner skip = new Scanner(System.in);
        skip.nextLine();

        // and let the game begin...

        /*
         * =============================================================================
         * ==============================
         * Questions features guessing the word, I would have took the number one if
         * that's the case, this sounds fun
         * =============================================================================
         * ==============================
         */

        // dialogue assignments because SonarLint is bothered so bad
        String pass = "Correct! moving on";
        String fail1 = "Oh no! 'tis a sad day, you failed the 1st question of this test";
        String fail11 = "Oh no! Try again";
        String fail2 = "Welp, see ya next time";
        String fail3 = "I guess";
        String wrong1 = "Incorrect, you have ";
        String wrong2 = " attempts left!";

        // Tries per round assignment
        int questTrial = 5;
        // general score
        int score = 5000;

        // QUESTION 1
        System.out.println("Question 1.. perhaps?\nThis is the first letter in the English alphabet");
        Scanner Question1 = new Scanner(System.in);
        String Question1a;

        while (true) {
            if (Question1.hasNext()) {
                Question1a = Question1.nextLine();
                // ANSWER
                if (Question1a.equals("a")) {
                    System.out.println(pass);
                    System.out.print(".");
                    TimeUnit.MILLISECONDS.sleep(300);
                    System.out.print(".");
                    TimeUnit.MILLISECONDS.sleep(300);
                    System.out.print(".");
                    TimeUnit.MILLISECONDS.sleep(300);
                    break;
                } else if (questTrial == 1) {
                    System.out.println(fail1);
                    System.out.print(".");
                    TimeUnit.MILLISECONDS.sleep(300);
                    System.out.print(".");
                    TimeUnit.MILLISECONDS.sleep(300);
                    System.out.print(".");
                    TimeUnit.MILLISECONDS.sleep(300);
                    System.out.println(fail2);
                    TimeUnit.MILLISECONDS.sleep(1000);
                    System.out.println(fail3);
                    System.exit(0);
                }
            } else {
                Question1.next();
            }
            --questTrial;
            score = score - 50;
            System.out.println(wrong1 + questTrial + wrong2);
        }

        // reset trial counter
        questTrial = 5;

        // QUESTION 2
        System.out.println("Question 2.. yet again\nprobably a general being in the ocean, that's pretty easy...");
        Scanner Question2 = new Scanner(System.in);

        while (true) {
            if (Question2.hasNext()) {
                Question1a = Question2.nextLine();
                // ANSWER
                if (Question1a.equals("fish")) {
                    System.out.println(pass);
                    System.out.print(".");
                    TimeUnit.MILLISECONDS.sleep(300);
                    System.out.print(".");
                    TimeUnit.MILLISECONDS.sleep(300);
                    System.out.print(".");
                    TimeUnit.MILLISECONDS.sleep(300);
                    break;
                } else if (questTrial == 1) {
                    System.out.println(fail11);
                    System.out.print(".");
                    TimeUnit.MILLISECONDS.sleep(300);
                    System.out.print(".");
                    TimeUnit.MILLISECONDS.sleep(300);
                    System.out.print(".");
                    TimeUnit.MILLISECONDS.sleep(300);
                    System.out.println(fail2);
                    TimeUnit.MILLISECONDS.sleep(1000);
                    System.out.println(fail3);
                    System.exit(0);
                }
            } else {
                Question2.next();
            }
            --questTrial;
            score = score - 100;
            System.out.println(wrong1 + questTrial + wrong2 + "...I swear this is easy");
        }

        // reset trial counter
        questTrial = 5;

        // QUESTION 3
        System.out.println("Question 3.. halfway\nThat one thing that you're sitting on");
        Scanner Question3 = new Scanner(System.in);

        while (true) {
            if (Question3.hasNext()) {
                Question1a = Question3.nextLine();
                // ANSWER
                if (Question1a.equals("chair")) {
                    System.out.println(pass);
                    System.out.print(".");
                    TimeUnit.MILLISECONDS.sleep(300);
                    System.out.print(".");
                    TimeUnit.MILLISECONDS.sleep(300);
                    System.out.print(".");
                    TimeUnit.MILLISECONDS.sleep(300);
                    break;
                } else if (questTrial == 1) {
                    System.out.println(fail11);
                    System.out.print(".");
                    TimeUnit.MILLISECONDS.sleep(300);
                    System.out.print(".");
                    TimeUnit.MILLISECONDS.sleep(300);
                    System.out.print(".");
                    TimeUnit.MILLISECONDS.sleep(300);
                    System.out.println(fail2);
                    TimeUnit.MILLISECONDS.sleep(1000);
                    System.out.println(fail3);
                    System.exit(0);
                }
            } else {
                Question3.next();
            }
            --questTrial;
            score = score - 200;
            System.out.println(wrong1 + questTrial + wrong2);
        }

        // reset trial counter
        questTrial = 5;

        // QUESTION 4
        System.out.println("Question 4.. almost there...\nIt's a bicycle with an engine!");
        Scanner Question4 = new Scanner(System.in);

        while (true) {
            if (Question4.hasNext()) {
                Question1a = Question4.nextLine();
                // ANSWER
                if (Question1a.equals("motorcycle")) {
                    System.out.println(pass);
                    System.out.print(".");
                    TimeUnit.MILLISECONDS.sleep(300);
                    System.out.print(".");
                    TimeUnit.MILLISECONDS.sleep(300);
                    System.out.print(".");
                    TimeUnit.MILLISECONDS.sleep(300);
                    break;
                } else if (questTrial == 1) {
                    System.out.println(fail11);
                    System.out.print(".");
                    TimeUnit.MILLISECONDS.sleep(300);
                    System.out.print(".");
                    TimeUnit.MILLISECONDS.sleep(300);
                    System.out.print(".");
                    TimeUnit.MILLISECONDS.sleep(300);
                    System.out.println(fail2);
                    TimeUnit.MILLISECONDS.sleep(1000);
                    System.out.println(fail3);
                    System.exit(0);
                }
            } else {
                Question4.next();
            }
            --questTrial;
            score = score - 250;
            System.out.println(wrong1 + questTrial + wrong2);
        }

        // reset trial counter
        questTrial = 5;

        // QUESTION 5
        System.out.println("Last but not the least... Question 5\nMy first name");
        Scanner Question5 = new Scanner(System.in);

        while (true) {
            if (Question5.hasNext()) {
                Question1a = Question5.nextLine();
                // ANSWER
                if (Question1a.equals("Derfel")) {
                    System.out.println("Woah!");
                    TimeUnit.MILLISECONDS.sleep(1000);
                    break;
                } else if (questTrial == 1) {
                    System.out.println(fail11);
                    System.out.print(".");
                    TimeUnit.MILLISECONDS.sleep(300);
                    System.out.print(".");
                    TimeUnit.MILLISECONDS.sleep(300);
                    System.out.print(".");
                    TimeUnit.MILLISECONDS.sleep(300);
                    System.out.println(fail2);
                    TimeUnit.MILLISECONDS.sleep(1000);
                    System.out.println(fail3);
                    System.exit(0);
                }
            } else {
                Question5.next();
            }
            --questTrial;
            score = score - 400;
            System.out.println(wrong1 + questTrial + wrong2);
        }

        // outro
        System.out.println("You beat the quiz!");
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.println("Awesome! Let's see how much score you lost...\n...You got...");
        TimeUnit.MILLISECONDS.sleep(3000);
        System.out.println("*drum rolls.mp3*");
        TimeUnit.MILLISECONDS.sleep(3000);
        System.out.println("You got " + score + " out of 5000!");
        TimeUnit.MILLISECONDS.sleep(700);
        System.out.println("You deserve that, alright see you next time!");
        // surely the user made it through the end... but it's only the beginning
        // *evil laughter.mp3*

        introinp.close();
        skip.close();
        Question1.close();
        Question2.close();
        Question3.close();
        Question4.close();
        Question5.close();

        // is this the good time to say bye bye?
    }
}