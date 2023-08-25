package DefiningClasses.CarInfo_01;

import DefiningClasses.CarInfo_01.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String[] cars = scanner.nextLine().split("\\s+");

            String brand = cars[0];
            String model = cars[1];
            int hp = Integer.parseInt(cars[2]);

            Car car = new Car(brand, model, hp);

            System.out.println(car.toString());
        }
    }
}
