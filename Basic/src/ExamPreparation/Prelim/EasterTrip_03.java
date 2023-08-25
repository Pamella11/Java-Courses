package ExamPreparation.Prelim;

import java.util.Scanner;

public class EasterTrip_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String dates = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double staying = 0;

        switch (destination) {
            case "France":
                if (dates.equals("21-23")) {
                    staying = nights * 30;
                } else if (dates.equals("24-27")) {
                    staying = nights * 35;
                } else if (dates.equals("28-31")) {
                    staying = nights * 40;
                }
                break;
            case "Italy":
                if (dates.equals("21-23")) {
                    staying = nights * 28;
                } else if (dates.equals("24-27")) {
                    staying = nights * 32;
                } else if (dates.equals("28-31")) {
                    staying = nights * 39;
                }
                break;
            case "Germany":
                if (dates.equals("21-23")) {
                    staying = nights * 32;
                } else if (dates.equals("24-27")) {
                    staying = nights * 37;
                } else if (dates.equals("28-31")) {
                    staying = nights * 43;
                }
                break;
        }
        System.out.printf("Easter trip to %s : %.2f leva.", destination, staying);


    }
}
