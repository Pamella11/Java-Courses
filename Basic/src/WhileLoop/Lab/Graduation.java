package WhileLoop.Lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String student = scanner.nextLine();

        int gradeCount = 0;

        double gradeSum = 0;

        double averageGrade = 0;


        while (gradeCount < 12) {

            double grades = Double.parseDouble(scanner.nextLine());

            gradeCount++;
            gradeSum += grades;
            averageGrade = gradeSum / gradeCount;


            if (grades < 4 ) {
                System.out.printf("%s has been excluded at %d grade", student, gradeCount );
                break;
            }

        }
        if (gradeCount == 12) {
            System.out.printf("%s graduated. Average grade: %.2f", student, averageGrade);
        }

    }
}
