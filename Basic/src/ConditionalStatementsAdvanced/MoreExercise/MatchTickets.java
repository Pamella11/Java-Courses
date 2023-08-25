package ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      //•	VIP – 499.99 лева.
        //•	Normal – 249.99 лева

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int peopleInGroup = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double moneyLeft = 0;

        switch (category) {
            case "VIP":
                price = 499.99 * peopleInGroup;
                break;
            case "Normal":
                price = 249.99 * peopleInGroup;
        }
        if (peopleInGroup <= 4 ) {
            moneyLeft = budget - budget * 0.75;
        } else if (peopleInGroup <= 9) {
            moneyLeft = budget - budget * 0.6;
        } else if (peopleInGroup <= 24) {
            moneyLeft = budget - budget * 0.5;
        } else if (peopleInGroup <= 49) {
            moneyLeft = budget - budget * 0.4;
        } else {
            moneyLeft = budget - budget * 0.25;
        }

        if (moneyLeft >= price) {
            System.out.printf("Yes! You have %.2f leva left.", moneyLeft - price);
        } else  {
            System.out.printf("Not enough money! You need %.2f leva.", price - moneyLeft);
        }





    }
}
