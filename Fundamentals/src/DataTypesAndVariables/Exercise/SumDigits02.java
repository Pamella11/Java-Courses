package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class SumDigits02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sumOfDigits = 0;

        for (int i = 0; i != number ; i++) {

          if (number <= 0) {
              break;
          }
            int sum = number % 10;

            sumOfDigits += sum;

            number = number / 10;

        }
        System.out.println(sumOfDigits);

    }
}
