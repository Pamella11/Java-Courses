package WhileLoop.Lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        while (sum < number) {

            int newNumber = Integer.parseInt(scanner.nextLine());

            sum += newNumber;
        }

        System.out.println(sum);

    }
}
