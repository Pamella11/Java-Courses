package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayModifier02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
             if (command.startsWith("swap")) {
                 //"swap {index1} {index2}" takes two elements and swap their places.
               int index1 = Integer.parseInt(command.split(" ")[1]);
               int index2 = Integer.parseInt(command.split(" ")[2]);
               
               int n1 = numbers.get(index1);
               int n2 = numbers.get(index2);
               
               numbers.set(index1, n2);
               numbers.set(index2, n1);
             } else if (command.startsWith("multiply")) {
                 //"multiply {index1} {index2}" takes element at the 1st index and multiply it with the element at 2nd index.
                 // Save the product at the 1st index.
                 int index1 = Integer.parseInt(command.split(" ")[1]);
                 int index2 = Integer.parseInt(command.split(" ")[2]);

                 int n1 = numbers.get(index1);
                 int n2 = numbers.get(index2);

                 numbers.set(index1, n1 * n2);
             } else if (command.equals("decrease")) {
                 //•	"decrease" decreases all elements in the array with 1.
                 for (int i = 0; i < numbers.size(); i++) {
                     int num = numbers.get(i);
                     numbers.set(i, num - 1);
                 }
             }

            command = scanner.nextLine();
        }

        for (int i = 0; i < numbers.size(); i++) {
            int target = numbers.get(i);
            if (i == numbers.size() - 1) {
                System.out.print(target);
            } else {
                System.out.print(target + ", ");
            }
        }
    }
}
//86, 7382, 2369942, -124, 41, 89, -3