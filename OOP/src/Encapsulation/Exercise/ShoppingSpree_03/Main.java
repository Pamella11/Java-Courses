package Encapsulation.Exercise.ShoppingSpree_03;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Person> people = new LinkedHashMap<>();
        Map<String, Product> products = new LinkedHashMap<>();

        String[] namesAndMoney = scanner.nextLine().split(";");
        fillMapWithPeople(people, namesAndMoney);

        String[] productsAndCost = scanner.nextLine().split(";");
        fillMapWithProducts(products, productsAndCost);

        String[] commands = scanner.nextLine().split("\\s+");

        while (!commands[0].equals("END")){

            String personName = commands[0];
            String productName = commands[1];

            Person person = people.get(personName);
            Product product = products.get(productName);

            try {
                person.buyProduct(product);
                System.out.println(person.getName() + " bought " + product.getName());
            } catch (IllegalArgumentException exception){
                System.out.println(exception.getMessage());
            }

            commands = scanner.nextLine().split("\\s+");
        }

        printer(people);
    }

    private static void printer(Map<String, Person> people) {
        for (Map.Entry<String, Person> entry : people.entrySet()) {
            System.out.print(entry.getKey() + " - ");
            if (entry.getValue().getProducts().isEmpty()){
                System.out.print("Nothing bought");
            } else {
                StringJoiner joiner = new StringJoiner(", ");
                for (Product product : entry.getValue().getProducts()) {
                    String name = product.getName();
                    joiner.add(name);
                }
                String commaSeparated = joiner.toString();
                System.out.println(commaSeparated);
            }
        }
    }

    private static void fillMapWithProducts(Map<String, Product> products, String[] productsAndCost) {
        for (int i = 0; i < productsAndCost.length; i++) {
            String[] split = productsAndCost[i].split("=");
            String productName = split[0];
            double cost = Double.parseDouble(split[1]);
            Product product = new Product(productName, cost);
           products.put(productName, product);
        }
    }

    private static void fillMapWithPeople(Map<String, Person> people, String[] namesAndMoney) {
        for (int i = 0; i < namesAndMoney.length; i++) {
            String[] namesSplit = namesAndMoney[i].split("=");
            String name = namesSplit[0];
            double money = Double.parseDouble(namesSplit[1]);
            Person person = new Person(name, money);
            people.put(name, person);
        }
    }
}
