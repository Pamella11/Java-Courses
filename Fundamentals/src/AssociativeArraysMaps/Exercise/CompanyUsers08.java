package AssociativeArraysMaps.Exercise;

import java.util.*;

public class CompanyUsers08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> companyMap = new LinkedHashMap<>();

        while (!input.equals("End")) {
            //companyName} -> {employeeId}"
            String [] inputParts = input.split(" -> ");
            String company = inputParts[0];
            String employee = inputParts[1];

            if (!companyMap.containsKey(company)) {
                companyMap.put(company, new ArrayList<>());
            }

           if (!companyMap.get(company).contains(employee)){
               companyMap.get(company).add(employee);

           }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : companyMap.entrySet()) {
            System.out.println(entry.getKey());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.println("-- " + entry.getValue().get(i));
            }
        }
    }
}
