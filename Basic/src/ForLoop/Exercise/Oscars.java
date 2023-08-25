package ForLoop.Exercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double primeAcademyPoints = Double.parseDouble(scanner.nextLine());
        int evaluatorsCount = Integer.parseInt(scanner.nextLine());

        double sumAllPoints = primeAcademyPoints;


        for (int i = 1; i <= evaluatorsCount; i++) {

            String evaluatorName = scanner.nextLine();
            double evaluatorPoints = Double.parseDouble(scanner.nextLine());
            double currentPoints = (evaluatorName.length() * evaluatorPoints) / 2;

            sumAllPoints += currentPoints;

            if (sumAllPoints >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, sumAllPoints);
                break;
            }
        }
        if (sumAllPoints < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, Math.abs(1250.5 - sumAllPoints));
        }

    }
}
