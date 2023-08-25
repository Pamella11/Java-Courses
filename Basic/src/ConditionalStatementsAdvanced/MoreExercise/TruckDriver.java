package ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmsPerMonth = Double.parseDouble(scanner.nextLine());

        double price = 0;

        switch (season) {
            case "Spring":
            case "Autumn":
                if (kmsPerMonth <= 5000){
                    price = kmsPerMonth * 0.75;
                } else if (kmsPerMonth <= 10000) {
                    price = kmsPerMonth * 0.95;
                }
                break;
            case "Summer":
                if (kmsPerMonth <= 5000){
                    price = kmsPerMonth * 0.90;
                } else if (kmsPerMonth <= 10000) {
                    price = kmsPerMonth * 1.10;
                }
                break;
            case "Winter":
                if (kmsPerMonth <= 5000) {
                    price = kmsPerMonth * 1.05;
                } else if (kmsPerMonth <= 10000) {
                    price = kmsPerMonth * 1.25;
                }
        }

        if (kmsPerMonth > 10000 && kmsPerMonth <= 20000) {
            price = kmsPerMonth * 1.45;
        }

        double totalPrice = price * 4;
        double finalSum = totalPrice - totalPrice * 0.1;

        System.out.printf("%.2f", finalSum);


    }
}
