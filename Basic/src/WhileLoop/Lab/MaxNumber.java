package WhileLoop.Lab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int maxNumber = Integer.MIN_VALUE;

        while (!command.equals("Stop")) {

            int number = Integer.parseInt(command);

            if (number > maxNumber) {
                maxNumber = number;
            }

            command = scanner.nextLine();

        }
        System.out.println(maxNumber);


    }
}
