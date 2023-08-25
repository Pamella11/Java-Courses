package ObjectsAndClasses.Exercise.Students;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Students> studentsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String data = scanner.nextLine();

            String firstName = data.split(" ")[0];
            String secondName = data.split(" ")[1];
            double grade = Double.parseDouble(data.split(" ")[2]);

            Students student = new Students(firstName, secondName, grade);
            studentsList.add(student);
        }

        studentsList.sort(Comparator.comparing(Students::getGrade).reversed());

        for (Students student: studentsList) {
            System.out.println(student);
        }
    }
}
