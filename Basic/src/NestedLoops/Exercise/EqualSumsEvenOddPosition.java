package NestedLoops.Exercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        for (int i = number1; i <= number2 ; i++) {

            int firstNumber = i / 100000 % 10;
            int secondNumber = i / 10000 % 10;
            int thirdNumber = i / 1000 % 10;
            int fourthNumber = i / 100 % 10;
            int fifthNumber = i / 10 % 10;
            int sixthNumber = i % 10;

            if (fifthNumber + thirdNumber + firstNumber == secondNumber + fourthNumber + sixthNumber) {
                System.out.print(i + " ");
            }

        }
        
    }
}
