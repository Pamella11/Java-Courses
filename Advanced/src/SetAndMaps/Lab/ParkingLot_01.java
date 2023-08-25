package SetAndMaps.Lab;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> carNumbers = new LinkedHashSet<>();

        String input = scanner.nextLine();

        while (!input.equals("END")){

            String[] parts = input.split(", ");

            String command = parts[0];
            String car = parts[1];

            if (command.equals("IN")){
                carNumbers.add(car);
            } else if (command.equals("OUT")) {
                carNumbers.remove(car);
            }

            input = scanner.nextLine();
        }

        if (carNumbers.isEmpty()){
            System.out.println("Parking Lot is Empty");
        } else {
            for (String car:carNumbers) {
                System.out.println(car);
            }
        }

    }

}
