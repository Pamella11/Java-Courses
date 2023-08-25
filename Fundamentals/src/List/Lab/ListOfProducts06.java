package List.Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int lines = Integer.parseInt(scanner.nextLine());

        List<String> productList = new ArrayList<>();

        for (int i = 0; i < lines; i++) {

            String product = scanner.nextLine();

            productList.add(product);
        }

        Collections.sort(productList);

        int counter = 1;

        for (String product: productList) {
            System.out.println(counter + "." + product);
            counter++;
        }
    }
}
