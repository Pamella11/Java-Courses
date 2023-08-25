package WorkingWithAbstraction.Lab.PointInRectangle_02;

import WorkingWithAbstraction.Lab.PointInRectangle_02.Point;
import WorkingWithAbstraction.Lab.PointInRectangle_02.Rectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] coordinates = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int bottomLeftX = coordinates[0];
        int bottomLeftY = coordinates[1];
        int topRightX = coordinates[2];
        int topRightY = coordinates[3];

        Point leftPoint = new Point(bottomLeftX, bottomLeftY);
        Point rightPoint = new Point(topRightX, topRightY);
        Rectangle rectangle = new Rectangle(leftPoint, rightPoint);

        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {

            int [] coordinatesToCheck = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int pointOne = coordinatesToCheck[0];
            int pointTwo = coordinatesToCheck[1];

            Point point = new Point(pointOne, pointTwo);
            System.out.println(rectangle.contains(point));
        }
    }
}
