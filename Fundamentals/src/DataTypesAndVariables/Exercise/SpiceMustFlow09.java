package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class SpiceMustFlow09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int daysCounter = 0;
        int totalSum = 0;

        while (startingYield >= 100) {

            daysCounter++;

            int workersConsume = startingYield - 26;

            totalSum += workersConsume;

            startingYield -= 10;

        }
        if (totalSum >= 26) {
            totalSum -= 26;
        }

        System.out.println(daysCounter);
        System.out.println(totalSum);

    }
}
