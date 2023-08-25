package SetAndMaps.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        Map<String, String> emails = new LinkedHashMap<>();

        while (!name.equals("stop")) {

            String email = scanner.nextLine();

            if (!email.toLowerCase().endsWith("com") && !email.toLowerCase().endsWith("us") && !email.toLowerCase().endsWith("uk")) {
                emails.put(name, email);
            }

            name = scanner.nextLine();
        }

        // премахвам всички записи, на които value (email) завършва на uk, us, com
        // removeIf -> премахва всички записи, които отговарят на условието
        // emails.entrySet().removeIf(entry -> entry.getValue().endsWith("uk")
        //                                         || entry.getValue().endsWith("us")
        //                                         || entry.getValue().endsWith("com"));

        for (Map.Entry<String, String> entry : emails.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
