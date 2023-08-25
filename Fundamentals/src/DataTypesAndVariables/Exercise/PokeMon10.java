package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class PokeMon10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int originalValue = power;

        int pokesCounter = 0;

        while (power >= distance) {

            power -= distance;

            pokesCounter++;

            if (originalValue / 2 == power && exhaustionFactor > 0) {
                power = power / exhaustionFactor;
            }

        }

        System.out.println(power);
        System.out.println(pokesCounter);

    }
}
