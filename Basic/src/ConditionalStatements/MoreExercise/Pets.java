package ConditionalStatements.MoreExercise;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int food = Integer.parseInt(scanner.nextLine());
        double dogFood = Double.parseDouble(scanner.nextLine());
        double catFood = Double.parseDouble(scanner.nextLine());
        double turtleFood = Double.parseDouble(scanner.nextLine());

        double dogFoodNeeded = days * dogFood;
        double catFoodNeeded = days * catFood;
        double turtleFoodNeeded = (days * turtleFood) / 1000;

        double totalFood = dogFoodNeeded + catFoodNeeded + turtleFoodNeeded;


        if (totalFood <= food) {

            System.out.printf("%.0f kilos of food left.", Math.floor(food-totalFood));

        } else {

            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(totalFood-food));
        }
    }
}
