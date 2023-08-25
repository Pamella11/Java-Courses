package ObjectsAndClasses.Exercise.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String input = scanner.nextLine();

        List<Vehicle> vehicleList = new ArrayList<>();

       while (!input.equals("End")) {

           String type = input.split(" ")[0];
           String model = input.split(" ")[1];
           String color = input.split(" ")[2];
           int horsePower = Integer.parseInt(input.split(" ")[3]);

           type = type.substring(0,1).toUpperCase() + type.substring(1).toLowerCase();

           Vehicle vehicle = new Vehicle(type, model, color, horsePower);
           vehicleList.add(vehicle);

           input = scanner.nextLine();
       }
        input = scanner.nextLine();

       while (!input.equals("Close the Catalogue")) {

           for (Vehicle vehicle : vehicleList) {
               if (vehicle.getModel().equals(input)){
                   System.out.println("Type: " + vehicle.getType());
                   System.out.println("Model: " + vehicle.getModel());
                   System.out.println("Color: " + vehicle.getColor());
                   System.out.println("Horsepower: " + vehicle.getHorsePower());
               }
           }

           input = scanner.nextLine();
       }

        double sumCar = 0;
        double sumTruck = 0;

        int carCount = 0;
        int truckCount = 0;

        for (Vehicle vehicle: vehicleList) {
            if (vehicle.getType().equals("Car")) {
                carCount ++;
                sumCar += vehicle.getHorsePower();
            } else if (vehicle.getType().equals("Truck")) {
                truckCount ++;
                sumTruck += vehicle.getHorsePower();
            }
        }

        if (carCount == 0) {
            System.out.println("Cars have average horsepower of: 0.00.");
        } else {
            sumCar = sumCar / carCount;
            System.out.printf("Cars have average horsepower of: %.2f.%n", sumCar);
        }

        if (truckCount == 0){
            System.out.println("Trucks have average horsepower of: 0.00.");
        } else {
            sumTruck = sumTruck / truckCount;
            System.out.printf("Trucks have average horsepower of: %.2f.", sumTruck);
        }

    }
}
