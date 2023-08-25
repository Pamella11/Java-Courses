package ExamPreparation.Exam2019;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int purposeOfDay = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        double profit = 0;

        while (!command.equals("closed")) {

            if (command.equals("haircut")) {
                String input = scanner.nextLine();
                if (input.equals("ladies")) {
                    profit += 20;
                } else if (input.equals("mens")) {
                    profit += 15;
                } else if (input.equals("kids")) {
                    profit += 10;
                }
            }
            if (command.equals("color")) {
                String input1 = scanner.nextLine();
                if (input1.equals("touch up")) {
                    profit += 20;
                } else if (input1.equals("full color")) {
                    profit += 30;
                }
            }


            if (profit >= purposeOfDay) {
                break;
            }

            command = scanner.nextLine();

        }

        if (profit >= purposeOfDay) {
            System.out.println("You have reached your target for the day!");
            System.out.printf("Earned money: %.0flv.", profit);
        } else {
            System.out.printf("Target not reached! You need %.0flv. more.%n", purposeOfDay - profit);
            System.out.printf("Earned money: %.0flv.", profit);
        }


    }
}

