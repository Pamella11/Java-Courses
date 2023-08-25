package ExamPreparation.Exam2019;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int trainingDays = Integer.parseInt(scanner.nextLine());
        double kms = Double.parseDouble(scanner.nextLine());

        double totalKms = kms;

        boolean isFirstDay = true;

        for (int i = 0; i <= trainingDays; i++) {

            if (isFirstDay) {
                isFirstDay = false;
                continue;
            }
            double percent = Double.parseDouble(scanner.nextLine());

            percent = percent / 100;
            percent = percent * kms;

            kms = kms + percent;
            totalKms += kms;

        }

        if (totalKms >= 1000) {
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(totalKms - 1000));
        } else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(1000 - totalKms));
        }


    }
}
