package ExamAdvanced;

import java.util.*;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tools = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] substances = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        List<Integer> challenge = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        ArrayDeque<Integer> queueTools = new ArrayDeque<>();
        ArrayDeque<Integer> stackSubstances = new ArrayDeque<>();

        for (int t : tools) {
            queueTools.offer(t);
        }

        for (int s : substances) {
            stackSubstances.push(s);
        }

        while (!queueTools.isEmpty() && !stackSubstances.isEmpty()) {

            int tool = queueTools.poll();
            int substance = stackSubstances.pop();

            int result = tool * substance;

            if (challenge.contains(result)) {
                int index = -1;
                for (int i = 0; i < challenge.size(); i++) {
                    if (challenge.get(i) == result){
                        index = i;
                    }
                }
                challenge.remove(index);
            } else {
                int newToolValue = tool + 1;
                queueTools.offer(newToolValue);

                int newSubstanceValue = substance - 1;
                // == ?
                if (newSubstanceValue > 0) {
                    stackSubstances.push(newSubstanceValue);
                }
            }
            if (challenge.isEmpty()) {
                break;
            }
        }

        if (!challenge.isEmpty()) {
            System.out.println("Harry is lost in the temple. Oblivion awaits him.");
        } else {
            System.out.println("Harry found an ostracon, which is dated to the 6th century BCE.");
        }

        if (!queueTools.isEmpty()) {
            //o	"Tools: element1, element2, element3 … elementn"
            System.out.print("Tools: ");
            StringBuilder sb = new StringBuilder();
            while (!queueTools.isEmpty()) {
                sb.append(queueTools.poll());
                if (!queueTools.isEmpty()) {
                    sb.append(", ");
                }
            }
            System.out.print(sb.toString());
            System.out.println();
        }
        if (!stackSubstances.isEmpty()) {
            System.out.print("Substances: ");
            StringBuilder sb = new StringBuilder();
            while (!stackSubstances.isEmpty()) {
                sb.append(stackSubstances.pop());
                if (!stackSubstances.isEmpty()) {
                    sb.append(", ");
                }
            }
            System.out.print(sb.toString());
            System.out.println();
        }
        if (!challenge.isEmpty()) {
            System.out.print("Challenges: ");
            for (int i = 0; i < challenge.size(); i++) {
                int num = challenge.get(i);
                if (i == challenge.size() - 1) {
                    System.out.print(num);
                } else {
                    System.out.print(num + ", ");
                }
            }
        }

    }
}
