package Polymorphism.Exercise.Vehicles_01;

import java.text.DecimalFormat;

public class Truck extends Vehicle {

    private static final double AIR_CONDITIONER_CONSUMPTION = 1.6;

    protected Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    protected void drive(double distance) {
        double neededFuelToDrive = distance * (this.getFuelConsumption() + AIR_CONDITIONER_CONSUMPTION);
        if (this.getFuelQuantity() >= neededFuelToDrive) {
            this.setFuelQuantity(this.getFuelQuantity() - neededFuelToDrive);
            DecimalFormat dc = new DecimalFormat("#.##");
            System.out.printf("Truck travelled %s km%n", dc.format(distance));
        } else {
            System.out.println("Truck needs refueling");
        }
    }

    @Override
    protected void refuel(double liters) {
        this.setFuelQuantity(this.getFuelQuantity() + (liters * 0.95));
    }

    @Override
    public String toString() {
        return String.format("Truck: %.2f", this.getFuelQuantity());
    }
}
