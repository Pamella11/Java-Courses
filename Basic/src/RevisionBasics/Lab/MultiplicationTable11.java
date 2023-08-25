package RevisionBasics.Lab;

import java.util.Scanner;

public class MultiplicationTable11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        int product = 0;

        if (num2 > 10) {
            System.out.printf("%d X %d = %d", num1, num2, num1 * num2);
        }

        for (int i = num2 ; i <= 11 ; i++) {

            product = num1 * i;

            System.out.printf("%d X %d = %d%n", num1, num2, product);

            num2++;

            if ( num2 > 10) {
                break;
            }

        }


    }
}
