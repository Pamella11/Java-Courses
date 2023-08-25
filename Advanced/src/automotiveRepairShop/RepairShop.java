package automotiveRepairShop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RepairShop {
    private int capacity;
    private List<Vehicle> vehicles;

    public RepairShop(int capacity) {
        this.capacity = capacity;
        this.vehicles = new ArrayList<>();
    }

    //Method addVehicle(Vehicle vehicle) – adds an entity to the collection of Vehicles, if the Capacity allows it.
    public void addVehicle(Vehicle vehicle){
        if (vehicles.size() < capacity){
            vehicles.add(vehicle);
        }
    }
    //•	Method removeVehicle(String vin) – removes a vehicle by given vin, if such exists,
    // and returns boolean (true if it is removed, otherwise – false)
    public boolean removeVehicle(String vin){
        for (Vehicle vehicle: vehicles) {
            if (vehicle.getVIN().equals(vin)){
                vehicles.remove(vehicle);
                return true;
            }
        }
        return false;
    }
    //Method getCount() – returns the number of vehicles, registered in the RepairShop
    public int getCount(){
        return vehicles.size();
    }

    //Method getLowestMileage() – returns the Vehicle with the lowest value of Mileage property.
    public Vehicle getLowestMileage(){
       List<Vehicle> sorted = vehicles.stream().sorted(Comparator.comparing(Vehicle::getMileage)).collect(Collectors.toList());
       return sorted.get(0);
    }
    //•	Method report() – returns a string in the following format:
    //o	"Vehicles in the preparatory:
    //{Vehicle1}
    //{Vehicle2}
    //(…)"
    public String report(){
        StringBuilder sb = new StringBuilder();
        sb.append("Vehicles in the preparatory:");
        for (Vehicle vehicle: vehicles) {
            sb.append(System.lineSeparator());
            sb.append(vehicle.toString());
        }
        return sb.toString();
    }
}
