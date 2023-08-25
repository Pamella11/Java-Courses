package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dogFood = 2.50;
        int catFood = 4;
        int numberDogFood = Integer.parseInt(scanner.nextLine());
        int numberCatFood = Integer.parseInt(scanner.nextLine());
        double expensesDogFood = dogFood * numberDogFood;
        int expensesCatFood = catFood * numberCatFood;
        double finalsum = expensesCatFood + expensesDogFood;
        System.out.printf("%.29f lv", finalsum);


    }
}
