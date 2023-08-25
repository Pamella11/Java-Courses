package ExamPreparation.Exam2020;

import java.util.Scanner;

public class FoodForPets_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());

        int dogFoodSum = 0;
        int catFoodSum = 0;
        int daysCount = 0;
        double biscuit = 0;

        for (int i = 1; i <= days ; i++) {
            int dogFood = Integer.parseInt(scanner.nextLine());
            int catFood = Integer.parseInt(scanner.nextLine());

            daysCount ++;
            dogFoodSum += dogFood;
            catFoodSum += catFood;

            if (daysCount % 3 == 0) {
                biscuit += Math.round(dogFood + catFood)* 0.1;
            }

        }
         int totalFoodSum = dogFoodSum + catFoodSum;
         double totalFoodPercent = (totalFoodSum / food) * 100;
         double totalDogFoodPercent = (1.0 * dogFoodSum / totalFoodSum) * 100;
         double totalCatFoodPercent = (1.0 * catFoodSum / totalFoodSum) * 100;

        System.out.printf("Total eaten biscuits: %.0fgr.%n", biscuit);
        System.out.printf("%.2f%% of the food has been eaten.%n", totalFoodPercent);
        System.out.printf("%.2f%% eaten from the dog.%n", totalDogFoodPercent);
        System.out.printf("%.2f%% eaten from the cat.", totalCatFoodPercent);


    }
}
