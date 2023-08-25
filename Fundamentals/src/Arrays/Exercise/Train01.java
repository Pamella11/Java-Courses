package Arrays.Exercise;

import java.util.Scanner;

public class Train01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());

        int sumOfPeople = 0;

        for (int i = 0; i < wagons; i++) {

            int people = Integer.parseInt(scanner.nextLine());

            System.out.print(people + " ");

            sumOfPeople += people;

        }

        System.out.println();
        System.out.println(sumOfPeople);

    }
}
