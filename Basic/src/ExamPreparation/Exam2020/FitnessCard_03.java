package ExamPreparation.Exam2020;

import java.util.Scanner;

public class FitnessCard_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyWeHave = Double.parseDouble(scanner.nextLine());
        char gender = scanner.nextLine().charAt(0);
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();


        double price = 0;

        switch (sport) {
            case "Gym":
                if (gender == 109) {
                    price = 42;
                } else if (gender == 102) {
                    price = 35;
                }
                break;
            case "Boxing":
                if (gender == 109) {
                    price = 41;
                } else if (gender == 102) {
                    price = 37;
                }
                break;
            case "Yoga":
                if (gender == 109) {
                    price = 45;
                } else if (gender == 102) {
                    price = 42;
                }
                break;
            case "Zumba":
                if (gender == 109) {
                    price = 34;
                } else if (gender == 102) {
                    price = 31;
                }
                break;
            case "Dances":
                if (gender == 109) {
                    price = 51;
                } else if (gender == 102) {
                    price = 53;
                }
                break;
            case "Pilates":
                if (gender == 109) {
                    price = 39;
                } else if (gender == 102) {
                    price = 37;
                }
                break;
        }
        if (age <= 19) {
            price -= price * 0.2;
        }

        if ( price <= moneyWeHave) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", price - moneyWeHave);
        }


    }
}
