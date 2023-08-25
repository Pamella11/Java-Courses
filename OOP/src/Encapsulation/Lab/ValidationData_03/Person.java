package Encapsulation.Lab.ValidationData_03;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    //Names must be at least 3 symbols
    public void setFirstName(String firstName) {
        if (firstName.length() >= 3){
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("First name can not be less than 3 symbols.");
        }
    }

    public void setLastName(String lastName) {
        if (lastName.length() >= 3){
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("Last name can not be less than 3 symbols.");
        }
    }

    public void setAge(int age) {
        //Age must not be zero or negative
        if (age > 0){
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age can not be zero or negative number.");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        //Salary can't be less than 460.0
        if (salary > 460){
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Salary can not be less than 460.");
        }
    }

    public void increaseSalary(double bonus){
        if (this.getAge() < 30){
            this.setSalary(this.getSalary() + (this.getSalary() * bonus / 200));
        } else {
            this.setSalary(this.getSalary() + (this.getSalary() * bonus / 100));
        }
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0#####");
        return String.format("%s %s gets %s leva", this.getFirstName(), this.getLastName(), decimalFormat.format(this.getSalary()));
    }
}
