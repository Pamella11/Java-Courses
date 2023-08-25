package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        int aquariumVolume = length * width * height;
        double volumeLiters = aquariumVolume * 0.001;
        double NeededLiters = volumeLiters - volumeLiters*(percent/100);
        System.out.println(NeededLiters);





    }

}
