package ForLoop.Lab;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxN = Integer.MIN_VALUE;
        int minN = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            int n1 = Integer.parseInt(scanner.nextLine());

            if ( maxN < n1) {
                maxN = n1;
            }
            if (minN > n1){
                minN = n1;
            }
        }
        System.out.printf("Max number: %d%n", maxN);
        System.out.printf("Min number: %d", minN);
    }
}
