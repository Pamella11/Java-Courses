package ForLoop.Exercise;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for (int i = 1; i <= n ; i++) {

            int number = Integer.parseInt(scanner.nextLine());

            if ( number < 200) {
                p1 ++;
            } else if ( number <= 399) {
                p2 ++;
            } else if ( number <= 599) {
                p3 ++;
            } else if (number <= 799) {
                p4 ++;
            } else {
                p5 ++;
            }
        }
        double p1percent = 1.0 * p1 / n * 100;
        double p2percent = 1.0 * p2 / n * 100;
        double p3percent = 1.0 * p3 / n * 100;
        double p4percent = 1.0 * p4 / n * 100;
        double p5percent = 1.0 * p5 / n * 100;

        System.out.printf("%.2f%%%n", p1percent);
        System.out.printf("%.2f%%%n", p2percent);
        System.out.printf("%.2f%%%n", p3percent);
        System.out.printf("%.2f%%%n", p4percent);
        System.out.printf("%.2f%%", p5percent);

    }
}
