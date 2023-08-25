package ExamPreparation.Exam18February2023;

import java.util.*;

public class ApocalypsePreparation_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] textiles = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] medicaments = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> stackMedicament = new ArrayDeque<>();
        ArrayDeque<Integer> queueTextile = new ArrayDeque<>();

        for (int text: textiles) {
            queueTextile.offer(text);
        }

        for (int medicament: medicaments) {
            stackMedicament.push(medicament);
        }

        Map<String, Integer> items = new LinkedHashMap<>();

        while (!stackMedicament.isEmpty()){

            if (queueTextile.isEmpty()){
                break;
            }

            int textile = queueTextile.poll();
            int medicament = stackMedicament.pop();

            int result = textile + medicament;

            if (result == 30){
                items.putIfAbsent("Patch", 0);
                items.put("Patch", items.get("Patch") + 1);
            } else if (result == 40) {
                items.putIfAbsent("Bandage", 0);
                items.put("Bandage", items.get("Bandage") + 1);
            } else if (result == 100) {
                items.putIfAbsent("MedKit", 0);
                items.put("MedKit", items.get("MedKit") + 1);
            } else if (result > 100) {
                items.putIfAbsent("MedKit", 0);
                items.put("MedKit", items.get("MedKit") + 1);
                int remaining = result - 100;
                int newMedicament = stackMedicament.pop() + remaining;
                stackMedicament.push(newMedicament);
            } else {
                int newValue = medicament + 10;
                stackMedicament.push(newValue);
            }

        }

        if (queueTextile.isEmpty() && !stackMedicament.isEmpty()){
            System.out.println("Textiles are empty.");
        } else if (stackMedicament.isEmpty() && !queueTextile.isEmpty()) {
            System.out.println("Medicaments are empty.");
        } else {
            System.out.println("Textiles and medicaments are both empty.");
        }

        List<Map.Entry<String, Integer>> sortedItems = new ArrayList<>(items.entrySet());
        // Sort the list in descending order of amount created, then by name alphabetically
        sortedItems.sort(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()));
        // Print the sorted items
        for (Map.Entry<String, Integer> entry : sortedItems) {
        String item = entry.getKey();
        Integer count = entry.getValue();
        System.out.println(item + " - " + count);
        }

        if (!stackMedicament.isEmpty()){
            System.out.print("Medicaments left: ");
            StringBuilder sb = new StringBuilder();
            while (!stackMedicament.isEmpty()) {
                sb.append(stackMedicament.pop());
                if (!stackMedicament.isEmpty()) {
                    sb.append(", ");
                }
            }
            System.out.print(sb.toString());
        } else if (!queueTextile.isEmpty()) {
            System.out.print("Textiles left: ");
            StringBuilder sb = new StringBuilder();
            while (!queueTextile.isEmpty()) {
                sb.append(queueTextile.pop());
                if (!queueTextile.isEmpty()) {
                    sb.append(", ");
                }
            }
            System.out.print(sb.toString());
        }

    }
}
