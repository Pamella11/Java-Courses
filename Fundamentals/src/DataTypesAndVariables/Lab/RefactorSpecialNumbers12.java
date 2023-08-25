package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class RefactorSpecialNumbers12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int currentNum = 1; currentNum <= number; currentNum++) {

            int sum = 0;
            int digits = currentNum;

            while (digits > 0) {
                sum += digits % 10;
                digits = digits / 10;
            }
            boolean isSpecial = (sum == 5) || (sum == 7) || (sum == 11);
            if (isSpecial) {
                System.out.printf("%d -> True%n", currentNum);
            } else {
                System.out.printf("%d -> False%n", currentNum);
            }
        }
    }

}

