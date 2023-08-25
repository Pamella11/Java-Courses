package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());;
        String season = scanner.nextLine();

        double price = 0;
        String vacancyType = "";
        String destination = "";

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")){
                price = budget * 0.3;
                vacancyType = "Camp";
            } else if (season.equals("winter")) {
                price = budget * 0.7;
                vacancyType = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")){
                price = budget * 0.4;
                vacancyType = "Camp";
            } else if (season.equals("winter")) {
                price = budget * 0.8;
                vacancyType = "Hotel";
            }
        }else {
            destination = "Europe";
            if (season.equals("summer") || season.equals("winter")) {
                vacancyType = "Hotel";
                price = budget * 0.9;
            }
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", vacancyType, price);
    }
}
