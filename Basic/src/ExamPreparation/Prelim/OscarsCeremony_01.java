package ExamPreparation.Prelim;

import java.util.Scanner;

public class OscarsCeremony_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());

        double statuette = rent - rent * 0.3;
        double food = statuette - statuette * 0.15;
        double music = food / 2;

        double allSum = rent +  statuette + food + music;

        System.out.printf("%.2f", allSum);


    }
}
