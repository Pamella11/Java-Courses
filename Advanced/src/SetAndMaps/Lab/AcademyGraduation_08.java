package SetAndMaps.Lab;

import java.util.*;

public class AcademyGraduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentGrades = new TreeMap<>();

        for (int i = 0; i < n; i++) {

            String student = scanner.nextLine();

            double[] scores = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToDouble(Double::parseDouble)
                    .toArray();

            studentGrades.put(student, new ArrayList<>());

            for (int j = 0; j < scores.length; j++) {
                studentGrades.get(student).add(scores[j]);
            }

        }

        for (Map.Entry<String, List<Double>> entry : studentGrades.entrySet()) {
            double sum = 0;
            for (double grade : entry.getValue()) {
                sum += grade;
            }
            double average = sum / entry.getValue().size();
            System.out.println(entry.getKey()+ " is graduated with " + average);
        }


    }
}
