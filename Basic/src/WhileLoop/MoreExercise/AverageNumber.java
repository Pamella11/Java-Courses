package WhileLoop.MoreExercise;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int counter = 0;

        for (int i = 0; i < n; i++) {

            int number = Integer.parseInt(scanner.nextLine());

            counter ++;

            sum += number;

        }

        double average = 1.0 * sum / n;

        System.out.printf("%.2f", average);



    }
}
