package MidExamPreparation;

import java.util.Scanner;

public class ComputerStore01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        double priceWithoutTaxes = 0;

        while (!command.equals("special") && !command.equals("regular")){

            double price = Double.parseDouble(command);

            if (price < 0) {
                System.out.println("Invalid price!");
            } else {
                priceWithoutTaxes += price;
            }

            command = scanner.nextLine();

        }
        double taxes = priceWithoutTaxes * 0.2;
        double totalPrice = priceWithoutTaxes + taxes;

        if (totalPrice == 0) {
            System.out.println("Invalid order!");
            return;
        }

        //If the total price is equal to zero, you should print "Invalid order!" on the console.

        if (command.equals("regular")) {
            System.out.printf("Congratulations you've just bought a new computer!%n" +
                    "Price without taxes: %.2f$%n" +
                    "Taxes: %.2f$%n" +
                    "-----------%n" +
                    "Total price: %.2f$", priceWithoutTaxes, taxes, totalPrice);
        } else if (command.equals("special")) {
            totalPrice *= 0.9;
            System.out.printf("Congratulations you've just bought a new computer!%n" +
                    "Price without taxes: %.2f$%n" +
                    "Taxes: %.2f$%n" +
                    "-----------%n" +
                    "Total price: %.2f$", priceWithoutTaxes, taxes, totalPrice);
        }

    }
}
