package ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemum = Integer.parseInt(scanner.nextLine());
        int rose = Integer.parseInt(scanner.nextLine());
        int tulip = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String weekday = scanner.nextLine();

        double chrysanthemumPrice = 0;
        double rosePrice = 0;
        double tulipPrice = 0;
        double priceSum = 0;

        //•	За закупени повече от 7 лалета през пролетта – 5% от цената на целият букет.
        //•	За закупени 10 или повече рози през зимата – 10% от цената на целият букет.
        //•	За закупени повече от 20 цветя общо през всички сезони – 20% от цената на целият букет.

        switch (season) {
            case "Spring":
                chrysanthemumPrice = chrysanthemum * 2;
                rosePrice = rose * 4.10;
                tulipPrice = tulip * 2.50;
                priceSum = chrysanthemumPrice + rosePrice + tulipPrice;
                if (tulip > 7 ){
                    priceSum = priceSum - priceSum * 0.05;
                }
                break;
            case "Summer":
                chrysanthemumPrice = chrysanthemum * 2;
                rosePrice = rose * 4.10;
                tulipPrice = tulip * 2.50;
                priceSum = chrysanthemumPrice + rosePrice + tulipPrice;

                break;
            case "Winter":
                chrysanthemumPrice = chrysanthemum * 3.75;
                rosePrice = rose * 4.50;
                tulipPrice = tulip * 4.15;
                priceSum = chrysanthemumPrice + rosePrice + tulipPrice;
                if (rose >= 10) {
                    priceSum = priceSum - priceSum * 0.1;
                }

                break;
            case "Autumn":
                chrysanthemumPrice = chrysanthemum * 3.75;
                rosePrice = rose * 4.50;
                tulipPrice = tulip * 4.15;
                priceSum = chrysanthemumPrice + rosePrice + tulipPrice;

                break;
        }

        if (weekday.equals("Y")) {
            priceSum = priceSum + priceSum * 0.15;
        }


        if (chrysanthemum + rose + tulip > 20) {
            priceSum = priceSum - priceSum * 0.2;
        }

        //priceSum = chrysanthemumPrice + rosePrice + tulipPrice;


        double finalPrice = priceSum + 2;

        System.out.printf("%.2f", finalPrice);




    }
}
