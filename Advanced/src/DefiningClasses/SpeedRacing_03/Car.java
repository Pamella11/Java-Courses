package DefiningClasses.SpeedRacing_03;

public class Car {

    private String model;
    private double fuel;
    private double fuelPerKm;
    private int travelledDistance;

    public Car(String model, int fuel, double fuelPerKm, int travelledDistance) {
        this.model = model;
        this.fuel = fuel;
        this.fuelPerKm = fuelPerKm;
        this.travelledDistance = travelledDistance;
    }
    public boolean canCarBeDriven(int km){
        double neededFuel = fuelPerKm * km;
        if (fuel >= neededFuel){
            fuel -= neededFuel;
            travelledDistance += km;
            return true;
        }
        return false;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public double getFuelPerKm() {
        return fuelPerKm;
    }

    public void setFuelPerKm(double fuelPerKm) {
        this.fuelPerKm = fuelPerKm;
    }

    public double getTravelledDistance() {
        return travelledDistance;
    }

    public void setTravelledDistance(int travelledDistance) {
        this.travelledDistance = travelledDistance;
    }

    @Override
    public String toString() {
        //"{Model} {fuelAmount} {distanceTraveled}"
        return String.format("%s %.2f %d", this.model, this.fuel, this.travelledDistance);
    }
}
