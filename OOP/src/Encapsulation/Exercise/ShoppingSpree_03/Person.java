package Encapsulation.Exercise.ShoppingSpree_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }

    public void buyProduct(Product product) {
        if (this.money >= product.getCost()) {
            products.add(product);
            this.money -= product.getCost();
        } else {
            throw new IllegalArgumentException(String.format("%s can't afford %s", this.name, product.getName()));
        }
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be an empty string.");
        } else {
            this.name = name;
        }
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be a negative number.");
        } else {
            this.money = money;
        }
    }

}
