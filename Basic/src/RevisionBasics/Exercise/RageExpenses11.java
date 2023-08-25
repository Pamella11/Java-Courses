package RevisionBasics.Exercise;

import java.util.Scanner;

public class RageExpenses11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headset = Double.parseDouble(scanner.nextLine());
        double mouse = Double.parseDouble(scanner.nextLine());
        double keyboard = Double.parseDouble(scanner.nextLine());
        double display = Double.parseDouble(scanner.nextLine());

        double expenses = 0;

        for (int i = 1; i <= lostGames; i++) {

            if (i % 2 == 0) {
                expenses += headset;
            }
            if (i % 3 == 0) {
                expenses += mouse;
            }
            if (i % 6 == 0) {
                expenses += keyboard;
            }
            if (i % 12 == 0) {
                expenses += display;
            }

        }

        System.out.printf("Rage expenses: %.2f lv.", expenses);

    }
}
