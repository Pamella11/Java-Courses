package MidExamPreparation;

import java.util.Scanner;

public class GuineaPig01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodKg = Double.parseDouble(scanner.nextLine());
        double hayKg = Double.parseDouble(scanner.nextLine());
        double coverKg = Double.parseDouble(scanner.nextLine());
        double weightKg = Double.parseDouble(scanner.nextLine());

        double foodGram = foodKg * 1000;
        double hayGram = hayKg * 1000;
        double coverGram = coverKg * 1000;
        double weightGram = weightKg * 1000;

        for (int i = 1; i <= 30; i++) {
            foodGram -= 300;
            //On the second day, the food left is 9400gr, so the needed hay is 9400 * 5%  = 470, and the hay left is 4530.
            if (i % 2 == 0) {
                double neededHay = foodGram * 0.05;
                hayGram -= neededHay;
            }
            //On every third day, Merry puts Puppy cover with a quantity of 1/3 of its weight.
            if (i % 3 == 0) {
                coverGram -= weightGram / 3;
            }
            if (foodGram <= 0 || hayGram <= 0 || coverGram <= 0) {
                System.out.println("Merry must go to the pet store!");
                break;
            }
        }
        if (foodGram > 0 && hayGram > 0 && coverGram > 0) {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodGram / 1000, hayGram / 1000, coverGram / 1000);
        }
    }
}
