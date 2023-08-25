package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class WaterOverflow07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        int capacity = 255;

        int sum = 0;

        for (int i = 0; i < lines; i++) {

            int quantities = Integer.parseInt(scanner.nextLine());

            sum += quantities;

            if (sum > capacity) {
                sum -= quantities;
                System.out.println("Insufficient capacity!");
                continue;
            }
        }
        System.out.println(sum);

    }
}
