package FirstStepsInCoding.MoreExercise;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = Double.parseDouble(scanner.nextLine());
        double s = Math.PI * radius * radius;
        double p = 2 * Math.PI * radius;

        System.out.printf("%.2f%n",s);
        System.out.printf("%.2f",p);

    }
}
