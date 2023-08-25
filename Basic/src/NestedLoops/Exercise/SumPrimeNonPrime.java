package NestedLoops.Exercise;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int num = Integer.parseInt(scanner.nextLine());

        int primeSum = 0;
        int nonPrimeSum = 0;

        String command = scanner.nextLine();


        while (!command.equals("stop")) {

            int num = Integer.parseInt(command);

            if (num < 0) {
                System.out.println("Number is negative.");
                command = scanner.nextLine();
                continue;
            }

            int counter = 1;

            for (int i = 2; i <= num ; i++) {
                if (num % i == 0) {
                    counter++;
                }

            }

            command = scanner.nextLine();

            if (counter > 2) {
                nonPrimeSum += num;
            }else {
                primeSum += num;
            }

        }

        System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d", nonPrimeSum);

    }
}
