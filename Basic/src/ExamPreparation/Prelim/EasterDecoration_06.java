package ExamPreparation.Prelim;

import java.util.Scanner;

public class EasterDecoration_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int customers = Integer.parseInt(scanner.nextLine());

        double allSum = 0;

        for (int i = 0; i < customers ; i++) {

            String input = scanner.nextLine();

            double price = 0;
            int itemCounter = 0;

            while (!input.equals("Finish")) {

                itemCounter++;

                switch (input) {
                    case "basket":
                        price += 1.50;
                        break;
                    case "wreath":
                        price += 3.80;
                        break;
                    case "chocolate bunny":
                        price += 7;
                        break;
                }
                input = scanner.nextLine();
            }

            if (itemCounter % 2 == 0) {
                price = price * 0.8;
            }
            System.out.printf("You purchased %d items for %.2f leva.%n", itemCounter, price);

            allSum += price;

            //itemCounter = 0;
        }
        System.out.printf("Average bill per client is: %.2f leva.", allSum / customers);
    }
}
