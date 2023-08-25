package FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NeedForSpeedIII03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> mileageMap = new LinkedHashMap<>();
        Map<String, Integer> fuelMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            //"{car}|{mileage}|{fuel}"
            String[] command = scanner.nextLine().split("\\|");
            String car = command[0];
            int mileage = Integer.parseInt(command[1]);
            int fuel = Integer.parseInt(command[2]);
            mileageMap.put(car, mileage);
            fuelMap.put(car, fuel);
        }

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {

            String[] inputParts = input.split(" : ");

            String command = inputParts[0];
            String carName = inputParts[1];

            if (command.equals("Drive")) {
                //•	"Drive : {car} : {distance} : {fuel}":
                int distance = Integer.parseInt(inputParts[2]);
                int fuel = Integer.parseInt(inputParts[3]);

                if (fuelMap.get(carName) >= fuel) {
                    int currentFuel = fuelMap.get(carName);
                    fuelMap.put(carName, currentFuel - fuel);

                    int currentMileage = mileageMap.get(carName);
                    mileageMap.put(carName, currentMileage + distance);

                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", carName, distance, fuel);

                    if (mileageMap.get(carName) >= 100000) {
                        System.out.printf("Time to sell the %s!%n", carName);
                        mileageMap.remove(carName);
                        fuelMap.remove(carName);
                    }
                } else {
                    System.out.println("Not enough fuel to make that ride");
                }
            } else if (command.equals("Refuel")) {
                //•	"Refuel : {car} : {fuel}":
                int fuel = Integer.parseInt(inputParts[2]);

                int currentFuel = fuelMap.get(carName);
                int sum = 0;

                if (currentFuel + fuel <= 75) {
                    sum = currentFuel + fuel;
                    fuelMap.put(carName, sum);
                    System.out.printf("%s refueled with %d liters%n", carName, fuel);
                } else {
                    sum = 75 - currentFuel;
                    fuelMap.put(carName, 75);
                    System.out.printf("%s refueled with %d liters%n", carName, sum);
                }

            } else if (command.equals("Revert")) {
                //•	"Revert : {car} : {kilometers}":
                int kms = Integer.parseInt(inputParts[2]);
                int currentMileage = mileageMap.get(carName);
                if (currentMileage - kms < 10000) {
                    mileageMap.put(carName, 10000);
                } else {
                    mileageMap.put(carName, currentMileage - kms);
                    System.out.printf("%s mileage decreased by %d kilometers%n", carName, kms);
                }
            }

            input = scanner.nextLine();
        }
        //"{car} -> Mileage: {mileage} kms, Fuel in the tank: {fuel} lt."
        for (Map.Entry<String, Integer> entry : mileageMap.entrySet()) {

            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey(), entry.getValue(), fuelMap.get(entry.getKey()));

        }


    }
}
