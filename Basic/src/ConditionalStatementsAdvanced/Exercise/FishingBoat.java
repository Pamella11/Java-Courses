package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishmen = Integer.parseInt(scanner.nextLine());

        double boatPrice = 0;

        switch (season) {
            case "Spring":
                boatPrice = 3000;
                if (fishmen <= 6) {
                    boatPrice = boatPrice - boatPrice * 0.1;
                } else if (fishmen > 7 && fishmen <= 11) {
                    boatPrice = boatPrice - boatPrice * 0.15;
                }else {
                    boatPrice = boatPrice - boatPrice * 0.25;
                }
                if (fishmen % 2 == 0){
                    boatPrice = boatPrice - boatPrice * 0.05;
                }
                break;
            case "Summer":
                boatPrice = 4200;
                if (fishmen <= 6) {
                    boatPrice = boatPrice - boatPrice * 0.1;
                }else if (fishmen > 7 && fishmen <= 11) {
                    boatPrice = boatPrice - boatPrice * 0.15;
                }else {
                    boatPrice = boatPrice - boatPrice * 0.25;
                }
                if (fishmen % 2 == 0){
                    boatPrice = boatPrice- boatPrice * 0.05;
                }
                break;
            case "Autumn":
                boatPrice = 4200;
                if (fishmen <= 6) {
                    boatPrice = boatPrice - boatPrice * 0.1;
                }else if (fishmen > 7 && fishmen <= 11) {
                    boatPrice = boatPrice - boatPrice * 0.15;
                }else {
                    boatPrice = boatPrice - boatPrice * 0.25;
                }
                break;
            case "Winter":
                boatPrice = 2600;
                if (fishmen <= 6) {
                    boatPrice = boatPrice - boatPrice * 0.1;
                }else if (fishmen > 7 && fishmen <= 11) {
                    boatPrice = boatPrice - boatPrice * 0.15;
                }else {
                    boatPrice = boatPrice - boatPrice * 0.25;
                }
                if (fishmen % 2 == 0){
                    boatPrice =boatPrice - boatPrice * 0.05;
                }
                break;
        }
        double diff = Math.abs(budget - boatPrice);

        if (budget >= boatPrice){
            System.out.printf("Yes! You have %.2f leva left.",diff);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.",diff);
        }

    }
}
