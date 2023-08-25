package AssociativeArraysMaps.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Double> productPriceMap = new LinkedHashMap<>();
        Map<String, Integer> productQuantityMap = new LinkedHashMap<>();

        while (!input.equals("buy")) {

            String[] inputParts = input.split(" ");

            String product = inputParts[0];
            double price = Double.parseDouble(inputParts[1]);
            int quantity = Integer.parseInt(inputParts[2]);

            productPriceMap.put(product, price);

            if (!productQuantityMap.containsKey(product)) {
                productQuantityMap.put(product, quantity);
            } else {
                productQuantityMap.put(product, productQuantityMap.get(product) + quantity);
            }


            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : productPriceMap.entrySet()) {

            System.out.printf("%s -> %.2f%n",entry.getKey(), entry.getValue() * productQuantityMap.get(entry.getKey()));
        }

    }
}
//String command = scanner.nextLine();
//
//        Map<String, List<Double>> productsMap = new LinkedHashMap<>();
//        //characterCounts.forEach((key, value)-> System.out.println(key + " -> " + value));
//
//        while (!command.equals("buy")){
//
//            String [] productInfo = command.split(" ");
//
//            String product = productInfo[0];
//            double price = Double.parseDouble(productInfo[1]);
//            double quantity = Double.parseDouble(productInfo[2]);
//
//            if (!productsMap.containsKey(product)){
//                productsMap.put(product, new ArrayList<>());
//                productsMap.get(product).add(price);
//                productsMap.get(product).add(quantity);
//            } else {
//                productsMap.get(product).set(0, price);
//                double currentQuantity = productsMap.get(product).get(1);
//                productsMap.get(product).set(1, currentQuantity + quantity);
//            }
//
//            command = scanner.nextLine();
//        }
//
//        for (Map.Entry<String, List<Double>> entry : productsMap.entrySet()) {
//            //entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
//            double totalSum = entry.getValue().get(0) * entry.getValue().get(1);
//            System.out.printf("%s -> %.2f%n", entry.getKey(), totalSum);
//        }
