package RevisionBasics.Exercise;

import java.util.Scanner;

public class Orders09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ordersCounter = Integer.parseInt(scanner.nextLine());

        double price = 0;

        double total = 0;

        for (int i = 0; i < ordersCounter ; i++) {

            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsuleCounter = Integer.parseInt(scanner.nextLine());

            price = (days * capsuleCounter) * pricePerCapsule;

            System.out.printf("The price for the coffee is: $%.2f%n", price);

            total += price;

        }

        System.out.printf("Total: $%.2f", total);


    }
}
