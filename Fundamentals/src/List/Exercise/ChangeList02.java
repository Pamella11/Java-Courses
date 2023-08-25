package List.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

             if (command.startsWith("Delete")) {
                 //•	Delete {element} - delete all elements in the array which are equal to the given element
                int elementToDelete = Integer.parseInt(command.split(" ")[1]);
                 for (int i = 0; i <= numbers.size() - 1 ; i++) {
                     int numberInList = numbers.get(i);
                     if (numberInList == elementToDelete) {
                         numbers.remove(Integer.valueOf(elementToDelete));
                     }
                 }
             } else if (command.startsWith("Insert")) {
                 //•	Insert {element} {position} - insert element at the given position
                 int elementToInsert = Integer.parseInt(command.split(" ")[1]);
                 int index = Integer.parseInt(command.split(" ")[2]);

                 numbers.add(index, elementToInsert);
             }


            command = scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));


    }
}
