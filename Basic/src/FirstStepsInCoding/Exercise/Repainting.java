package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Предпазен найлон - 1.50 лв. за кв. метър
        //Боя - 14.50 лв. за литър
        //Разредител за боя - 5.00 лв. за литър
        int amountNylon = Integer.parseInt(scanner.nextLine());
        int amountPaint = Integer.parseInt(scanner.nextLine());
        int amountThinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double nylonSum = (amountNylon + 2) * 1.50;
        double paintSum = (amountPaint + amountPaint*0.1) * 14.50;
        double thinnerSum = amountThinner * 5.00;
        double bags = 0.40;
        double totalSumForMaterials = nylonSum + paintSum + thinnerSum + bags;
        double workmen = (totalSumForMaterials * 0.3) * hours;
        double finalSum = totalSumForMaterials + workmen;
        System.out.println(finalSum);
    }
}
