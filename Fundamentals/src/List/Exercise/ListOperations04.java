package List.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String operations = scanner.nextLine();

        while (!operations.equals("End")) {

            if (operations.startsWith("Add")) {
                //•	Add {number} - add number at the end
                int numberToAdd = Integer.parseInt(operations.split(" ")[1]);
                numbers.add(numberToAdd);
            } else if (operations.startsWith("Insert")) {
                //•	Insert {number} {index} - insert number at given index
                int numberToInsert = Integer.parseInt(operations.split("\\s+")[1]);
                int index = Integer.parseInt(operations.split("\\s+")[2]);
                if (index >= 0 && index <= numbers.size() - 1) {
                    numbers.add(index, numberToInsert);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (operations.startsWith("Remove")) {
                //•	Remove {index} - remove that index
                int index = Integer.parseInt(operations.split(" ")[1]);
                if (index >= 0 && index <= numbers.size() - 1) {
                    numbers.remove(index);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (operations.contains("left")) {
                //•	Shift left {count} - first number becomes last 'count' times
                int count = Integer.parseInt(operations.split(" ")[2]);
                for (int i = 0; i < count; i++) {
                    int number = numbers.get(0);
                    numbers.add(number);
                    numbers.remove(0);
                }
            } else if (operations.contains("right")) {
                //•	Shift right {count} - last number becomes first 'count' times
                int count = Integer.parseInt(operations.split(" ")[2]);
                for (int i = 0; i < count; i++) {
                    int lastNum = numbers.get(numbers.size() - 1);
                    numbers.add(0, lastNum);
                    numbers.remove(numbers.size() - 1);
                }
            }


            operations = scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));


    }
}
