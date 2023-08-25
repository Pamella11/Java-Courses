package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int annualTax = Integer.parseInt(scanner.nextLine());
        double basketballShoes = annualTax - annualTax*0.4;
        double basketballOutfit = basketballShoes - basketballShoes*0.2;
        double basketballBall = basketballOutfit*0.25;
        double basketballAccessories = basketballBall*0.2;
        double finalSum = annualTax + basketballShoes + basketballOutfit + basketballBall + basketballAccessories;
        System.out.println(finalSum);
    }
}
