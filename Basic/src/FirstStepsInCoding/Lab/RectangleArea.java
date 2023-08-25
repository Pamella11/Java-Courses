package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Read the data in
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        //Sum
        int area = a * b;
        //Print the result
        System.out.println(area);

    }
}
