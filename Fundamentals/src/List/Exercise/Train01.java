package List.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> passengers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.startsWith("Add")) {
                //•	Add {passengers} - add a wagon to the end with the given number of passengers
                int wagonToAdd = Integer.parseInt(command.split(" ")[1]);
                passengers.add(wagonToAdd);
            } else {
                //•	{passengers} -  find an existing wagon to fit all the passengers (starting from the first wagon)
                int passengersToFit = Integer.parseInt(command.split(" ")[0]);
                for (int i = 0; i <= passengers.size() - 1; i++) {
                    int passengersInWagon = passengers.get(i);
                    if (passengersInWagon + passengersToFit <= maxCapacity ) {
                        passengers.set(i, passengersInWagon + passengersToFit);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }

        System.out.println(passengers.toString().replaceAll("[\\[\\],]", ""));

    }
}

