package WhileLoop.Exercise;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());

        double coins = Math.floor(money * 100);

        int coinsCounter = 0;

        while (coins > 0) {

            if (coins >= 200) {
                coinsCounter++;
                coins -= 200;
            } else if (coins >= 100) {
                coinsCounter++;
                coins -= 100;
            } else if (coins >= 50) {
                coinsCounter++;
                coins -= 50;
            } else if (coins >= 20) {
                coinsCounter++;
                coins -= 20;
            } else if (coins >= 10) {
                coinsCounter++;
                coins -= 10;
            } else if (coins >= 5) {
                coinsCounter++;
                coins -= 5;
            } else if (coins >= 2) {
                coinsCounter++;
                coins -= 2;
            } else if (coins >= 1) {
                coinsCounter++;
                coins -= 1;
            }

        }
        System.out.println(coinsCounter);
    }
}
