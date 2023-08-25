package ConditionalStatements.Exercise;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfSerial = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());

        double lunchTime = breakDuration * 0.125;
        double restTime = breakDuration * 0.25;

        double timeLeft = breakDuration - lunchTime - restTime;

        if (timeLeft>=episodeDuration){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameOfSerial, Math.ceil(timeLeft-episodeDuration));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",nameOfSerial, Math.ceil(episodeDuration-timeLeft));
        }
    }
}
