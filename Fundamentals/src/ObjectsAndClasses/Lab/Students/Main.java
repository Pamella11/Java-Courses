package ObjectsAndClasses.Lab.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String info = scanner.nextLine();

        List<Student> studentList = new ArrayList<>();

        while (!info.equals("end")) {

            String[] data = info.split(" ");

            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            String hometown = data[3];

            if (isExisting(studentList, firstName, lastName)) {
                Student student = getStudent(studentList, firstName, lastName, age, hometown);
            } else {
                Student student = new Student(firstName, lastName, age, hometown);
                studentList.add(student);
            }

            info = scanner.nextLine();
        }

        info = scanner.nextLine();

        for (Student student : studentList) {
            if (student.getHometown().equals(info)) {
                System.out.println(student);
            }
        }
    }

    public static boolean isExisting(List<Student> students, String firstName, String lastName) {

        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    public static Student getStudent(List<Student> students, String firstName, String lastName, int age, String city) {

        Student existingStudent = null;

        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student;
                existingStudent.setAge(age);
                existingStudent.setHometown(city);
            }
        }
        return existingStudent;
    }
}
