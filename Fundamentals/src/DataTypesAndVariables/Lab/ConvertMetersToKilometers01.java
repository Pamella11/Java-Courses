package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class ConvertMetersToKilometers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meters = Integer.parseInt(scanner.nextLine());

        double kms = 1.0 * meters / 1000;
        System.out.printf("%.2f", kms);
    }
}
