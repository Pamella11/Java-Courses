package ExceptionsAndErrorHandling;

import java.util.Arrays;
import java.util.Scanner;

public class NumberInRange_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int startIndex = numbers[0];
        int endIndex = numbers[1];

        System.out.printf("Range: [%d...%d]%n", startIndex, endIndex);

        while (true){

            String input = scanner.nextLine();

            try {
                int number = Integer.parseInt(input);

                if (number < startIndex || number > endIndex){
                    throw new Exception();
                }
                System.out.println("Valid number: " + number);
                break;

            } catch (Exception exception){
                System.out.println("Invalid number: " + input);
            }
        }

    }
}
