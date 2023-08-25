package ExamPreparation.Exam2019;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mas = Integer.parseInt(scanner.nextLine());
        int protein = Integer.parseInt(scanner.nextLine());
        int v = Integer.parseInt(scanner.nextLine());
        int calorieSum = Integer.parseInt(scanner.nextLine());
        int waterPercent = Integer.parseInt(scanner.nextLine());

        //•	1 грам мазнини = 9 калории
        //•	1 грам протеини = 4 калории
        //•	1 грам въглехидрати = 4 калории

        double masSum = (calorieSum * (1.0 * mas / 100) )  / 9;
        double proteinSum = (calorieSum * (1.0 * protein/ 100) ) / 4;
        double vSum = (calorieSum * (1.0 * v/ 100)) /4;

        double weight = masSum + proteinSum + vSum;
        double caloriesPerGram = calorieSum / weight;

        double w = 100 - waterPercent;
        double waterCalorie = caloriesPerGram * (w/100);

        System.out.printf("%.4f", waterCalorie);






    }
}
