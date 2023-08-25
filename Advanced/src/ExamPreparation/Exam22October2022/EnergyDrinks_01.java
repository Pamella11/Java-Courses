package ExamPreparation.Exam22October2022;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class EnergyDrinks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] milligramsCaffeine = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] energyDrinks = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        //maximum caffeine Stamat can have for the night is 300 milligrams, and his initial is always 0.
        ArrayDeque<Integer> stackCaffeine = new ArrayDeque<>();
        ArrayDeque<Integer> deckDrinks = new ArrayDeque<>();

        for (int mil: milligramsCaffeine) {
            stackCaffeine.push(mil);
        }

        for (int drink: energyDrinks) {
            deckDrinks.offer(drink);
        }

        int totalCaffeine = 0;
        int limit = 300;

        while (!stackCaffeine.isEmpty()){

            if (deckDrinks.isEmpty()){
                break;
            }
            int caffeine = stackCaffeine.pop();
            int drink = deckDrinks.poll();

            int result = caffeine * drink;

            if (result <= limit){
                limit -= result;
                totalCaffeine += result;
            } else {
                deckDrinks.offer(drink);
                if (totalCaffeine - 30 >= 0 && limit + 30 <= 300){
                    totalCaffeine -= 30;
                    limit += 30;
                }
            }

        }

        if (!deckDrinks.isEmpty()){
            StringBuilder sb = new StringBuilder();
            sb.append("Drinks left: ");
            while (!deckDrinks.isEmpty()) {
                sb.append(deckDrinks.pop());
                if (!deckDrinks.isEmpty()) {
                    sb.append(", ");
                }
            }
            System.out.println(sb.toString());
        } else {
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
        }

        System.out.printf("Stamat is going to sleep with %d mg caffeine.", totalCaffeine);

    }
}
