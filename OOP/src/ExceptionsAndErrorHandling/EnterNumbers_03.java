package ExceptionsAndErrorHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnterNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = 1;
        int endNum = 100;

        List<String> numbers = new ArrayList<>();

        while (numbers.size() != 10) {

            String input = scanner.nextLine();
            int number = readNumber(startNum, endNum, input, numbers);
            if (number == 1){
                startNum = Integer.parseInt(input);
            }

        }

        System.out.println(String.join(", ", numbers));

    }

    private static int readNumber(int start, int end, String input, List<String> numbers) {
        int num = 0;
        try {
            int number = Integer.parseInt(input);
            if (number <= start || number >= end) {
                throw new IllegalArgumentException();
            } else {
                numbers.add(input);
                num = 1;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid Number!");
            num = -1;
        } catch (IllegalArgumentException e) {
            System.out.printf("Your number is not in range %d - 100!%n", start);
            num = -1;
        }
        return num;
    }
}
