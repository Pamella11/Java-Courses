package Methods.Lab;

import java.util.Scanner;

public class Orders05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String productType = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        printProductPrice(productType, quantity);

    }
    //•	coffee – 1.50
    //•	water – 1.00
    //•	coke – 1.40
    //•	snacks – 2.00

    public static void printProductPrice (String product, int quantity) {

        double price = 0;

        switch (product) {
            case "coffee":
                price = 1.50;
                break;
            case "water":
                price = 1;
                break;
            case "coke":
                price = 1.4;
                break;
            case "snacks":
                price = 2;
                break;
        }

        double finalSum = quantity * price;
        System.out.printf("%.2f", finalSum);

    }


}
