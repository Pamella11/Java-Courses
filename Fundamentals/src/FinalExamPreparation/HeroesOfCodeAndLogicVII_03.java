package FinalExamPreparation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> hitPoints = new LinkedHashMap<>();
        Map<String, Integer> manaPoints = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            //"{hero name} {HP} {MP}"
            String[] command = scanner.nextLine().split(" ");
            String hero = command[0];

            int hp = Integer.parseInt(command[1]);
            int mp = Integer.parseInt(command[2]);

            hitPoints.put(hero,hp);
            manaPoints.put(hero, mp);
        }

        String input = scanner.nextLine();

        while (!input.equals("End")){

            String [] inputParts = input.split(" - ");
            String command = inputParts[0];
            String hero = inputParts[1];

            if (command.equals("CastSpell")){
                //"CastSpell – {hero name} – {MP needed} – {spell name}"
                int mpNeeded = Integer.parseInt(inputParts[2]);
                String spell = inputParts[3];

                int currentMP = manaPoints.get(hero);
                // a hero can have a maximum of 100 HP and 200 MP
                if (currentMP >= mpNeeded){
                    //•	If the hero has the required MP, he casts the spell, thus reducing his MP. Print this message:
                    //o	"{hero name} has successfully cast {spell name} and now has {mana points left} MP!"
                    int mpLeft = currentMP - mpNeeded;
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n", hero, spell, mpLeft);
                    manaPoints.put(hero, mpLeft);
                } else {
                    //•	If the hero is unable to cast the spell print:
                    //o	"{hero name} does not have enough MP to cast {spell name}!"
                    System.out.printf("%s does not have enough MP to cast %s!%n", hero, spell);
                }

            } else if (command.equals("TakeDamage")) {
                //"TakeDamage – {hero name} – {damage} – {attacker}"
                int damage = Integer.parseInt(inputParts[2]);
                String attacker = inputParts[3];

                int currentHP = hitPoints.get(hero);

                int sum = currentHP - damage;

                if (sum > 0) {
                    //•	Reduce the hero HP by the given damage amount. If the hero is still alive (his HP is greater than 0) print:
                    //o	"{hero name} was hit for {damage} HP by {attacker} and now has {current HP} HP left!"
                    int hpLeft = currentHP - damage;
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", hero, damage, attacker, hpLeft);
                    hitPoints.put(hero, hpLeft);
                }else {
                    //•	If the hero has died, remove him from your party and print:
                    //o	"{hero name} has been killed by {attacker}!"
                    System.out.printf("%s has been killed by %s!%n", hero, attacker);
                    hitPoints.remove(hero);
                    manaPoints.remove(hero);
                }

            } else if (command.equals("Recharge")) {
                //"Recharge – {hero name} – {amount}"
                int amount = Integer.parseInt(inputParts[2]);
                //•	The hero increases his MP. If it brings the MP of the hero above the maximum value (200),
                // MP is increased to 200. (the MP can't go over the maximum value).
                //•	 Print the following message:
                //o	"{hero name} recharged for {amount recovered} MP!"
                int currentMP = manaPoints.get(hero);
                int sum = currentMP + amount;
                if (sum > 200) {
                    manaPoints.put(hero, 200);
                    int recoveredAmount = 200 - currentMP;
                    System.out.printf("%s recharged for %d MP!%n", hero, recoveredAmount);
                } else {
                    System.out.printf("%s recharged for %d MP!%n", hero, amount);
                    manaPoints.put(hero, sum);
                }
            } else if (command.equals("Heal")) {
                //"Heal – {hero name} – {amount}"
                int amount = Integer.parseInt(inputParts[2]);
                //•	The hero increases his HP. If a command is given that would bring the HP of the hero above the maximum value (100),
                // HP is increased to 100 (the HP can't go over the maximum value).
                //•	 Print the following message:
                //o	"{hero name} healed for {amount recovered} HP!"
                int currentHP = hitPoints.get(hero);
                int sum = currentHP + amount;
                if (sum > 100){
                    hitPoints.put(hero, 100);
                    int recoveredAmount = 100 - currentHP;
                    System.out.printf("%s healed for %d HP!%n", hero, recoveredAmount);
                } else {
                    System.out.printf("%s healed for %d HP!%n", hero, amount);
                    hitPoints.put(hero, sum);
                }
            }


            input = scanner.nextLine();
        }

        //"{hero name}
        //  HP: {current HP}
        //  MP: {current MP}"

        for (Map.Entry<String, Integer> entry : manaPoints.entrySet()) {
            System.out.println(entry.getKey());
            System.out.printf("  HP: %d%n", hitPoints.get(entry.getKey()));
            System.out.printf("  MP: %d%n", entry.getValue());
        }

    }
}
