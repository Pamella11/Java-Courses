package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] n = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;

        for (int i = 0; i < n.length; i++) {

            if (n[i] % 2 == 0) {
                sum += n[i];
            }

        }

        System.out.println(sum);

    }
}
