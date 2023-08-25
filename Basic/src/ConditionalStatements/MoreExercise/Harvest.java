package ConditionalStatements.MoreExercise;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int area = Integer.parseInt(scanner.nextLine());
        double grape = Double.parseDouble(scanner.nextLine());
        int wineNeeded = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double allGrape = area * grape;
        double wine = (allGrape * 0.4) / 2.5;

        if (wine >= wineNeeded) {
            double wineLeft = wine - wineNeeded;
            double winePerWorker = wineLeft / workers;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(wine));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(wineLeft), Math.ceil(winePerWorker));


        } else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(wineNeeded-wine));
        }



    }
}
