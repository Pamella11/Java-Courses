package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class Snowballs11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int snowballs = Integer.parseInt(scanner.nextLine());

        long highestValue = Long.MIN_VALUE;

        int snow = 0;
        int time = 0;
        int quality = 0;

        for (int i = 0; i < snowballs; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            int snowball = snowballSnow / snowballTime;

            long snowballValue = (long) Math.pow(snowball, snowballQuality);

            if (snowballValue > highestValue) {
                highestValue = snowballValue;
                snow = snowballSnow;
                time = snowballTime;
                quality = snowballQuality;
            }
        }

        System.out.printf("%d : %d = %d (%d)", snow, time, highestValue, quality);
    }
}
