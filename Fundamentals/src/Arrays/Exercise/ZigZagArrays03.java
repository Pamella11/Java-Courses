package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ZigZagArrays03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        int[] zig = new int[lines];
        int[] zag = new int [lines];

        for (int i = 0; i < lines; i++) {

            int[] array = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            if (i % 2 == 0) {
                zig[i] = array[0];
                zag[i] = array[1];
            } else {
                zig[i] = array[1];
                zag[i] = array[0];
            }

        }

        System.out.println(Arrays.stream(zig).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
        System.out.println(Arrays.stream(zag).mapToObj(String::valueOf).collect(Collectors.joining(" ")));


    }
}
