package softUni;

import java.util.ArrayList;
import java.util.List;

public class SoftUni {

    private int capacity;
    private List<Student> data;

    public SoftUni(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();

    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getCount() {
        return this.data.size();
    }

    public String insert(Student student) {
        if (data.contains(student)) {
           return "Student is already in the hall.";
        } else if (isFull()) {
           return "The hall is full";
        } else {
            data.add(student);
            this.capacity = this.capacity + 1;
            //"Added student {firstName} {lastName}."
            return String.format("Added student %s %s.", student.getFirstName(), student.getLastName());
        }
    }

    public String remove(Student student){
        if (data.contains(student)){
           data.remove(student);
            this.capacity = this.capacity - 1;
            //"Removed student {firstName} {lastName}."
            return String.format("Removed student %s %s.", student.getFirstName(), student.getLastName());
        } else {
           return "Student not found.";
        }
    }

    public boolean isFull() {
        if (data.size() >= capacity) {
            return true;
        }
        return false;
    }

    public Student getStudent(String firstName, String lastName){
        for (Student student: data) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                return student;
            }
        }
        return null;
    }

    public String getStatistics(){
        StringBuilder sb = new StringBuilder();
        sb.append("Hall size: ").append(getCount());
        for (Student student: data) {
            sb.append(System.lineSeparator());
            sb.append(student.toString());
        }
        return sb.toString();
    }

}
