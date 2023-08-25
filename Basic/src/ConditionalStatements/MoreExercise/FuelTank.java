package ConditionalStatements.MoreExercise;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double fuelLiters = Double.parseDouble(scanner.nextLine());

        switch (fuelType) {
            case "Diesel":
            case "Gasoline":
            case "Gas":
                if (fuelLiters >= 25){
                    System.out.printf("You have enough %s.",fuelType.toLowerCase());
                } else {
                    System.out.printf("Fill your tank with %s!",fuelType.toLowerCase());
                }
                break;
            default:
                System.out.println("Invalid fuel!");


        }


    }
}
