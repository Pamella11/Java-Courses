package RevisionBasics.Lab;

import java.util.Scanner;

public class SumOfOddNumbers09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that prints the next n odd numbers (starting from 1) and on the last row prints the sum of them.
        //On the first line, you will receive a number – n. This number shows how many odd numbers you should print.
        //Print the next n odd numbers, starting from 1, separated by new lines. On the last line, print the sum of these numbers.

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= number * 2 ; i+=2) {

            System.out.println(i);

            sum += i;

        }

        System.out.printf("Sum: %d", sum);



    }
}
