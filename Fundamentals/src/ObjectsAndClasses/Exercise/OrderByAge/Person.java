package ObjectsAndClasses.Exercise.OrderByAge;

public class Person {

    private String name;
    private String ID;
    private int age;

    public Person(String name, String ID, int age){

        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {

        return this.name + " with ID: " + this.ID + " is " + this.age + " years old.";
        //Stephan with ID: 524244 is 10 years old.
        //Peter with ID: 78911 is 15 years old.
        //George with ID: 123456 is 20 years old.
    }


}
