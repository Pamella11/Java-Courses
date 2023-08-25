package FirstStepsInCoding.MoreExercise;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vegetablePrice = Double.parseDouble(scanner.nextLine());
        double fruitPrice = Double.parseDouble(scanner.nextLine());
        int vegetableKilo = Integer.parseInt(scanner.nextLine());
        int fruitKilo = Integer.parseInt(scanner.nextLine());

        double priceInEuroVegetables = vegetableKilo * vegetablePrice;
        double priceInEuroFruits = fruitKilo * fruitPrice;
        double profit = (priceInEuroFruits + priceInEuroVegetables) / 1.94;
        System.out.printf("%.2f",profit);
    }
}
