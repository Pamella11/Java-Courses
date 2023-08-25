package Methods.Exercise;

import java.util.Scanner;

public class FactorialDivision08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());


        long factorialFirstNum = numFactorial(num1);
        long factorialSecondNum = numFactorial(num2);
        double division = (double) factorialFirstNum / factorialSecondNum;

        System.out.printf("%.2f", division);
    }

    public static long numFactorial(int number) {

        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

}
