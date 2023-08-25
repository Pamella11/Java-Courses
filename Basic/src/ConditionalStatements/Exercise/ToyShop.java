package ConditionalStatements.Exercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scanner.nextLine());
        double puzzles = Double.parseDouble(scanner.nextLine());
        double dolls = Double.parseDouble(scanner.nextLine());
        double teddyBears = Double.parseDouble(scanner.nextLine());
        double minions = Double.parseDouble(scanner.nextLine());
        double trucks = Double.parseDouble(scanner.nextLine());

        double puzzlesPrice = puzzles*2.60;
        double dollsPrice = dolls*3;
        double teddyBearsPrice = teddyBears*4.10;
        double minionsPrice = minions*8.20;
        double trucksPrice = trucks*2;

        double totalToys = puzzles + dolls + teddyBears + minions + trucks;

        double totalToysPrice = puzzlesPrice + dollsPrice + teddyBearsPrice + minionsPrice + trucksPrice;

        double discount = 0;
        double finalSum = totalToysPrice - discount;
        double rent = finalSum * 0.1;
        double profit = finalSum - rent;

        if (totalToys>=50) {
            discount = totalToysPrice * 0.25;
            finalSum = totalToysPrice - discount;
            rent = finalSum * 0.1;
            profit = finalSum - rent;
        }if (profit>=tripPrice) {
                System.out.printf("Yes! %.2f lv left.",profit-tripPrice);
            }else {

                System.out.printf("Not enough money! %.2f lv needed.",Math.abs(tripPrice-profit));
        }


    }
}
