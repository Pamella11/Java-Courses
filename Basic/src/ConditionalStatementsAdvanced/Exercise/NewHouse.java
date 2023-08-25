package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int flowerNumber = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        int rosePrice = 5;
        double dahliaPrice = 3.80;
        double tulipPrice = 2.80;
        int narcisPrice = 3;
        double gladiolaPrice = 2.50;

        double finalSum = 0;

        switch (flower) {
            case "Roses":
                finalSum = flowerNumber * 5;
                if (flowerNumber > 80) {
                    finalSum = finalSum - finalSum * 0.1;
                }
                break;

                case "Dahlias":
                    finalSum = flowerNumber * 3.80;
                if (flowerNumber > 90) {
                    finalSum = finalSum - finalSum * 0.15;
                }
                break;

            case "Tulips":
                finalSum = flowerNumber * 2.80;
                if (flowerNumber > 80) {
                    finalSum = finalSum - finalSum * 0.15;
                }
                break;

            case "Narcissus":
                finalSum = flowerNumber * 3;
                if (flowerNumber < 120) {
                    finalSum = finalSum + finalSum * 0.15;
                }
                break;

            case "Gladiolus":
                finalSum = flowerNumber * 2.50;
                if (flowerNumber < 80) {
                    finalSum = finalSum + finalSum * 0.2;
                }
                break;
        }

        double diff = Math.abs(budget - finalSum);

        if (budget >= finalSum) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerNumber, flower, diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }



    }
}
