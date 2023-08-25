package ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        double nightPrice = 0;
        String sport = "";

        switch (season) {
            case "Winter":
                if (groupType.equals("boys")) {
                    nightPrice = students * nights * 9.60;
                    sport = "Judo";

                } else if (groupType.equals("mixed")) {
                    nightPrice = students * nights * 10;
                    sport = "Ski";

                } else if (groupType.equals("girls")) {
                    nightPrice = students * nights * 9.60;
                    sport = "Gymnastics";
                }
                break;
            case "Spring":
                if (groupType.equals("boys")) {
                    nightPrice = students * nights * 7.20;
                    sport = "Tennis";

                } else if (groupType.equals("mixed")) {
                    nightPrice = students * nights * 9.50;
                    sport = "Cycling";

                } else if (groupType.equals("girls")) {
                    nightPrice = students * nights * 7.20;
                    sport = "Athletics";
                }
                break;
            case "Summer":
                if (groupType.equals("boys")) {
                    nightPrice = students * nights * 15;
                    sport = "Football";

                } else if (groupType.equals("mixed")) {
                    nightPrice = students * nights * 20;
                    sport = "Swimming";

                } else if (groupType.equals("girls")) {
                    nightPrice = students * nights * 15;
                    sport = "Volleyball";
                }
                break;
        }

        if (students >= 50) {
            nightPrice = nightPrice * 0.5;
        } else if (students >= 20) {
            nightPrice = nightPrice * 0.85;
        } else if (students >= 10) {
            nightPrice = nightPrice * 0.95;
        }

        System.out.printf("%s %.2f lv.", sport, nightPrice);


    }
}
