package List.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list1 = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> list2 = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //The first element should be from the first list, the second from the second list, and so on.
        // If the length of the two lists is not equal, just add the remaining elements at the end of the list.

        List<Integer> mergedList = new ArrayList<>();

        int minSize = Math.min(list1.size(), list2.size());

        for (int i = 0; i < minSize; i++) {

            int firstEl = list1.get(i);
            int secondEl = list2.get(i);

            mergedList.add(firstEl);
            mergedList.add(secondEl);

        }

        if (list1.size() > list2.size()) {
            mergedList.addAll(list1.subList(minSize, list1.size()));
        } else if (list2.size() > list1.size()) {
            mergedList.addAll(list2.subList(minSize, list2.size()));

        }

        System.out.println(mergedList.toString().replaceAll("[\\[\\],]", ""));
    }
}
