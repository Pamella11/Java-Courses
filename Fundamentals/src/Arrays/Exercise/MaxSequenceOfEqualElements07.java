package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that finds the longest sequence of equal elements in an array of integers.
        // If several longest sequences exist, print the leftmost one

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // 2 1 1 2 3 3 2 2 2 1 -> 2 2 2

        int length = 1;
        int maxLength = 0;

        int index = 0;
        int maxIndex = 0;

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] == numbers[i - 1]) {
                length += 1 ;
            } else {
                length = 1;
               index = i;
            }

            if (length > maxLength) {
                maxLength = length;
                maxIndex = index;
            }

        }

        for (int i = maxIndex; i < maxIndex + maxLength ; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}
