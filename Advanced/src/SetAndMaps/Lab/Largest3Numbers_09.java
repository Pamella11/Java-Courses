package SetAndMaps.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class Largest3Numbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
        .sorted(Comparator.reverseOrder())
        .limit(3)
        .forEach(number -> System.out.print(number + " "));

    }
}
