package Polymorphism.Lab.WildFarm_04;

import java.text.DecimalFormat;

public class Zebra extends Mammal {

    public Zebra(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            this.setFoodEaten(this.getFoodEaten() + food.getQuantity());
        } else {
            System.out.println("Zebras are not eating that type of food!");
        }
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

}

