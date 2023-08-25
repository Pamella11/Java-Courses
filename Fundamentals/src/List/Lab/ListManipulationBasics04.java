package List.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
             //34 100 1 2 2 8 30
            //4 53 6 8 43 3
            if (command.startsWith("Add")) {
                //Add {number}: add a number to the end of the list
                int numberToAdd = Integer.parseInt(command.split(" ")[1]);
                numbers.add(numberToAdd);
            } else if (command.contains("Remove") && !command.contains("RemoveAt")) {
                //Remove {number}: remove a number from the list
                int numberToRemove = Integer.parseInt(command.split(" ")[1]);
                numbers.remove(Integer.valueOf(numberToRemove)); //numbers.remove(Integer.valueOf(elementToRemove));
            } else if (command.contains("RemoveAt")) {
                //RemoveAt {index}: remove a number at a given index
                int index = Integer.parseInt(command.split(" ")[1]);
                numbers.remove(index);
            } else if (command.startsWith("Insert")) {
                //Insert {number} {index}: insert a number at a given index
                int numberToInsert = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                numbers.add(index, numberToInsert);
            }


            command = scanner.nextLine();
        }

        for (Integer number: numbers
             ) {
            System.out.print(number + " ");

        }

    }
}
