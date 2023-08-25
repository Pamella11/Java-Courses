package Polymorphism.Exercise.Vehicles_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car = getCar(scanner);

        Truck truck = getTruck(scanner);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCommands; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            commandExecution(tokens, car, truck);
        }
        System.out.println(car);
        System.out.println(truck);
    }

    private static Truck getTruck(Scanner scanner) {
        String[] truckInfo = scanner.nextLine().split("\\s+");
        double truckFuelQuantity = Double.parseDouble(truckInfo[1]);
        double truckLitersPerKm = Double.parseDouble(truckInfo[2]);
        return new Truck(truckFuelQuantity, truckLitersPerKm);
    }

    private static Car getCar(Scanner scanner) {
        String[] carInfo = scanner.nextLine().split("\\s+");
        double fuelQuantity = Double.parseDouble(carInfo[1]);
        double litersPerKm = Double.parseDouble(carInfo[2]);
        return new Car(fuelQuantity, litersPerKm);
    }

    public static void commandExecution(String[] tokens, Car car, Truck truck) {
        String command = tokens[0];
        String vehicleType = tokens[1];

        switch (command) {
            case "Drive":
                double distance = Double.parseDouble(tokens[2]);
                if (vehicleType.equals("Car")) {
                    car.drive(distance);
                } else if (vehicleType.equals("Truck")) {
                    truck.drive(distance);
                }
                break;
            case "Refuel":
                double liters = Double.parseDouble(tokens[2]);
                if (vehicleType.equals("Car")) {
                    car.refuel(liters);
                } else if (vehicleType.equals("Truck")) {
                    truck.refuel(liters);
                }
                break;
        }

    }
}
