package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOfStaying = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String rate = scanner.nextLine();

        int nightStay = daysOfStaying - 1;
        double price = 0;


        switch (roomType) {
            case "room for one person":
                price = nightStay * 18;
                if (rate.equals("positive")){
                    price = price + price * 0.25;
                } else if (rate.equals("negative")) {
                    price = price - price * 0.1;
                }
                break;
            case "apartment":
                price = nightStay * 25;
                if (daysOfStaying < 10){
                    price = price - price * 0.3;
                } else if (daysOfStaying > 10 && daysOfStaying < 15) {
                    price = price - price * 0.35;
                }else {
                    price = price - price *0.5;
                }
                if (rate.equals("positive")){
                    price = price + price * 0.25;
                } else if (rate.equals("negative")) {
                    price = price - price * 0.1;
                }
                break;
            case "president apartment":
                price = nightStay * 35;
                if (daysOfStaying < 10){
                    price = price - price * 0.1;
                } else if (daysOfStaying > 10 && daysOfStaying < 15) {
                    price = price - price * 0.15;
                }else {
                    price = price - price *0.2;
                }
                if (rate.equals("positive")){
                    price = price + price * 0.25;
                } else if (rate.equals("negative")) {
                    price = price - price * 0.1;
                }
                break;
        }
        System.out.printf("%.2f", price);
    }
}
