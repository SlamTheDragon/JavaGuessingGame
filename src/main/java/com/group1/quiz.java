package com.group1;
import com.group1.data.program.data;
import com.group1.data.program.questions;

public class quiz {
    public static void main(String[] args) {

        if (data.qCategory.equals("place")) {
            place();
        } else if (data.qCategory.equals("things")) {
            things();
        } else if (data.qCategory.equals("names")) {
            names();
        } else if (data.qCategory.equals("animals")) {
            animals();
        } else if (data.qCategory.equals("random")) {
            random();
        } else {
            // TODO make menus pointing to this to false but leave main menu on
            // Things will return here, once things broke out set the booleans back to true for reset
        }
    }

    private static void place() {
        for (data.questionIndex = 1; data.questionIndex < 6; data.questionIndex++) {

            data.randomInt = data.id.nextInt(data.upperbound);
            System.out.println("Question " + data.questionIndex + ": " + questions.QPlace[data.randomInt]);
            
            while (true) {
                System.out.print("Question selected: " + data.randomInt); // becomes answer
                data.userInput.nextLine();
                break;
                /// question code here, check ANSWERS[questionIndex]. If it's correct, break
                /// still works, it breaks out of this while loop and ignores the for loop
            }
        }
    }

    private static void things() {
        for (data.questionIndex = 1; data.questionIndex < 6; data.questionIndex++) {

            data.randomInt = data.id.nextInt(data.upperbound);
            System.out.println("Question " + data.questionIndex + ": " + questions.QThings[data.randomInt]);

            while (true) {
                System.out.print("Question selected: " + data.randomInt); // becomes answer
                data.userInput.nextLine();
                break;
                /// question code here, check ANSWERS[questionIndex]. If it's correct, break
                /// still works, it breaks out of this while loop and ignores the for loop
            }
        }
    }

    private static void names() {
        for (data.questionIndex = 1; data.questionIndex < 6; data.questionIndex++) {

            data.randomInt = data.id.nextInt(data.upperbound);
            System.out.println("Question " + data.questionIndex + ": " + questions.QNames[data.randomInt]);

            while (true) {
                System.out.print("Question selected: " + data.randomInt); // becomes answer
                data.userInput.nextLine();
                break;
                /// question code here, check ANSWERS[questionIndex]. If it's correct, break
                /// still works, it breaks out of this while loop and ignores the for loop
            }
        }
    }

    private static void animals() {
        for (data.questionIndex = 1; data.questionIndex < 6; data.questionIndex++) {

            data.randomInt = data.id.nextInt(data.upperbound);
            System.out.println("Question " + data.questionIndex + ": " + questions.QAnimals[data.randomInt]);

            while (true) {
                System.out.print("Question selected: " + data.randomInt); // becomes answer
                data.userInput.nextLine();
                break;
                /// question code here, check ANSWERS[questionIndex]. If it's correct, break
                /// still works, it breaks out of this while loop and ignores the for loop
            }
        }
    }

    private static void random() {
        for (data.questionIndex = 1; data.questionIndex < 6; data.questionIndex++) {

            data.randomInt = data.id.nextInt(data.upperboundRand);
            System.out.println("Question " + data.questionIndex + ": " + questions.QRandom[data.randomInt]);

            while (true) {
                System.out.print("Question selected: " + data.randomInt); // becomes answer
                data.userInput.nextLine();
                break;
                /// question code here, check ANSWERS[questionIndex]. If it's correct, break
                /// still works, it breaks out of this while loop and ignores the for loop
            }
        }
    }
}
