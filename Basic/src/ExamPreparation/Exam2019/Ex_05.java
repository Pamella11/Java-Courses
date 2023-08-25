package ExamPreparation.Exam2019;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int trainingDays = Integer.parseInt(scanner.nextLine());
        double kms = Double.parseDouble(scanner.nextLine());

        double kmsSum = 0;
        double allKmsSum = 0;
        double totalKms = 0;

        for (int i = 0; i < trainingDays; i++) {

            int percent = Integer.parseInt(scanner.nextLine());

            if (i == 0) {
                kmsSum = kms + kms * (1.0 * percent / 100);
            } else {
                kmsSum = kmsSum + kmsSum * (1.0 * percent / 100);
            }

            allKmsSum += kmsSum;

        }

        totalKms = allKmsSum + kms;
        if (allKmsSum >= 1000) {
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(totalKms - 1000));
        } else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(1000 - totalKms));
        }

    }
}
