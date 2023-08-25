package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array1 = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] array2 = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        int index = 0;

        boolean isIdentical = true;

        for (int i = 0; i < array1.length; i++) {

            int firstDigitArray1 = array1[i];
            int firstDigitArray2 = array2[i];

            if (firstDigitArray1 == firstDigitArray2) {
                sum += firstDigitArray1;
            } else {
                isIdentical = false;
                index = i;
                break;
            }

        }

        if (isIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", index);

        }

    }
}
