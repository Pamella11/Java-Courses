package ExamPreparation.Exam2020;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class EnergyBooster_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());


        double price = 0;

        switch (fruit) {
            case "Watermelon":
                if (size.equals("small")) {
                    price = 2 * 56 * amount;
                } else if (size.equals("big")) {
                    price = 5 * 28.70 * amount;
                }
                break;
            case "Mango":
                if (size.equals("small")) {
                    price = 2 * 36.66 * amount;
                } else if (size.equals("big")) {
                    price = 5 * 19.60 * amount;
                }
                break;
            case "Pineapple":
                if (size.equals("small")) {
                    price = 2 * 42.10 * amount;
                } else if (size.equals("big")) {
                    price = 5 * 24.80 * amount;
                }
                break;
            case "Raspberry":
                if (size.equals("small")) {
                    price = 2 * 20 * amount;
                } else if (size.equals("big")) {
                price = 5 * 15.20 * amount;
                }
                break;
        }

        if (price >= 400 && price <= 1000) {
            price -= price * 0.15;
        } else if (price > 1000) {
            price -= price / 2;
        }

        System.out.printf("%.2f lv.", price);

    }
}
