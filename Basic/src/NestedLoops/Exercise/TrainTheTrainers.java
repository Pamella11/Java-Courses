package NestedLoops.Exercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int judgePeople = Integer.parseInt(scanner.nextLine());

        String presentation = scanner.nextLine();

        int presentationCounter = 0;
        double totalSum = 0;

        while (!presentation.equals("Finish")) {

            double marksSum = 0;


            for (int i = 1; i <= judgePeople ; i++) {

                double mark = Double.parseDouble(scanner.nextLine());

                marksSum += mark;

            }
            double averageMark = marksSum / judgePeople;


            System.out.printf("%s - %.2f.%n", presentation, averageMark);

            totalSum += averageMark;

            presentationCounter ++;


            presentation = scanner.nextLine();
        }


        System.out.printf("Student's final assessment is %.2f.", totalSum / presentationCounter);

    }
}
