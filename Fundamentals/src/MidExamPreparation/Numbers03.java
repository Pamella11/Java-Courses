package MidExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program to read a sequence of integers and
        //find and print the top 5 numbers greater than the average value in the sequence,
        //sorted in descending order.

        //•	Print the above-described numbers on a single line, space-separated.
        //•	If less than 5 numbers hold the property mentioned above, print less than 5 numbers.
        //•	Print "No" if no numbers hold the above property.

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        double sum = 0;

        List<Integer> newNumberList = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {  //10 20 30 40 50   ->  50 40
            int num = numbers.get(i);
            sum += num;
        }
         double averageNum = sum / numbers.size();

        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            if (num > averageNum) {
                newNumberList.add(num);
            }
        }

        Collections.sort(newNumberList);

        Collections.reverse(newNumberList);

        if (newNumberList.isEmpty()) {
            System.out.println("No");
        }

        if (newNumberList.size() > 5) {
            for (int i = 0; i < 5; i++) {
               int num = newNumberList.get(i);
                System.out.print(num + " ");
            }
        } else {
            System.out.println(newNumberList.toString().replaceAll("[\\[\\],]", ""));
        }


    }
}
