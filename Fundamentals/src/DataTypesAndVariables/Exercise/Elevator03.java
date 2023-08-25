package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class Elevator03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int courseCounter = people / capacity;

        if (people % capacity != 0) {
            courseCounter += 1;
        }

        System.out.println(courseCounter);


    }
}
