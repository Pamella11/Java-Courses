package SetAndMaps.Lab;

import java.util.*;

public class ProductShop_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Map<String, Double>> shops = new TreeMap<>();

        while (!input.equals("Revision")){

            //"{shop}, {product}, {price}".
            String[] parts = input.split(", ");
            String shop = parts[0];
            String product = parts[1];
            double price = Double.parseDouble(parts[2]);

            shops.putIfAbsent(shop, new LinkedHashMap<>());
            shops.get(shop).put(product, price);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Map<String, Double>> entry : shops.entrySet()) {
            System.out.println(entry.getKey() + "->");
            for (Map.Entry<String, Double> product : entry.getValue().entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n", product.getKey(), product.getValue());
            }

        }

    }
}
