package ObjectsAndClasses.Exercise.OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Person> personList = new ArrayList<>();

        while (!input.equals("End")){

            String[] parts = input.split(" ");

            String name = parts[0];
            String ID = parts[1];
            int age = Integer.parseInt(parts[2]);

            Person person = new Person(name, ID, age);
            personList.add(person);

            input = scanner.nextLine();
        }

        //        studentsList.sort(Comparator.comparing(Students::getGrade).reversed());
        personList.sort(Comparator.comparing(Person::getAge));

        for (Person person:personList) {
            System.out.println(person);
        }
    }
}
