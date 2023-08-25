package SetAndMaps.Lab;

import java.text.DecimalFormat;
import java.util.*;

public class AverageStudentsGrades_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentGrades = new TreeMap<>();

        for (int i = 0; i < n; i++) {

            String[] studentData = scanner.nextLine().split(" ");
            String name = studentData[0];
            double grade = Double.parseDouble(studentData[1]);

            studentGrades.putIfAbsent(name, new ArrayList<>());
            studentGrades.get(name).add(grade);
        }

        for (Map.Entry<String, List<Double>> entry : studentGrades.entrySet()) {
            //double average = entry.getValue().stream().mapToDouble(e -> e).average().orElse(entry.getValue().get(0)); <-- Дава 90/100 в джъдж
            double sum = 0;
            for (double grade : entry.getValue()) {
                sum += grade;
            }
            double average = sum / entry.getValue().size();

            System.out.print(entry.getKey() + " -> ");
            entry.getValue().forEach(grade -> System.out.printf("%.2f ", grade));
            System.out.printf("(avg: %.2f)%n", average);
        }

    }
}
