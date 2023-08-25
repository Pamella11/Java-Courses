package DefiningClasses.SpeedRacing_03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        List<Car> carsList = new LinkedList<>();

        for (int i = 0; i < lines; i++) {

            String[] carInfo = scanner.nextLine().split("\\s+");

            String model = carInfo[0];
            int fuelAmount = Integer.parseInt(carInfo[1]);
            double fuelPerKm = Double.parseDouble(carInfo[2]);

            Car car = new Car(model, fuelAmount, fuelPerKm, 0);
            carsList.add(car);
        }

        String command = scanner.nextLine();

        while (!command.endsWith("End")){
            //"Drive {CarModel} {amountOfKm}"
            String[] commandParts = command.split("\\s+");

            String model = commandParts[1];
            int kmAmount = Integer.parseInt(commandParts[2]);

            //if (carsList.)
            Car currCar = carsList
                    .stream()
                    .filter(car -> car.getModel().equals(model)).findFirst().orElse(null);

            if (!currCar.canCarBeDriven(kmAmount)){
                System.out.println("Insufficient fuel for the drive");
            }
            command = scanner.nextLine();
        }

        carsList.forEach(c -> System.out.println(c.toString()));
    }
}
