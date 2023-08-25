package InterfacesAndAbstraction.Exercise.FoodShortage_04;

public class Citizen implements Identifiable, Person, Buyer{
    //name: String
    //- age: int
    //- id: String
    //- birthDate: String
    //- food: int
    private String name;
    private int age;
    private String id;
    private String birthDate;
    private int food = 0;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public void buyFood() {
        this.food += 10;
    }

    @Override
    public int getFood() {
        return this.food;
    }
}
