package ConditionalStatements.Exercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int memoryRams = Integer.parseInt(scanner.nextLine());

        double pricePerVideoCard = videoCards * 250;
        double pricePerProcessor = processors * pricePerVideoCard * 0.35;
        double pricePerMemoryRam = memoryRams * pricePerVideoCard * 0.1;

        double totalSum = pricePerVideoCard + pricePerProcessor + pricePerMemoryRam;

        double discount = 0;


        if (videoCards > processors ) {
            discount = totalSum * 0.15;

        }
        double finalSum = totalSum - discount;

        if(budget >= finalSum){
            System.out.printf("You have %.2f leva left!",budget-finalSum);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!",Math.abs(finalSum-budget));
        }



    }
}
