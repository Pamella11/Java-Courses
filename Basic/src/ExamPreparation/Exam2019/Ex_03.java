package ExamPreparation.Exam2019;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Брой танцьори – цяло число в интервала [1 … 10]
        //2.	Брой точки – реално число в интервала [1.00 … 10000.00]
        //3.	Сезон –  текст със следните възможности - "summer" или "winter"
        //4.	Място – текст със следните възможности - "Bulgaria" или "Abroad"

        int dancers = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = scanner.nextLine();

        double currentPoints = 0;
        double expanses = 0;

        switch (season) {
            case "summer":
                if (destination.equals("Bulgaria")) {
                    currentPoints = points * dancers;
                    expanses = currentPoints - currentPoints * 0.05;
                } else if (destination.equals("Abroad")) {
                    currentPoints = points * dancers + (points * dancers * 0.5);
                    expanses = currentPoints - currentPoints * 0.1;
                }
                break;
            case "winter":
                if (destination.equals("Bulgaria")) {
                    currentPoints = points * dancers;
                    expanses = currentPoints - currentPoints * 0.08;
                } else if (destination.equals("Abroad")) {
                    currentPoints = points * dancers + (points * dancers * 0.5);
                    expanses = currentPoints - currentPoints * 0.15;
                }
                break;
        }

        double charity = expanses * 0.75;
        double moneyLeft = expanses - charity;
        double moneyPerDancer = moneyLeft / dancers;

        System.out.printf("Charity - %.2f%n", charity);
        System.out.printf("Money per dancer - %.2f", moneyPerDancer);




    }
}
