package NestedLoops.Lab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int lastNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int combinationCounter = 0;

        int n1 = 0;
        int n2 = 0;

        boolean isFound = false;

        for (int i = firstNumber; i <= lastNumber; i++) {
            for (int j = firstNumber; j <= lastNumber; j++) {

                combinationCounter++;
                n1 = i;
                n2 = j;

                if (n1 + n2 == magicNumber) {
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                break;
            }

        }
        if (isFound) {
            System.out.printf("Combination N:%d (%d + %d = %d)", combinationCounter, n1, n2, magicNumber);
        } else {
            System.out.printf("%d combinations - neither equals %d", combinationCounter, magicNumber);

        }

    }
}
