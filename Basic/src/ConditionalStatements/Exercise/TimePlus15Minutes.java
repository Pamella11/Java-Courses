package ConditionalStatements.Exercise;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int totalTime = (hours * 60 + minutes) + 15;
        int newHour = totalTime / 60;
        int newMinutes = totalTime % 60;
        if (newHour >= 24) {
            newHour = 0;
            System.out.printf("%d:%02d", newHour, newMinutes);
        } else {
            System.out.printf("%d:%02d", newHour, newMinutes);
        }
    }
}
