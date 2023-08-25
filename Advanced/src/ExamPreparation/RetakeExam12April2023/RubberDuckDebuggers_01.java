package ExamPreparation.RetakeExam12April2023;

import java.util.*;

public class RubberDuckDebuggers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] timeToComplete = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int [] tasks = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayDeque<Integer> queue  = new ArrayDeque<>();

        for (int time: timeToComplete) {
            queue.offer(time);
        }

        for (int task: tasks) {
            stack.push(task);
        }

        Map<String, Integer> typeCounter = new LinkedHashMap<>();
        typeCounter.put("Darth Vader Ducky", 0);
        typeCounter.put("Thor Ducky", 0);
        typeCounter.put("Big Blue Rubber Ducky", 0);
        typeCounter.put("Small Yellow Rubber Ducky", 0);

       while (!stack.isEmpty()){

           int time = queue.poll();
           int task = stack.pop();

           int result = time * task;

           if (result >= 0 && result <= 60){
               typeCounter.put("Darth Vader Ducky", typeCounter.get("Darth Vader Ducky") + 1);
           } else if (result >= 61 && result <= 120) {
               typeCounter.put("Thor Ducky", typeCounter.get("Thor Ducky") + 1);
           } else if (result >= 121 && result <= 180) {
               typeCounter.put("Big Blue Rubber Ducky", typeCounter.get("Big Blue Rubber Ducky") + 1);
           } else if (result >= 181 && result <= 240) {
               typeCounter.put("Small Yellow Rubber Ducky", typeCounter.get("Small Yellow Rubber Ducky") + 1);
           } else {
                int newTask = task - 2;
                queue.offer(time);
                stack.push(newTask);
           }
       }

        System.out.println("Congratulations, all tasks have been completed! Rubber ducks rewarded:");
        for (Map.Entry<String, Integer> entry : typeCounter.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
