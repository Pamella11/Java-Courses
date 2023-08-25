package WhileLoop.Lab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int minNumber = Integer.MAX_VALUE;

        while (!command.equals("Stop")) {

            int number = Integer.parseInt(command);

            if (number < minNumber) {
                minNumber = number;
            }

            command = scanner.nextLine();

        }

        System.out.println(minNumber);


    }
}
