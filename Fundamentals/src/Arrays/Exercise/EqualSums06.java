package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isEqual = false;

        for (int i = 0; i < numbers.length; i++) {

            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += numbers[j];
            }

            for (int k = i + 1; k <= numbers.length - 1; k++) {
                rightSum += numbers[k];
            }

            if ( leftSum == rightSum) {
                isEqual = true;
                System.out.println(i);
                break;
            }

        }
        if (!isEqual)
        System.out.println("no");

    }
}
