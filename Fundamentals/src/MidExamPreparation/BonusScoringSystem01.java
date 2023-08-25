package MidExamPreparation;

import java.util.Scanner;

public class BonusScoringSystem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());
        double maxBonus = 0;
        double highestBonus = 0;
        int highestAttendance = 0;

        for (int student = 1; student <= students ; student++) {
            int attendance = Integer.parseInt(scanner.nextLine());
            maxBonus = (1.0 * attendance / lectures) * (5 + additionalBonus);
            if (highestBonus < maxBonus) {
                highestBonus = maxBonus;
                highestAttendance = attendance;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(highestBonus));
        System.out.printf("The student has attended %d lectures.", highestAttendance);

    }
}
