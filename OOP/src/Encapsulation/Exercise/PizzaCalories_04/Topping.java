package Encapsulation.Exercise.PizzaCalories_04;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        if (toppingType.equals("Meat") || toppingType.equals("Veggies") || toppingType.equals("Cheese") || toppingType.equals("Sauce")){
            this.toppingType = toppingType;
        } else {
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", toppingType));
        }
    }
    private void setWeight(double weight) {
        if (weight > 0 && weight <= 50){
            this.weight = weight;
        } else {
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].", this.toppingType));
        }
    }

    public double calculateCalories(){
        double calories = 0;
        if (this.toppingType.equals("Meat")){
            calories = 1.2;
        } else if (this.toppingType.equals("Veggies")) {
            calories = 0.8;
        } else if (this.toppingType.equals("Cheese")) {
            calories = 1.1;
        } else if (this.toppingType.equals("Sauce")) {
            calories = 0.9;
        }
        return (2 * this.weight) * calories;
    }
}
