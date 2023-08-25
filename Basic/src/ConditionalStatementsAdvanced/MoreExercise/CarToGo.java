package ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String type = "";
        String car = "";
        double price = 0;

        if (budget <= 100) {
            type = "Economy class";
            switch (season) {
                case "Summer":
                    car = "Cabrio";
                    price = budget * 0.35;
                    break;
                case "Winter":
                    car = "Jeep";
                    price = budget * 0.65;
            }
        } else if (budget <= 500) {
            type = "Compact class";
            switch (season) {
                case "Summer":
                    car = "Cabrio";
                    price = budget * 0.45;
                    break;
                case "Winter":
                    car = "Jeep";
                    price = budget * 0.8;
            }
        } else {
            type = "Luxury class";
            car = "Jeep";
            price = budget * 0.9;
        }

        System.out.println(type);
        System.out.printf("%s - %.2f", car, price);


    }

    }

