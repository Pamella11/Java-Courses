package Methods.Lab;

import java.util.Scanner;

public class SignOfIntegerNumbers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        integerSign(number);

    }

    public static void integerSign (int number) {

        String numberType = "";
        if (number > 0) {
            numberType = "positive";
        } else if (number < 0) {
            numberType = "negative";
        } else {
            numberType = "zero";
        }

        System.out.printf("The number %d is %s.", number, numberType);


    }
}
