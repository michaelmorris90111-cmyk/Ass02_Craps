import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class CrapsGame {
    static void main() {

        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        String shouldContinue;

        do {
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int crapsRoll = die1 + die2;
            boolean isValid = false;

            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Craps roll: " + crapsRoll);

            if (crapsRoll == 7) {
                System.out.println("Natural! You Win!");
            } else if (crapsRoll == 11) {
                System.out.println("Natural! You Win!");
            } else if (crapsRoll == 12) {
                System.out.println("Craps! You Lose!");
            } else if (crapsRoll == 2) {
                System.out.println("Craps! You Lose!");
            } else if (crapsRoll == 3) {
                System.out.println("Craps! You Lose!");
            } else {
                System.out.println("You rolled: " + crapsRoll + " this is now The Point.");
                int thePoint = crapsRoll;
                System.out.println("Trying for point");
                do {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    crapsRoll = die1 + die2;
                    if (crapsRoll == 7) {
                        System.out.println("7, you lose.");
                        isValid = true;
                    } else if (crapsRoll == thePoint) {
                        System.out.println("You rolled The Point! You Win!.");
                        isValid = true;
                    } else {
                        System.out.println("Roll again.");
                    }
                } while (!isValid);
            }
            System.out.println("Do you want to continue (y/n): ");
            shouldContinue = in.nextLine();
        } while (shouldContinue.equalsIgnoreCase("y"));

    }
}