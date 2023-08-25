package ObjectsAndClasses.Exercise.Students;

public class Students {

    private String firstName;
    private String secondName;
    private double grade;

    public Students(String firstName, String secondName, double grade) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {

        return this.firstName + " " + this.secondName + ": " + String.format("%.2f", this.grade);
    }
}
