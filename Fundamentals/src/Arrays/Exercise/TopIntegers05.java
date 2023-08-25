package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program to find all the top integers in an array.
        // A top integer is an integer that is bigger than all the elements to its right.

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < numbers.length; i++) {

            boolean isTop = true;

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] <= numbers[j]) {
                    isTop = false;
                    break;
                }

            }

            if (isTop) {
                System.out.print(numbers[i] + " ");
            }

        }
    }
}
