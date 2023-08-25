package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //You have initial health 100 and initial bitcoins 0.
        List<String> dungeonsRoom = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        int initialHealth = 100;
        int initialBitcoins = 0;
        int bestRoom = 1;

        boolean allRooms = true;

        for (int i = 0; i < dungeonsRoom.size(); i++) {

            String command = dungeonsRoom.get(i); // potion 3
            String action = command.split(" ")[0]; //potion
            int number = Integer.parseInt(command.split(" ")[1]); // 3

            if (action.equals("potion")) {
                if (number + initialHealth > 100) {
                    int diff = 100 - initialHealth;
                    initialHealth += diff;
                    System.out.printf("You healed for %d hp.%n",diff);
                    System.out.printf("Current health: %d hp.%n", initialHealth);
                } else {
                    System.out.printf("You healed for %d hp.%n", number);
                    initialHealth += number;
                    if (initialHealth > 100) {
                        initialHealth = 100;
                    }
                    System.out.printf("Current health: %d hp.%n", initialHealth);
                }
            } else if (action.equals("chest")) {
                initialBitcoins += number;
                System.out.printf("You found %d bitcoins.%n", number);
            }else {
                initialHealth -= number;
                if (initialHealth <= 0) {
                    System.out.printf("You died! Killed by %s.%n", action);
                    bestRoom = i +1;
                    System.out.println("Best room: " + bestRoom);
                    allRooms = false;
                    break;
                    //If you are not dead (health <= 0), you've slain the monster, and you should print: "You slayed {monster}."
                } else  {
                    System.out.printf("You slayed %s.%n", action);
                    //o	If you've died, print "You died! Killed by {monster}."
                    // and your quest is over. Print the best room you've manage to reach: "Best room: {room}"
                }

            }

        }
       if (allRooms) {
           System.out.println("You've made it!");
           System.out.println("Bitcoins: " + initialBitcoins);
           System.out.println("Health: " + initialHealth);
       }
    }
}
