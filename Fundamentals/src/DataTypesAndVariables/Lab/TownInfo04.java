package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class TownInfo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfTown = scanner.nextLine();
        long population = Long.parseLong(scanner.nextLine());
        short area = Short.parseShort(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.", nameOfTown, population, area);
    }
}
