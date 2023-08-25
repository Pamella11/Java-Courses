package WhileLoop.MoreExercise;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        int counter = 0;

        int cashCounter = 0;
        int cardCounter = 0;

        int cash = 0;
        int card = 0;

        while (!command.equals("End")) {

            int currentSum = Integer.parseInt(command);

            counter++;

            if (counter % 2 != 0) {
                if (currentSum > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    cash += currentSum;
                    cashCounter++;
                }
            } else {
                if (currentSum < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    card += currentSum;
                    cardCounter++;
                }
            }

            if (cash + card >= sum) {
                break;
            }

            command = scanner.nextLine();
        }

        double averageCash = 1.0 * cash / cashCounter;
        double averageCard = 1.0 * card / cardCounter;
        double totalSum = cash + card;

        if ( totalSum >= sum) {
            System.out.printf("Average CS: %.2f%n", averageCash);
            System.out.printf("Average CC: %.2f", averageCard);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }

    }
}
