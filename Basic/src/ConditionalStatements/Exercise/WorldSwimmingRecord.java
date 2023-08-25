package ConditionalStatements.Exercise;

import java.util.Scanner;

public class WorldSwimmingRecord  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());

        double timeInSeconds = meters * time;
        double seconds = Math.floor((meters/15)) * 12.5;
        double totalTime =  timeInSeconds + seconds;

        if (record>totalTime) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totalTime);

        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",totalTime-record);

        }
    }
}
