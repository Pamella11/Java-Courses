package Methods.Lab;

import java.util.Scanner;

public class MultiplyEvensByOdds10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(Multiplication(number));

    }

    public static int Multiplication (int number) {

        int digit = 0;
        int oddSum = 0;
        int evenSum = 0;

        while (number != 0) {

            digit = number % 10;

            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }

            number = number / 10;
        }

        return evenSum * oddSum;
    }
}
