package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int staying = Integer.parseInt(scanner.nextLine());
        double studioPrice = 0;
        double flatPrice = 0;

        switch (month) {
            case "May":
            case "October":
                studioPrice = staying * 50;
                flatPrice = staying * 65;
                if (staying > 7 && staying < 14) {
                    studioPrice = studioPrice - studioPrice * 0.05;
                } else if (staying > 14) {
                    studioPrice = studioPrice - studioPrice * 0.3;
                }
                if (staying > 14) {
                    flatPrice = flatPrice - flatPrice * 0.1;
                }
                break;
            case "June":
            case "September":
                studioPrice = staying * 75.20;
                flatPrice = staying * 68.70;
                if (staying > 14) {
                    studioPrice = studioPrice - studioPrice * 0.2;
                }
                if (staying > 14) {
                    flatPrice = flatPrice - flatPrice * 0.1;
                }
                break;
            case "July":
            case "August":
                studioPrice = staying * 76;
                flatPrice = staying * 77;
                if (staying > 14) {
                    flatPrice = flatPrice - flatPrice * 0.1;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.%n", flatPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);

    }
}
