package Exam;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double flourPrice = Double.parseDouble(scanner.nextLine());
        double eggPrice = Double.parseDouble(scanner.nextLine());
        double apronPrice = Double.parseDouble(scanner.nextLine());

        int freeFlour = students / 5;

        double apron = Math.ceil(students + students * 0.2);
        double totalPrice = apronPrice * apron + (eggPrice * 10 * students) + flourPrice * (students - freeFlour);

        if (totalPrice <= budget){
            System.out.printf("Items purchased for %.2f$.", totalPrice);
        } else {
            System.out.printf("%.2f$ more needed.",totalPrice - budget);
        }

    }
}
