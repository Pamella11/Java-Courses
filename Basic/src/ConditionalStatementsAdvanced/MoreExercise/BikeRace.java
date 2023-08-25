package ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniors = Integer.parseInt(scanner.nextLine());
        int seniors = Integer.parseInt(scanner.nextLine());
        String roadType = scanner.nextLine();

        double price = 0;


        switch (roadType) {
            case "trail":
                price = juniors * 5.50 + seniors * 7;
                break;
            case "cross-country":
                price = juniors * 8 + seniors * 9.50;
                if (juniors + seniors >= 50 ) {
                    price = price - price * 0.25;
                }
                break;
            case "downhill":
                price = juniors * 12.25 + seniors * 13.75;
                break;
            case "road":
                price = juniors * 20 + seniors * 21.50;
                break;
        }
        double expanses = price - price * 0.05;

        System.out.printf("%.2f", expanses);


    }
}
