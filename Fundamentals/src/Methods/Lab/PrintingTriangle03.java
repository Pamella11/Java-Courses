package Methods.Lab;

import java.util.Scanner;

public class PrintingTriangle03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printUpperHalf(number);
        printLowerHalf(number);

        // 3   ->    1
        //           1 2
        //           1 2 3
        //           1 2
        //           1
    }

    public static void printLine(int number) {

        for (int i = 1; i <= number ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static void printUpperHalf (int number) {
        for (int i = 0; i < number; i++) {
            printLine(i);
        }
    }

    public static void printLowerHalf (int number) {
        for (int i = number; i > 0 ; i--) {
            printLine(i);
        }
    }



}
