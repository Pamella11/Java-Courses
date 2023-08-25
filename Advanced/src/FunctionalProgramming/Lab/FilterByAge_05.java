package FunctionalProgramming.Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FilterByAge_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> people = new LinkedHashMap<>();
        fillTheMap(scanner, people, n);

        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        if (condition.equals("younger")){
            people.values().removeIf(a -> a > age);
        } else {
            people.values().removeIf(a -> a < age);
        }

        if (format.equals("name")){
            people.keySet().forEach(System.out::println);
        } else if (format.equals("age")) {
            people.values().forEach(System.out::println);
        }else {
            for (Map.Entry<String, Integer> entry : people.entrySet()) {
                System.out.printf("%s - %d%n", entry.getKey(), entry.getValue());
            }
        }

    }

    private static void fillTheMap (Scanner scanner, Map<String, Integer> people, int n){

        for (int i = 0; i < n; i++) {
            String [] personInfo = scanner.nextLine().split(", ");
            String name = personInfo[0];
            int age = Integer.parseInt(personInfo[1]);
            people.put(name, age);
        }
    }
}
