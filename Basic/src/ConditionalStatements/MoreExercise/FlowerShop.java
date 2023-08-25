package ConditionalStatements.MoreExercise;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Магнолии – 3.25 лева
        //•	Зюмбюли – 4 лева
        //•	Рози – 3.50 лева
        //•	Кактуси – 8 лева
        //От общата сума, Мария трябва да плати 5% данъци.

        int mongolia = Integer.parseInt(scanner.nextLine());
        int hyacinth = Integer.parseInt(scanner.nextLine());
        int rose = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double totalSumOfFlowers = mongolia * 3.25 + hyacinth * 4 + rose * 3.50 + cactus * 8;
        double finalSum = totalSumOfFlowers - totalSumOfFlowers * 0.05;

        if (finalSum >= giftPrice) {
            System.out.printf("She is left with %.0f leva.", Math.floor(finalSum-giftPrice));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(giftPrice-finalSum));
        }


    }
}
