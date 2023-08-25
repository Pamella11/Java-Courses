package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double price = 0;

        switch (town) {
            case "Sofia":
                if (0 <= sales && sales <= 500) {
                    price = sales * 0.05;
                    System.out.printf("%.2f",price);
                } else if (500 < sales && sales <= 1000) {
                    price = sales * 0.07;
                    System.out.printf("%.2f",price);
                } else if (1000 < sales && sales <= 10000) {
                    price = sales * 0.08;
                    System.out.printf("%.2f",price);
                } else if (sales > 10000) {
                    price = sales * 0.12;
                    System.out.printf("%.2f",price);
                } else {
                    System.out.println("error");
                }
                break;
            case "Varna":
                if (0 <= sales && sales <= 500){
                    price = sales * 0.045;
                    System.out.printf("%.2f",price);
                } else if (500 < sales && sales <= 1000) {
                    price = sales * 0.075;
                    System.out.printf("%.2f",price);
                } else if (1000 < sales && sales <= 10000) {
                    price = sales * 0.1;
                    System.out.printf("%.2f",price);
                } else if (sales > 10000) {
                    price = sales * 0.13;
                    System.out.printf("%.2f",price);
                }else {
                    System.out.println("error");
                }
                break;
            case "Plovdiv":
                if (0 <= sales && sales <= 500){
                    price = sales * 0.055;
                    System.out.printf("%.2f",price);
                } else if (500 < sales && sales <= 1000) {
                    price = sales * 0.08;
                    System.out.printf("%.2f",price);
                } else if (1000 < sales && sales <= 10000) {
                    price = sales * 0.12;
                    System.out.printf("%.2f",price);
                } else if (sales > 10000) {
                    price = sales * 0.145;
                    System.out.printf("%.2f",price);
                }else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
                }

        }
    }

