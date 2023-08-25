package Methods.Lab;

import java.util.Scanner;

public class Grades02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        gradeInWords(grade);

    }

    public static void gradeInWords (double grade) {

        String gradeWords = "";

        if (grade >= 2 && grade < 3) {
            gradeWords = "Fail";
        } else if (grade >= 3 && grade < 3.5) {
            gradeWords = "Poor";
        } else if (grade >= 3.5 && grade < 4.5) {
            gradeWords= "Good";
        } else if (grade >= 4.5 && grade < 5.5) {
            gradeWords = "Very good";
        } else if (grade >= 5.5 && grade <= 6) {
            gradeWords = "Excellent";
        }

        System.out.println(gradeWords);

    }
}
