package Encapsulation.Exercise.ClassBoxDataValidation_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        Box box = new Box(length, width, height);
        //Surface Area - 52.00
        System.out.printf("Surface Area - %.2f%n", box.calculateSurfaceArea());
        //Lateral Surface Area - 40.00
        System.out.printf("Lateral Surface Area - %.2f%n", box.calculateLateralSurfaceArea());
       //Volume – 24.00
        System.out.printf("Volume – %.2f", box.calculateVolume());
    }
}
