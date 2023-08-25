package RevisionBasics.MoreExercise;

import java.util.Scanner;

public class GamingStore03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());

        String command = scanner.nextLine();

        double totalSpent = money;

        while (!command.equals("Game Time")) {

            double price = 0;

            if (command.equals("OutFall 4")) {
                price = 39.99;
                if (money >= price) {
                    money -= price;
                    System.out.println("Bought OutFall 4");
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (command.equals("CS: OG")) {
                price = 15.99;
                if (money >= price) {
                    money -= price;
                    System.out.println("Bought CS: OG");
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (command.equals("Zplinter Zell")) {
                price = 19.99;
                if (money >= price) {
                    money -= price;
                    System.out.println("Bought Zplinter Zell");
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (command.equals("Honored 2")) {
                price = 59.99;
                if (money >= price) {
                    money -= price;
                    System.out.println("Bought Honored 2");
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (command.equals("RoverWatch")) {
                price = 29.99;
                if (money >= price) {
                    money -= price;
                    System.out.println("Bought RoverWatch");
                } else {
                    System.out.println("Too Expensive");
                }
            } else if (command.equals("RoverWatch Origins Edition")) {
                price = 39.99;
                if (money >= price) {
                    money -= price;
                    System.out.println("Bought RoverWatch Origins Edition");
                } else {
                    System.out.println("Too Expensive");
                }
            } else {
                System.out.println("Not Found");
            }

            if (money <= 0) {
                System.out.println("Out of money!");
                break;
            }


            command = scanner.nextLine();
        }

        System.out.printf("Total spent: $%.2f. ", totalSpent - money);
        System.out.printf("Remaining: $%.2f", money);


    }
}
