package ExamPreparation.Prelim;

import java.util.Scanner;

public class Darts_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String player = scanner.nextLine();
        String text = scanner.nextLine();

        int startingPoints = 301;

        int successfulShots = 0;
        int missedShots = 0;

        while (!text.equals("Retire")){

            int currentPoints = Integer.parseInt(scanner.nextLine());

            int points = 0;

            switch (text) {
                case "Single":
                    points = currentPoints;
                    break;
                case "Double":
                    points = currentPoints * 2;
                    break;
                case "Triple":
                    points = currentPoints * 3;
                    break;
            }
            if (startingPoints >= points) {
                startingPoints -= points;
                successfulShots ++ ;
            }   else {
                missedShots ++;
            }

            if (startingPoints == 0) {
                break;
            }


            text = scanner.nextLine();
        }

        if (startingPoints == 0) {
            System.out.printf("%s won the leg with %d shots.", player, successfulShots);
        } else {
            System.out.printf("%s retired after %d unsuccessful shots.", player, missedShots);
        }


    }
}
