package magazine;

import javax.sound.sampled.Line;
import java.util.*;
import java.util.stream.Collectors;

public class Magazine {
    //•	type: String
    //•	capacity: int
    private List<Cloth> data;
    private String type;
    private int capacity;

    public Magazine(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.data = new LinkedList<>();
    }

    public void addCloth(Cloth cloth){
       if (!isFull()){
           data.add(cloth);
       }
    }

    public boolean removeCloth(String color) {
        if (data.removeIf(cloth -> cloth.getColor().equals(color))){
            return true;
        }
        return false;
    }

    public Cloth getSmallestCloth(){
       //return data.stream()
               //.min((cloth1, cloth2) -> Integer.compare(cloth1.getSize(), cloth2.getSize()))
                 // .orElse(null);
        Cloth smallestCloth = data.get(0);
        for (int i = 1; i < data.size(); i++) {
            Cloth cloth = data.get(i);
            if (cloth.getSize() < smallestCloth.getSize()) {
                smallestCloth = cloth;
            }
        }
        return smallestCloth;
    }

    public Cloth getCloth(String color){
        for (Cloth cloth: data) {
            if (cloth.getColor().equals(color)){
                return cloth;
            }
        }
        return null;
    }

    public int getCount(){
        return data.size();
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s magazine contains:", type));
        for (Cloth cloth: data) {
            sb.append(System.lineSeparator());
            sb.append(cloth.toString());

        }
        return sb.toString();
    }
    public boolean isFull() {
        if (data.size() >= capacity) {
            return true;
        }
        return false;
    }
}
