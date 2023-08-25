package ForLoop.Exercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int pricePerToy = Integer.parseInt(scanner.nextLine());

        int money = 0;
        int toys = 0;

        for (int i = 1; i <= age ; i++) {

            if(i % 2 == 0){
                money += (i * 5) - 1;

            } else {
                toys ++;
            }
        }

        double savedMoney = money + toys * pricePerToy;

        if (savedMoney >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", Math.abs(savedMoney - washingMachinePrice));
        } else {
            System.out.printf("No! %.2f", Math.abs(savedMoney - washingMachinePrice));
        }

    }
}
