package AssociativeArraysMaps.Exercise;

import java.util.*;

public class ForceBook09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, List<String>> sideUsersMap = new LinkedHashMap<>();

        while (!command.equals("Lumpawaroo")){
            //"force_side | force_user":
            if (command.contains("|")){
                String side = command.split(" \\| ")[0];
                String user = command.split(" \\| ")[1];

                if(!sideUsersMap.containsKey(side)){
                    sideUsersMap.put(side, new ArrayList<>());
                }

                boolean isExisting = false;

                for (List<String> team : sideUsersMap.values()) {
                    if (team.contains(user)) {
                        isExisting = true;
                        break;
                    }
                }

                if (!isExisting){
                    sideUsersMap.get(side).add(user);
                }

              //"force_user -> force_side"
            } else if (command.contains("->")) {
                String user = command.split(" -> ")[0];
                String side = command.split(" -> ")[1];

                sideUsersMap.entrySet().forEach(entry -> entry.getValue().remove(user));

                if (sideUsersMap.containsKey(side)){
                    sideUsersMap.get(side).add(user);
                } else {
                    sideUsersMap.put(side, new ArrayList<>());
                    sideUsersMap.get(side).add(user);
                }
                System.out.printf("%s joins the %s side!%n",user,side);
            }


            command = scanner.nextLine();
        }

        sideUsersMap.entrySet()
                .stream().filter(entry -> entry.getValue().size() > 0)
                .forEach(entry -> {
                    System.out.println("Side: " + entry.getKey() + ", Members: " + entry.getValue().size());
                    entry.getValue().forEach(user -> System.out.println("! " + user));
                });

    }
}
