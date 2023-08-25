package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pensPackages = Integer.parseInt(scanner.nextLine());
        int markersPackages = Integer.parseInt(scanner.nextLine());
        int litersCleaningAgent = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());
        double materialsSum = pensPackages * 5.80 + markersPackages * 7.20 + litersCleaningAgent * 1.20;
        double discountSum = materialsSum * (discount/100);
        double finalSumWithDiscount = materialsSum - discountSum;
        System.out.println(finalSumWithDiscount);

    }
}
