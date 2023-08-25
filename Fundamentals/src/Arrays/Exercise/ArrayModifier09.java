package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String[] commandParts = command.split(" ");

            if (command.contains("swap")) {

                int index1 = Integer.parseInt(commandParts[1]);
                int index2 = Integer.parseInt(commandParts[2]);

                int element1 = array[index1];
                int element2 = array[index2];

                array[index1] = element2;
                array[index2] = element1;

            } else if (command.contains("multiply")) {

                int index1 = Integer.parseInt(commandParts[1]);
                int index2 = Integer.parseInt(commandParts[2]);

                int element1 = array[index1];
                int element2 = array[index2];

                int product = element1 * element2;
                array[index1] = product;

            } else if (command.equals("decrease")) {
                for (int i = 0; i <= array.length - 1; i++) {
                    array[i] -= 1;
                }
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i <= array.length - 1; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");

        }


    }
}
