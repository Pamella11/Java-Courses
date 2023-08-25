package ForLoop.Exercise;

import java.util.Scanner;

public class TennisRankList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournamentNumber = Integer.parseInt(scanner.nextLine());
        int primePoints = Integer.parseInt(scanner.nextLine());

        int Points = 0;
        int sumAllPoints = primePoints;
        int winsCount = 0;


        for (int i = 1; i <= tournamentNumber; i++) {

            String tournamentStage = scanner.nextLine();

            switch (tournamentStage) {
                case "W":
                    sumAllPoints += 2000;
                    winsCount ++;
                    break;
                case "F":
                    sumAllPoints += 1200;
                    break;
                case "SF":
                    sumAllPoints += 720;
                    break;
            }
        }
        int tournamentPoints = sumAllPoints - primePoints;
        int averagePoints = tournamentPoints / tournamentNumber;
        double winningPercent = ( 1.0 * winsCount / tournamentNumber) * 100;

        System.out.printf("Final points: %d%n", sumAllPoints);
        System.out.printf("Average points: %d%n", averagePoints);
        System.out.printf("%.2f%%",winningPercent);

    }
}
