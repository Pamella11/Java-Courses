package AssociativeArraysMaps.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        Map<String, String> carsMap = new LinkedHashMap<>();

        for (int i = 0; i < num; i++) {

            String command = scanner.nextLine();
            String name = command.split(" ")[1];

            if (command.startsWith("register")) {

                String carNumber = command.split(" ")[2];

                if (!carsMap.containsKey(name)) {
                    carsMap.put(name, carNumber);
                    System.out.printf("%s registered %s successfully%n", name, carNumber);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", carsMap.get(name));
                }

            } else if (command.startsWith("unregister")) {

                if (!carsMap.containsKey(name)){
                    System.out.printf("ERROR: user %s not found%n", name);
                } else {
                    System.out.printf("%s unregistered successfully%n", name);
                    carsMap.remove(name);
                }
            }
        }
        for (Map.Entry<String, String> entry : carsMap.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }

    }
}
