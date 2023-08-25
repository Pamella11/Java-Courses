package Exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> price = Arrays
                .stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int index = Integer.parseInt(scanner.nextLine());

        int number = price.get(index);

        String type = scanner.nextLine();

        int leftSum = 0;
        int rightSum = 0;

        if (type.equals("cheap")) {
            for (int i = 0; i < index; i++) {
                int num = price.get(i);
                if (num < number) {
                    leftSum += num;
                }
            }
                for (int j = index + 1; j < price.size() ; j++) {
                    int num1 = price.get(j);
                    if (num1 < number) {
                        rightSum += num1;
                    }
                }
                if (leftSum >= rightSum) {
                    System.out.println("Left - " + leftSum);
                } else {
                    System.out.println("Right - " + rightSum);
                }
        } else if (type.equals("expensive")) {
            for (int i = 0; i < index; i++) {
                int num = price.get(i);
                if (num >= number) {
                    leftSum += num;
                }
            }
            for (int j = index + 1; j < price.size() ; j++) {
                int num1 = price.get(j);
                if (num1 >= number) {
                    rightSum += num1;
                }
            }
            if (leftSum >= rightSum) {
                System.out.println("Left - " + leftSum);
            } else {
                System.out.println("Right - " + rightSum);
            }
        }

    }
}
