package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            if (command.startsWith("Shoot")) {
                //•	"Shoot {index} {power}"
                //o	Shoot the target at the index if it exists by reducing its value by the given power (integer value). 
                //o	Remove the target if it is shot. A target is considered shot when its value reaches 0.
                int index = Integer.parseInt(command.split(" ")[1]);
                int power = Integer.parseInt(command.split(" ")[2]);
                if (index >= 0 && index < targets.size()) {
                    int target = targets.get(index);
                    target = target - power;
                    if (target > 0) {
                        targets.set(index, target);
                    } else {
                        targets.remove(index);
                    }
                }
            } else if (command.startsWith("Add")) {
                //•	"Add {index} {value}"
                //o	Insert a target with the received value at the received index if it exists.
                //o	If not, print: "Invalid placement!"
                int index = Integer.parseInt(command.split(" ")[1]);
                int value = Integer.parseInt(command.split(" ")[2]);
                if (index >= 0 && index < targets.size()) {
                    targets.add(index, value);
                } else {
                    System.out.println("Invalid placement!");
                }
            } else if (command.startsWith("Strike")) {
                //•	"Strike {index} {radius}"
                //o	Remove the target at the given index and the ones before and after it depending on the radius.
                //o	If any of the indices in the range is invalid, print: "Strike missed!" and skip this command.
                int index = Integer.parseInt(command.split(" ")[1]);
                int radius = Integer.parseInt(command.split(" ")[2]);
                if (index - radius >= 0 && index + radius < targets.size()) {
                    targets.subList(index - radius, index + radius + 1).clear();
                } else {
                    System.out.println("Strike missed!");
                }
            }
            command = scanner.nextLine();
        }

        for (int i = 0; i < targets.size(); i++) {
            int target = targets.get(i);
            if (i == targets.size() - 1) {
                System.out.print(target);
            } else {
                System.out.print(target + "|");
            }
        }
    }
}
