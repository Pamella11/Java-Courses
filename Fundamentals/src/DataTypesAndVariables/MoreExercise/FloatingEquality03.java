package DataTypesAndVariables.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class FloatingEquality03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       double num1 = Double.parseDouble(scanner.nextLine());
       double num2 = Double.parseDouble(scanner.nextLine());

       double result = Math.abs(num1 - num2);

        if (result >= 0.000001) {
           System.out.println("False");
       } else {
           System.out.println("True");
       }

    }
}
