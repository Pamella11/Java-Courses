package AssociativeArraysMaps.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = scanner.nextLine();

        Map<String, Integer> resourceMap = new LinkedHashMap<>();

        while (!resource.equals("stop")) {

          int quantity = Integer.parseInt(scanner.nextLine());

          if (!resourceMap.containsKey(resource)) {
              resourceMap.put(resource, quantity);
          } else {
              int currentQuantity = resourceMap.get(resource);
              resourceMap.put(resource, currentQuantity + quantity);
          }
            resource = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> resource1 : resourceMap.entrySet()) {
            System.out.println(resource1.getKey() + " -> " + resource1.getValue());
        }

    }
}
