package InterfacesAndAbstraction.Exercise.BirthdayCelebrations_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Birthable> birthdays = new ArrayList<>();

        String line = scanner.nextLine();

        while (!line.equals("End")) {

            String[] data = line.split("\\s+");
            String type = data[0];

            switch (type) {
                case "Robot":
                    //"Robot {model} {robotId}"
                    String model = data[1];
                    String robotId = data[2];
                    Robot robot = new Robot(robotId, model);
                    break;
                case "Citizen":
                    //"Citizen {name} {age} {robotId} {birthdate}
                    String name = data[1];
                    int age = Integer.parseInt(data[2]);
                    String citizenId = data[3];
                    String birthdate = data[4];
                    Birthable citizen = new Citizen(name, age, citizenId, birthdate);
                    birthdays.add(citizen);
                    break;
                case "Pet":
                    //"Pet {name} {birthdate}"
                    String petName = data[1];
                    String petBirthdate = data[2];
                    Birthable pet = new Pet(petName, petBirthdate);
                    birthdays.add(pet);
                    break;
            }
            line = scanner.nextLine();
        }
        String year = scanner.nextLine();
        birthdays.stream().filter(b -> b.getBirthDate().endsWith(year)).map(Birthable::getBirthDate).forEach(System.out::println);
    }
}
