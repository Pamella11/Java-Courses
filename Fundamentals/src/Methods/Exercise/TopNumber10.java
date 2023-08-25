package Methods.Exercise;

import java.util.Scanner;

public class TopNumber10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        //Read an integer n from the console. Find all top numbers in the range [1 … n] and print them. A top number holds the following properties:
        //•	Its sum of digits is divisible by 8, e.g. 8, 16, 88.
        //•	Holds at least one odd digit, e.g. 232, 707, 87578.

        for (int i = 1; i <= number; i++) {
            boolean isTop = isDivisibleBy8(i) && isDigitOdd(i);
            if (isTop) {
                System.out.println(i);
            }

        }


    }

    public static boolean isDivisibleBy8(int num) {

        int sumOfDigits = 0;

        while (num != 0) {

            int digit = num % 10;

            sumOfDigits += digit;

            num = num / 10;

        }
        return sumOfDigits % 8 == 0;
    }

    public static boolean isDigitOdd(int n) {

        while (n != 0) {

            int digit = n % 10;

            if (digit % 2 != 0) {
                return true;
            }
            n = n / 10;

        }
        return false;

    }
}
