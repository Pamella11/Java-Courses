package ConditionalStatements.MoreExercise;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int restDays = Integer.parseInt(scanner.nextLine());

        int workDays = 365 - restDays;
        int playTime = workDays * 63 + restDays * 127;
        int diff = Math.abs(30000 - playTime);

        int hours = diff / 60;
        int minutes = diff % 60;

        if (30000 > playTime) {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hours, minutes);
        } else {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hours, minutes);
        }


    }
}
