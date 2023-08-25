package ObjectsAndClasses.Exercise.VehicleCatalogue;

import java.util.Scanner;

public class Vehicle {

    private String type;
    private String model;
    private String color;
    private int horsePower;

    public Vehicle(String type, String model, String color, int horsePower) {
        this.type = type;
        this.model = model;//ferrari
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getHorsePower() {
        return horsePower;
    }
}
