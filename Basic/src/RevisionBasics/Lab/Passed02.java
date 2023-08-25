package RevisionBasics.Lab;

import java.util.Scanner;

public class Passed02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that takes as an input a grade and prints "Passed!" if the grade is equal or more than 3.00.

        double grade = Double.parseDouble(scanner.nextLine());

        if (grade>=3) {
            System.out.println("Passed!");
        }
    }
}
