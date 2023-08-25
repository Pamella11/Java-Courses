package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that prints all unique pairs in an array of integers whose sum is equal to a given number.
        // 1 7 6 2 19 23         ->  1 7
        // 8                         6 2

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j <= numbers.length - 1; j++) {

                if (numbers[i] + numbers[j] == sum) {

                    System.out.print(numbers[i] + " " + numbers[j] + " ");
                    System.out.println();
                }
            }

        }

    }
}
