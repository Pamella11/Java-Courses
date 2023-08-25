package Arrays.Lab;

import java.util.Scanner;

public class PrintNumbersInReverseOrder02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] initial = new int[n];

        for (int i = 0; i < n; i++) {

            int currentN = Integer.parseInt(scanner.nextLine());

            initial[i] = currentN;
        }

        for (int i = initial.length - 1; i >= 0 ; i--) {

            System.out.print(initial[i] + " ");

        }



    }
}
