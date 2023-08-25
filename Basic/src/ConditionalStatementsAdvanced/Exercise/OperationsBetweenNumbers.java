package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        switch (operator) {
            case "+":
                int sum = n1 + n2;
                if (sum % 2 == 0){
                    System.out.printf("%d + %d = %d - even", n1, n2, sum);
                }else {
                    System.out.printf("%d + %d = %d - odd", n1, n2, sum);
                }
                break;
            case "-":
                int sub = n1 - n2;
                if (sub % 2 == 0){
                    System.out.printf("%d - %d = %d - even", n1, n2, sub);
                }else {
                    System.out.printf("%d - %d = %d - odd", n1, n2, sub);
                }
                break;
            case "*":
                int multi = n1 * n2;
                if (multi % 2 == 0){
                    System.out.printf("%d * %d = %d - even", n1, n2, multi);
                }else {
                    System.out.printf("%d * %d = %d - odd", n1, n2, multi);
                }
                break;
            case "/":
                if (n2 == 0){
                    System.out.printf("Cannot divide %d by zero", n1);
                }else {
                    double div = (n1 * 1.0) / n2;
                    System.out.printf("%d / %d = %.2f", n1, n2, div);
                }
                break;
            case "%":
                if (n2 == 0){
                    System.out.printf("Cannot divide %d by zero", n1);
                }else {
                    int diff = n1 % n2;
                    System.out.printf("%d %% %d = %d", n1, n2, diff);
                }
                break;
        }
    }
}
