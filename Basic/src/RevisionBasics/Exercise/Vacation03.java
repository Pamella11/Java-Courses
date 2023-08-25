package RevisionBasics.Exercise;

import java.util.Scanner;

public class Vacation03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;

        switch (day) {
            case "Friday":
                if (type.equals("Students")) {
                    price = count * 8.45;
                    if (count >= 30){
                        price = price * 0.85;
                    }
                } else if (type.equals("Business")) {
                    price = count * 10.90;
                    if (count >= 100){
                        price = (count - 10) * 10.90;
                    }
                } else if (type.equals("Regular")) {
                    price = count * 15;
                    if (count >= 10 && count <= 20){
                        price = price * 0.95;
                    }
                }
                break;
            case "Saturday":
                if (type.equals("Students")) {
                    price = count * 9.80;
                    if (count >= 30){
                        price = price * 0.85;
                    }
                } else if (type.equals("Business")) {
                    price = count * 15.60;
                    if (count >= 100){
                        price = (count - 10) * 15.60;
                    }
                } else if (type.equals("Regular")) {
                    price = count * 20;
                    if (count >= 10 && count <= 20){
                        price = price * 0.95;
                    }
                }
                break;
            case "Sunday":
                if (type.equals("Students")) {
                    price = count * 10.46;
                    if (count >= 30){
                        price = price * 0.85;
                    }
                } else if (type.equals("Business")) {
                    price = count * 16;
                    if (count >= 100){
                        price = (count - 10) * 16;
                    }
                } else if (type.equals("Regular")) {
                    price = count * 22.50;
                    if (count >= 10 && count <= 20){
                        price = price * 0.95;
                    }
                }
                break;
        }

        System.out.printf("Total price: %.2f", price);

    }
}
