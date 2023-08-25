package AssociativeArraysMaps.Exercise;

import java.util.*;

public class StudentAcademy06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsGrades = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String student = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            studentsGrades.putIfAbsent(student, new ArrayList<>());
            studentsGrades.get(student).add(grade);
        }

        for (Map.Entry<String, List<Double>> entry : studentsGrades.entrySet()) {
            double average = entry.getValue().stream().mapToDouble(d -> d).average().orElse(0.0);
            if (average >= 4.5){
                System.out.printf("%s -> %.2f%n", entry.getKey(), average);
            }

        }

    }
}

