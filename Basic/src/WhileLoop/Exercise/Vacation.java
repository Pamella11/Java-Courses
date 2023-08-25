package WhileLoop.Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripMoney = Double.parseDouble(scanner.nextLine());
        double ownedMoney = Double.parseDouble(scanner.nextLine());

        int spendingDays = 0;
        int days = 0;

        while ( ownedMoney < tripMoney) {

            String activity = scanner.nextLine();
            double currentMoney = Double.parseDouble(scanner.nextLine());

            days ++;


            if (activity.equals("spend")) {
                spendingDays++;
                ownedMoney -= currentMoney;
                if (ownedMoney < currentMoney) {
                    ownedMoney = 0;
                }
            } else if (activity.equals("save")) {
                ownedMoney += currentMoney;
                spendingDays = 0;
            }

            if (spendingDays >= 5) {
                System.out.println("You can't save the money.");
                System.out.println(days);
                break;
            }


        }

        if (ownedMoney >= tripMoney) {
            System.out.printf("You saved the money for %d days.", days);
        }



    }
}
