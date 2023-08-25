package Arrays.Lab;

import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

      while (numbers.length > 1) {

         int[] sum = new int[numbers.length - 1];

          for (int i = 0; i < numbers.length - 1; i++) {

              sum[i] = numbers[i] + numbers[i + 1];
          }

         numbers = sum;

      }

        System.out.println(numbers[0]);

    }
}
