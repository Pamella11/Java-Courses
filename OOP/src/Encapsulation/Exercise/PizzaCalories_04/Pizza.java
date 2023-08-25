package Encapsulation.Exercise.PizzaCalories_04;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dought;
    private List<Topping> toppings;
    private int numberOfToppings;

    public Pizza(String name, int numberOfToppings) {
        this.setName(name);
        this.setToppings(numberOfToppings);
        this.toppings = new ArrayList<>();
    }

    public double getOverallCalories(){
        double sum = this.toppings.stream().mapToDouble(Topping::calculateCalories).sum();
        return sum + this.dought.calculateCalories();
    }

    public void setDought(Dough dought) {
        this.dought = dought;
    }

    public void addTopping (Topping topping){
        if (this.toppings.size() >= numberOfToppings){
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        } else {
            this.toppings.add(topping);
        }
    }
    private void setToppings(int toppings){
        if (toppings >= 0 && toppings <= 10){
           // this.toppings = new ArrayList<>(toppings);
            this.numberOfToppings = toppings;
        }else {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
    }

    public String getName() {
        return name;
    }
    private void setName(String name) {
        if (name.trim().isEmpty() || name.length() < 1 || name.length() > 15){
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }
}
