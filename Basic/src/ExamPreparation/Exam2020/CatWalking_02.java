package ExamPreparation.Exam2020;

import java.util.Scanner;

public class CatWalking_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutes = Integer.parseInt(scanner.nextLine());
        int walks = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        int minWalking = walks * minutes;
        int caloriesBurn = minWalking * 5;
        int caloriesHalf = calories / 2;

        if (caloriesBurn >= caloriesHalf) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", caloriesBurn );
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", caloriesBurn);
        }

    }
}
