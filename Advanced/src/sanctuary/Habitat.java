package sanctuary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Habitat {

    private int capacity;
    private List<Elephant> data;

    public Habitat(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    //Method add(Elephant elephant) – adds an entity to the data if there is an empty space for the elephant.
    public void add(Elephant elephant){
        if (data.size() < capacity){
            data.add(elephant);
        }
    }

    //Method remove(String name) – removes the elephant by given name, if such exists, and returns boolean.
    public boolean remove(String name){
        for (Elephant elephant: data) {
            if (elephant.getName().equals(name)){
                data.remove(elephant);
                return true;
            }
        }
        return false;
    }

    //•	Method getElephant(String retiredFrom) – returns the elephant retired from the given place or null if no such elephant exists.
    public Elephant getElephant(String retiredFrom){
        for (Elephant elephant: data) {
            if (elephant.getRetiredFrom().equals(retiredFrom)){
                return elephant;
            }
        }
        return null;
    }

    //Method getOldestElephant() – returns the oldest Elephant.
    public Elephant getOldestElephant(){
        List<Elephant> sorted = data.stream().sorted(Comparator.comparing(Elephant::getAge)).collect(Collectors.toList());
        Collections.reverse(sorted);
        return sorted.get(0);
    }

    //Getter getAllElephants() – returns the number of elephants.
    public int getAllElephants(){
        return this.data.size();
    }

    //•	getReport() – returns a String in the following format:
    //"Saved elephants in the park:
    //		 {name} came from: {retiredFrom}
    //          {name} came from: {retiredFrom}
    //          (…)"

    public String getReport(){
        StringBuilder sb = new StringBuilder();
        sb.append("Saved elephants in the park:");
        for (Elephant elephant: data) {
            sb.append(System.lineSeparator());
            sb.append(String.format("%s came from: %s", elephant.getName(), elephant.getRetiredFrom()));
        }
        return sb.toString();
    }
}
