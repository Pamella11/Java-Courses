package FirstStepsInCoding.MoreExercise;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        // w - дължина в метри
        // h - ширина в метри

        double wSm = w * 100;
        double hSm = h * 100;
        int corridorH = 100;
        int deskW = 120;
        int deskH = 70;

        double spaceLeftH = hSm - corridorH;

        double workDesksW = Math.floor(wSm / deskW);
        double workDesksH = Math.floor(spaceLeftH / deskH);
        double newDesks = workDesksW * workDesksH - 3;

        System.out.println(newDesks);
    }
}
