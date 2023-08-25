package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Read the data
        double inches = Double.parseDouble(scanner.nextLine());
        double centimeters = inches * 2.54;
        System.out.println(centimeters);
        //Sum
        //Print
    }
}

