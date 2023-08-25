package Encapsulation.Exercise.ShoppingSpree_03;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.setName(name);
        this.setCost(cost);
    }

    private void setName(String name) {
        if (name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be an empty string.");
        }else {
            this.name = name;
        }
    }

    private void setCost(double cost) {
        if (cost < 0){
            throw new IllegalArgumentException("Cost cannot be a negative number.");
        }else {
            this.cost = cost;
        }
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}
