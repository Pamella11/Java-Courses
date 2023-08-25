package AssociativeArraysMaps.Exercise;

import java.util.*;

public class Courses05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String info = scanner.nextLine();

        Map<String, List<String>> dataMap = new LinkedHashMap<>();

        while (!info.equals("end")){

            String[] data = info.split(" : ");

            String course = data[0];
            String student = data[1];

        if (!dataMap.containsKey(course)) {
            dataMap.put(course, new ArrayList<>());
        }

        dataMap.get(course).add(student);

            info = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : dataMap.entrySet()) {
            //"{courseName}: {registeredStudents}"
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
           // entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.println("-- " + entry.getValue().get(i));
            }
        }

    }
}
