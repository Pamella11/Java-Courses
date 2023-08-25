package ExamPreparation.Exam2020;

import java.util.Scanner;

public class CareOfPuppy_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodInKg = Integer.parseInt(scanner.nextLine());

        int foodInGr = foodInKg * 1000;

        int foodSum = 0;

        String command = scanner.nextLine();

        while (!command.equals("Adopted")) {

            int currentFood = Integer.parseInt(command);

            foodSum += currentFood;

            command = scanner.nextLine();

        }

        if (foodSum <= foodInGr) {
            System.out.printf("Food is enough! Leftovers: %d grams.", foodInGr - foodSum);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", foodSum - foodInGr);
        }
    }
}
