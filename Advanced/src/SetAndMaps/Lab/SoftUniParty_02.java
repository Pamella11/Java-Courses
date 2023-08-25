package SetAndMaps.Lab;

import java.util.*;

public class SoftUniParty_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> vipGuests = new TreeSet<>();
        Set<String> regularGuests = new TreeSet<>();

        String guestsID = scanner.nextLine();

        while (!guestsID.equals("PARTY")) {

            guestRank(vipGuests, regularGuests, guestsID);
            guestsID = scanner.nextLine();
        }

        guestsID = scanner.nextLine();

        while (!guestsID.equals("END")) {

            vipGuests.remove(guestsID);
            regularGuests.remove(guestsID);

            guestsID = scanner.nextLine();
        }

        int totalNonGuests = vipGuests.size() + regularGuests.size();
        System.out.println(totalNonGuests);

        printVipGuests(vipGuests);
        printRegGuests(regularGuests);

    }


    private static void guestRank(Set<String> vips, Set<String> regulars, String command) {

        if (Character.isDigit(command.charAt(0))) {
            vips.add(command);
        } else {
            regulars.add(command);
        }

    }

    private static void printVipGuests(Set<String> vips) {
        for (String vip : vips) {
            System.out.println(vip);
        }
    }

    private static void printRegGuests(Set<String> regularGuests) {
        for (String reg : regularGuests) {
            System.out.println(reg);
        }
    }

}
