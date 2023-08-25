package SetAndMaps.Exercise;

import java.util.*;

public class UserLogs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Map<String, Integer>> usernamesIP = new TreeMap<>();

        while (!input.equals("end")) {

            String[] parts = input.split(" ");

            String IPs = parts[0];
            String messages = parts[1];
            String users = parts[2];

            String ipAddress = IPs.substring(3);
            String message = messages.substring(9, messages.length() - 1);
            String user = users.substring(5);

            if (!usernamesIP.containsKey(user)) {
                usernamesIP.put(user, new LinkedHashMap<>());
                usernamesIP.get(user).put(ipAddress, 1);
            } else {
                if (usernamesIP.get(user).containsKey(ipAddress)) {
                    int curr = usernamesIP.get(user).get(ipAddress);
                    usernamesIP.get(user).put(ipAddress, curr + 1);
                } else {
                    usernamesIP.get(user).put(ipAddress, 1);
                }
            }

            input = scanner.nextLine();
        }

        extracted(usernamesIP);

    }

    private static void extracted(Map<String, Map<String, Integer>> usernamesIP) {
        for (Map.Entry<String, Map<String, Integer>> entry : usernamesIP.entrySet()) {

            System.out.println(entry.getKey() + ": ");

            int counter = entry.getValue().size() - 1;

            for (Map.Entry<String, Integer> addresses : entry.getValue().entrySet()) {

                if (counter == 0) {
                    System.out.printf("%s => %d.%n", addresses.getKey(), addresses.getValue());
                } else {
                    System.out.printf("%s => %d, ", addresses.getKey(), addresses.getValue());
                }

                counter--;
            }

        }
    }
}
