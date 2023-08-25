package Encapsulation.Exercise.PizzaCalories_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Pizza {pizzaName} {numberOfToppings}
        String[] pizzaData = scanner.nextLine().split(" ");
        String pizzaName = pizzaData[1];
        int numberOfToppings = Integer.parseInt(pizzaData[2]);
        Pizza pizza = new Pizza(pizzaName, numberOfToppings);
        //Dough {flourType} {bakingTechnique} {weightInGrams}
        String[] doughData = scanner.nextLine().split(" ");
        String flourType = doughData[1];
        String bakingTechnique = doughData[2];
        double weightInGrams = Double.parseDouble(doughData[3]);
        Dough dough = new Dough(flourType, bakingTechnique, weightInGrams);
        pizza.setDought(dough);
        //Topping {toppingType} {weightInGrams}
        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("END")){
            //Topping {toppingType} {weightInGrams}
            String toppingType = command[1];
            double weightInGrams1 = Double.parseDouble(command[2]);
            Topping topping = new Topping(toppingType, weightInGrams1);
            pizza.addTopping(topping);

            command = scanner.nextLine().split(" ");
        }
        //Meatless - 370.00
        System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
    }
}
