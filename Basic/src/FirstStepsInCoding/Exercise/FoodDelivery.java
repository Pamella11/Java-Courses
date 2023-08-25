package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());
        double chickenPrice = chickenMenu * 10.35;
        double fishPrice = fishMenu * 12.40;
        double vegetarianPrice = vegetarianMenu * 8.15;
        double delivery = 2.50;
        double totalPriceMenus = chickenPrice + fishPrice + vegetarianPrice;
        double dessertPrice = totalPriceMenus * 0.2;
        double finalPrice = totalPriceMenus + dessertPrice + delivery;
        System.out.println(finalPrice);
    }
}
