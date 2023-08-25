package WhileLoop.Exercise;

import javax.crypto.CipherInputStream;
import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badGrades = Integer.parseInt(scanner.nextLine());

        int gradesCount = 0;

        int poorGradesCount = 0;

        double gradesSum = 0;

        int tasksSolved = 0;

        String lastTask = "";

        while (poorGradesCount < badGrades) {

            String taskName = scanner.nextLine();

            if (taskName.equals("Enough")) {
                break;
            }

            int grades = Integer.parseInt(scanner.nextLine());

            if (grades <= 4) {
                poorGradesCount++;
            }

            gradesCount++;
            gradesSum += grades;
            tasksSolved++;
            lastTask = taskName;
        }

        if (poorGradesCount >= badGrades) {
            System.out.printf("You need a break, %d poor grades.", badGrades);
        } else {
            System.out.printf("Average score: %.2f%n", gradesSum / gradesCount);
            System.out.printf("Number of problems: %d%n", tasksSolved);
            System.out.printf("Last problem: %s", lastTask);
        }


    }
}

