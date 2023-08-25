package Methods.Exercise;

import java.util.Scanner;

public class NxNMatrix07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        matrixRow(number);

    }

    public static void matrixLine (int n) {
            for (int i = 0; i < n; i++) {
                System.out.print(n + " ");
            }
            System.out.println();
    }

    public static void matrixRow (int n) {
        for (int i = 0; i < n; i++) {
            matrixLine(n);
        }
    }


}
