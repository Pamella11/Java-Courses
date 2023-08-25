package InterfacesAndAbstraction.Lab.BorderControl_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lines = scanner.nextLine();

        List<Identifiable> society = new ArrayList<>();

        while (!lines.equals("End")) {

            String[] data = lines.split("\\s+");

            if (data.length == 2) {
                //"{model} {id}" for robots.
                String model = data[0];
                String id = data[1];
                Identifiable robot = new Robot(model, id);
                society.add(robot);
            } else if (data.length == 3) {
                //"{name} {age} {id}"
                String name = data[0];
                int age = Integer.parseInt(data[1]);
                String id = data[2];
                Identifiable citizen = new Citizen(name, age, id);
                society.add(citizen);
            }

            lines = scanner.nextLine();
        }

        String fakeIdEnding = scanner.nextLine();
        society.stream().filter(s -> s.getId().endsWith(fakeIdEnding)).forEach(t -> System.out.println(t.getId()));
    }
}
