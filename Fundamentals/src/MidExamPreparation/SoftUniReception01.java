package MidExamPreparation;

import java.util.Scanner;

public class SoftUniReception01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //per hour
        int studentsForEmployee1 = Integer.parseInt(scanner.nextLine());
        int studentsForEmployee2 = Integer.parseInt(scanner.nextLine());
        int studentsForEmployee3 = Integer.parseInt(scanner.nextLine());

        int studentsNumber = Integer.parseInt(scanner.nextLine());

        int maxStudentsPerHour = studentsForEmployee1 + studentsForEmployee2 + studentsForEmployee3;
        int helpedStudents = 0;
        int timeNeeded = 0;

        while (helpedStudents < studentsNumber) {

            helpedStudents += maxStudentsPerHour;
            timeNeeded ++;

            if (timeNeeded % 4 == 0) {
                timeNeeded ++;
            }

        }

        System.out.printf("Time needed: %dh.", timeNeeded);


    }
}
