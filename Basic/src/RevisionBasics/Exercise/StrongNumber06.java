package RevisionBasics.Exercise;

import java.util.Scanner;

public class StrongNumber06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //A number is strong if the sum of the Factorial of each digit is equal to the number.
        //For example 145 is a strong number, because 1! + 4! + 5! = 145.
        //Print "yes" if the number is strong and "no" if the number is not strong.

        int number = Integer.parseInt(scanner.nextLine());

        int firstNumber = number;

        int sum = 0;

        while (number > 0) {

            int lastDigit = number % 10;

            int fact = 1;

            for (int i = 1; i <= lastDigit; i++) {

                fact *= i;
            }

            sum += fact;

            number = number / 10;

        }

        if (sum == firstNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


    }
}
