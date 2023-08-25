package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManWar03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> statusOfPrivateShip = Arrays
                .stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> statusOfWarship = Arrays
                .stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maximumHealth = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        boolean stalemate = true;

        while (!command.equals("Retire")) {

            if (command.startsWith("Fire")) {
                //•	"Fire {index} {damage}" - the pirate ship attacks the warship with the given damage at that section.
                int index = Integer.parseInt(command.split(" ")[1]);
                int damage = Integer.parseInt(command.split(" ")[2]);
                // If the section breaks (health <= 0) the warship sinks, print the following and stop the program: "You won! The enemy ship has sunken."
                // Check if the index is valid and if not, skip the command.
                if (index >= 0 && index < statusOfWarship.size()) {
                    int number = statusOfWarship.get(index);
                    statusOfWarship.set(index, number - damage);
                    if (statusOfWarship.get(index) <= 0) {
                        System.out.println("You won! The enemy ship has sunken.");
                        stalemate = false;
                        break;
                    }
                }
            } else if (command.startsWith("Defend")) {
                //"Defend {startIndex} {endIndex} {damage}" - the warship attacks the pirate ship with the given damage at that range (indexes are inclusive).
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);
                int damage = Integer.parseInt(command.split(" ")[3]);
                // Check if both indexes are valid and if not, skip the command.
                if (startIndex >= 0 && startIndex < statusOfPrivateShip.size() && endIndex > 0 && endIndex < statusOfPrivateShip.size() && startIndex < endIndex) {
                    for (int i = startIndex; i <= endIndex; i++) {
                        int number = statusOfPrivateShip.get(i);
                        number -= damage;
                        statusOfPrivateShip.set(i, number);
                        if (statusOfPrivateShip.get(i) <= 0) {
                            System.out.println("You lost! The pirate ship has sunken.");
                            stalemate = false;
                            break;
                        }
                    }
                }
                // If the section breaks (health <= 0) the pirate ship sinks, print the following and stop the program:
                // "You lost! The pirate ship has sunken."

            } else if (command.startsWith("Repair")) {
                //"Repair {index} {health}" - the crew repairs a section of the pirate ship with the given health.
                int index = Integer.parseInt(command.split(" ")[1]);
                int health = Integer.parseInt(command.split(" ")[2]);
                // Check if the index is valid and if not, skip the command.
                if (index >= 0 && index < statusOfPrivateShip.size()) {
                    int number = statusOfPrivateShip.get(index);
                    // The health of the section cannot exceed the maximum health capacity.
                    int newNum = statusOfPrivateShip.set(index, number + health);
                    if (newNum > maximumHealth) {
                        newNum = maximumHealth;
                    }
                }
            } else if (command.equals("Status")) {
                //•	"Status" - prints the count of all sections of the pirate ship that need repair soon,
                // which are all sections that are lower than 20% of the maximum health capacity.
                int counter = 0;
                for (int number : statusOfPrivateShip) {
                    if (number < maximumHealth * 0.2) {
                        counter++;
                    }
                }
                // Print the following:
                //"{count} sections need repair."
                System.out.printf("%d sections need repair.%n", counter);

            }


            command = scanner.nextLine();
        }
        //In the end, if a stalemate occurs, print the status of both ships, which is the sum of their individual sections, in the following format:
        //"Pirate ship status: {pirateShipSum}
        //Warship status: {warshipSum}"
        if (stalemate) {
            int sum = 0;
            for (Integer integer : statusOfPrivateShip) {
                sum += integer;
            }
            System.out.println("Pirate ship status: " + sum);
            int sum1 = 0;
            for (Integer integer : statusOfWarship) {
                sum1 += integer;
            }
            System.out.println("Warship status: " + sum1);
        }
    }
}
