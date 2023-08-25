package ObjectsAndClasses.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class RandomizeWords01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        Collections.shuffle(words);

        for (String word:words) {
            System.out.println(word);
        }
    }
}
