package Methods.Lab;

import java.util.Scanner;

public class Calculations04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String action = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        printSum(action, num1, num2);

    }

    public static void printSum (String action, int n1, int n2) {

        int sum = 0;

        switch (action) {
            case "add":
                sum = n1 + n2;
                break;
            case "multiply":
                sum = n1 * n2;
                break;
            case "subtract":
                sum = n1 - n2;
                break;
            case "divide":
                sum = n1 / n2;
                break;
        }
        System.out.println(sum);

    }
}
