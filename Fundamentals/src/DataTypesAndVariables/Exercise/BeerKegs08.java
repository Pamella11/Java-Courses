package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class BeerKegs08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        double maxVolume = Double.MIN_VALUE;

        String biggestModel = "";

        for (int i = 0; i < lines; i++) {

            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume > maxVolume) {
                maxVolume = volume;
                biggestModel = model;
            }

        }

        System.out.println(biggestModel);

    }
}
