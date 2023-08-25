package ConditionalStatements.MoreExercise;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Такси. Начална такса: 0.70 лв. Дневна тарифа: 0.79 лв. / км. Нощна тарифа: 0.90 лв. / км.
        //•	Автобус. Дневна / нощна тарифа: 0.09 лв. / км. Може да се използва за разстояния минимум 20 км.
        //•	Влак. Дневна / нощна тарифа: 0.06 лв. / км. Може да се използва за разстояния минимум 100 км.

        int kms = Integer.parseInt(scanner.nextLine());
        String travel = scanner.nextLine();
        double price = 0;

        if (kms < 20) {
            if ("day".equals(travel)) {
                price = 0.70 + kms * 0.79;
            } else if ("night".equals(travel)) {
                price = 0.70 + kms * 0.90;
            }
        } else if (kms >= 100) {
            price = kms * 0.06;

        } else {
            price = kms * 0.09;
        }

        System.out.printf("%.2f", price);
    }
}
