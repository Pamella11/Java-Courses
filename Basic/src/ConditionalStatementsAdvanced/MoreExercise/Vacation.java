package ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0;
        String destination = "";
        String type = "";

        if (budget <= 1000) {
            type = "Camp";
            switch (season) {
                case "Summer":
                    destination = "Alaska";
                    price = budget * 0.65;
                    break;
                case "Winter":
                    destination = "Morocco";
                    price = budget * 0.45;
                    break;
            }

        } else if (budget <= 3000) {
            type = "Hut";
            switch (season) {
                case "Summer":
                    destination = "Alaska";
                    price = budget * 0.8;
                    break;
                case "Winter":
                    destination = "Morocco";
                    price = budget * 0.6;
                    break;
            }
        } else {
            type = "Hotel";
            switch (season) {
                case "Summer":
                    destination = "Alaska";
                    price = budget * 0.9;
                    break;
                case "Winter":
                    destination = "Morocco";
                    price = budget * 0.9;
                    break;
            }
        }


        System.out.printf("%s - %s - %.2f", destination, type, price);

    }
}
