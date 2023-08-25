package ConditionalStatements.Lab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();

        if (figure.equals("square")) {
            double length = Double.parseDouble(scanner.nextLine());
            double area = (length*length);
            System.out.printf("%.3f",area);

        } else if (figure.equals("rectangle")) {
            double length = Double.parseDouble(scanner.nextLine());
            double length1 = Double.parseDouble(scanner.nextLine());
            double area = length*length1;
            System.out.printf("%.3f",area);
            
        } else if (figure.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            double area = (Math.PI*radius*radius);
            System.out.printf("%.3f",area);

        } else if (figure.equals("triangle")) {
            double length = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            double area = (length*height*0.5);
            System.out.printf("%.3f",area);

        }

    }
}
