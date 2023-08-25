package Methods.Lab;

import java.util.Scanner;

public class CalculateRectangleArea06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int area = area(width, length);
        System.out.println(area);


    }

    public static int area (int width, int length) {

        return width * length;

    }
}
