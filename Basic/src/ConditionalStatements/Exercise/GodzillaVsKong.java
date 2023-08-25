package ConditionalStatements.Exercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statistics = Integer.parseInt(scanner.nextLine());
        double PricePerSuit = Double.parseDouble(scanner.nextLine());

        double decor = budget*0.1;
        double clothing = statistics*PricePerSuit;

        if (statistics>150){
            clothing = clothing - clothing*0.1;
        }
        double totalPrice = clothing + decor;

        if (budget>=totalPrice) {

            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",budget-totalPrice);
        }else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",Math.abs(budget-totalPrice));
        }
    }
}
