package FirstStepsInCoding.MoreExercise;

import java.util.Scanner;

public class FishLand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceMackerelPerKilo = Double.parseDouble(scanner.nextLine());
        double priceSpratPerKilo = Double.parseDouble(scanner.nextLine());
        double bonitoKilo = Double.parseDouble(scanner.nextLine());
        double scadPerKilo = Double.parseDouble(scanner.nextLine());
        int musselsPerKilo = Integer.parseInt(scanner.nextLine());

        double bonitoPrice = priceMackerelPerKilo + priceMackerelPerKilo * 0.6;
        double scadPrice = priceSpratPerKilo + priceSpratPerKilo * 0.8;
        double musselsPrice = 7.5;
        double finalSum = bonitoKilo * bonitoPrice + scadPerKilo*scadPrice + musselsPerKilo*musselsPrice;

        System.out.printf("%.2f",finalSum);


    }
}
