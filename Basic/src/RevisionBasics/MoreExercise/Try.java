package RevisionBasics.MoreExercise;

import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        int middleNum = 0;

        if (num1 > maxNum) {
            maxNum = num1;
        }
        if (num2 > num1) {
            maxNum = num2;
        }
        if (num3 > num2) {
            maxNum = num3;
        }

        if (num1 < minNum) {
            minNum = num1;
        }
        if (num2 < num1) {
            minNum = num2;
        }
        if (num3 < num2) {
            maxNum = num3;
        }


        System.out.println(maxNum);

        if (num1 != maxNum && num1 != minNum) {
            System.out.println(num1);
        } else if (num2 != maxNum && num2 != minNum) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }

        if (num1 == num2) {
            System.out.println(num1);
            System.out.println(num2);
        } else if (num1 == num3) {
            System.out.println(num1);
            System.out.println(num3);
        } else if (num2 == num3) {
            System.out.println(num2);
            System.out.println(num3);
        }

        System.out.println(minNum);

    }
}
