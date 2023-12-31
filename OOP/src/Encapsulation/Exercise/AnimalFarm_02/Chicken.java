package Encapsulation.Exercise.AnimalFarm_02;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }
    private void setName(String name) {
        if (name.length() < 1){
            throw new IllegalArgumentException("Name can not be empty");
        }else {
            this.name = name;
        }
    }
    private void setAge(int age) {
        if(age >= 0 && age <= 15){
            this.age = age;
        }else {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
    }

    private double calculateProductPerDay(){
        double eggsPerDay = 0;
        if (age < 6){
            eggsPerDay = 2;
        } else if (age <= 12) {
            eggsPerDay = 1;
        } else {
            eggsPerDay = 0.75;
        }
        return eggsPerDay;
    }

    public double productPerDay(){
        return calculateProductPerDay();
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.", this.name, this.age, this.calculateProductPerDay());
    }
}
