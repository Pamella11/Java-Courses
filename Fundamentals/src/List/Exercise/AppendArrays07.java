package List.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program to append several arrays of numbers.
        //	Arrays are separated by "|".
        //	Values are separated by spaces (" ", one or several).
        //	Order the arrays from the last to the first and their values from left to right.

        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        Collections.reverse(numbers);

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", "")
                                             .replaceAll("\\s+", " ")
                                             .trim());
     /*   System.out.println(numbers.toString() //"[  7  8, 4 5 6 , 1 2 3 ]"
                .replace("[", "") //"  7  8, 4 5 6 , 1 2 3 ]"
                .replace("]", "") //"  7  8, 4 5 6 , 1 2 3 "
                .trim()  //"7  8, 4 5 6 , 1 2 3"
                .replaceAll(",", "") //"7  8 4 5 6  1 2 3"
                .replaceAll("\\s+", " ")); //"7 8 4 5 6 1 2 3" */
    }
}
