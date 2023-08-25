package DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class FromLeftToRight02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {

            String[] numbers = scanner.nextLine().split(" ");

            long firstNum = Long.parseLong(numbers[0]);
            long secondNum = Long.parseLong(numbers[1]);

            if (firstNum > secondNum) {

                long leftSum = 0;

                while (firstNum != 0) {

                    long sum = firstNum % 10;

                    leftSum += sum;

                    firstNum = firstNum / 10;
                }
                System.out.println(Math.abs(leftSum));

            } else {

                long rightSum = 0;

                while (secondNum != 0) {

                    long sum = secondNum % 10;

                    rightSum += sum;

                    secondNum = secondNum / 10;

                }
                System.out.println(Math.abs(rightSum));

            }
        }


    }
}
