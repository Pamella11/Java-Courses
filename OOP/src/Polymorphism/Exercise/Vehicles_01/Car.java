package Polymorphism.Exercise.Vehicles_01;

import java.text.DecimalFormat;

public class Car extends Vehicle {

    private static final double AIR_CONDITIONER_CONSUMPTION = 0.9;

    protected Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    protected void drive(double distance) {
        double neededFuelToDrive = distance * (this.getFuelConsumption() + AIR_CONDITIONER_CONSUMPTION);
        if (this.getFuelQuantity() >= neededFuelToDrive) {
            this.setFuelQuantity(this.getFuelQuantity() - neededFuelToDrive);
            DecimalFormat dc = new DecimalFormat("#.##");
            System.out.printf("Car travelled %s km%n", dc.format(distance));
        } else {
            System.out.println("Car needs refueling");
        }
    }

    @Override
    protected void refuel(double liters) {
        this.setFuelQuantity(this.getFuelQuantity() + liters);
    }

    @Override
    public String toString() {
        return String.format("Car: %.2f", this.getFuelQuantity());
    }

}
