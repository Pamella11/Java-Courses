package RevisionBasics.Exercise;

import java.util.Scanner;

public class VendingMachine07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        double totalCoins = 0;

        while (!command.equals("Start")) {

            double insertedCoins = Double.parseDouble(command);

            if (insertedCoins != 0.1 && insertedCoins != 0.2 && insertedCoins != 0.5 && insertedCoins != 1 && insertedCoins != 2) {
                System.out.printf("Cannot accept %.2f%n", insertedCoins);
            } else {
                totalCoins += insertedCoins;
            }

                 command = scanner.nextLine();
        }

        command = scanner.nextLine();

        while (!command.equals("End")) {

             switch (command){
                 case "Nuts":
                     if (totalCoins >= 2) {
                         totalCoins -= 2;
                         System.out.println("Purchased Nuts");
                     }else {
                         System.out.println("Sorry, not enough money");
                     }
                     break;
                 case "Water":
                     if (totalCoins >= 0.7) {
                         totalCoins -= 0.7;
                         System.out.println("Purchased Water");
                     }else {
                         System.out.println("Sorry, not enough money");
                     }
                     break;
                 case "Crisps":
                     if (totalCoins >= 1.5) {
                         totalCoins -= 1.5;
                         System.out.println("Purchased Crisps");
                     }else {
                         System.out.println("Sorry, not enough money");
                     }
                     break;
                 case "Soda":
                     if (totalCoins >= 0.8) {
                         totalCoins -= 0.8;
                         System.out.println("Purchased Soda");
                     }else {
                         System.out.println("Sorry, not enough money");
                     }
                     break;
                 case "Coke":
                     if (totalCoins >= 1) {
                         totalCoins -= 1;
                         System.out.println("Purchased Coke");
                     }else {
                         System.out.println("Sorry, not enough money");
                     }
                     break;
                 default:
                     System.out.println("Invalid product");
                     break;
             }
             command = scanner.nextLine();

        }

        System.out.printf("Change: %.2f", totalCoins);

    }
}
