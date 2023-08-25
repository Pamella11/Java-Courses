package shelter;

import java.util.*;
import java.util.stream.Collectors;

public class Shelter {
    private List<Animal> data;
    private int capacity;

    public Shelter(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    //•	Method add(Animal animal) – adds an entity to the data if there is an empty cell for the animal.
    public void add(Animal animal){
        if (data.size() < capacity){
            data.add(animal);
        }
    }
    //Method remove(String name) – removes the animal by given name, if such exists, and returns boolean.
    public boolean remove(String name){
        for (Animal animal: data) {
            if (animal.getName().equals(name)){
                data.remove(animal);
                return true;
            }
        }
        return false;
    }
    //Method getAnimal(String name, String caretaker) – returns the animal with the given name and caretaker or null if no such animal exists.
    public Animal getAnimal(String name, String caretaker){
        for (Animal animal: data) {
            if (animal.getName().equals(name) && animal.getCaretaker().equals(caretaker)){
                return animal;
            }
        }
        return null;
    }
    //•	Method getOldestAnimal() – returns the oldest Animal.
    public Animal getOldestAnimal(){
       List<Animal> sorted = data.stream().sorted(Comparator.comparing(Animal::getAge)).collect(Collectors.toList());
        Collections.reverse(sorted);
       return sorted.get(0);
    }

    //Getter getCount – returns the number of animals.
    public int getCount(){
        return data.size();
    }

    //getStatistics() – returns a String in the following format:
    public String getStatistics(){
        StringBuilder sb = new StringBuilder();
        sb.append("The shelter has the following animals:");
        //sb.append(System.lineSeparator());
        for (Animal animal: data) {
            sb.append(System.lineSeparator());
            sb.append(String.format("%s %s", animal.getName(), animal.getCaretaker()));
        }
        return sb.toString();
    }
}
