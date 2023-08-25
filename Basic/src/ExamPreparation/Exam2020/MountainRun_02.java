package ExamPreparation.Exam2020;

import java.util.Scanner;

public class MountainRun_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double seconds = Double.parseDouble(scanner.nextLine());

        double time = distance * seconds;
        double delay = Math.floor(distance / 50) * 30;
        double georgiTime = time + delay;

        if (record <= georgiTime) {
            System.out.printf("No! He was %.2f seconds slower.", georgiTime - record);
        } else {
            System.out.printf("Yes! The new record is %.2f seconds.", georgiTime);
        }
    }
}
