package WorkingWithAbstraction.Lab;

import java.util.Scanner;

public class RhombusOfStars_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            printRow(i, number - i);
        }

        for (int i = number - 1; i > 0; i--) {
            printRow(i, number - i);
        }
    }

    public static void printRow(int starsCounter, int spacesCounter) {
        for (int i = 0; i < spacesCounter; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < starsCounter; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
