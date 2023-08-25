package RevisionBasics.Lab;

import java.util.Scanner;

public class TheatrePromotion07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int tickerPrice = 0;

        boolean isValid = true;

        switch (typeOfDay) {
            case "Weekday":
                if ((age >=0 && age <= 18) || (64 < age && age <= 122)) {
                    tickerPrice = 12;
                } else if (18 < age && age <= 64) {
                    tickerPrice = 18;
                } else {
                    System.out.println("Error!");
                    isValid = false;
                }
                break;
            case "Weekend":
                if ((age >=0 && age <= 18) || (64 < age && age <= 122)) {
                    tickerPrice = 15;
                } else if (18 < age && age <= 64) {
                    tickerPrice = 20;
                } else {
                    System.out.println("Error!");
                    isValid = false;
                }
                break;
            case "Holiday":
                if (age >=0 && age <= 18) {
                    tickerPrice = 5;
                } else if (18 < age && age <= 64) {
                    tickerPrice = 12;
                } else if (64 < age && age <= 122) {
                    tickerPrice = 10;
                } else {
                    System.out.println("Error!");
                    isValid = false;
                }
                break;
        }

        if (isValid) {
            System.out.printf("%d$", tickerPrice);
        }
    }
}
