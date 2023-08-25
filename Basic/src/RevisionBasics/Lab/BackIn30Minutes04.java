package RevisionBasics.Lab;

import java.util.Scanner;

public class BackIn30Minutes04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialHours = Integer.parseInt(scanner.nextLine());
        int initialMinutes = Integer.parseInt(scanner.nextLine());

        //Print on the console the time after 30 minutes. The result should be in the format "hh:mm".
        // The hours have one or two numbers, and the minutes always have two numbers (with leading zero).

        int minutesSum = initialHours * 60 + initialMinutes + 30;

        int hours = minutesSum / 60;
        int mins = minutesSum % 60;

        if (hours > 23) {
            hours = 0;
        }

        System.out.printf("%d:%02d", hours, mins);

    }
}
