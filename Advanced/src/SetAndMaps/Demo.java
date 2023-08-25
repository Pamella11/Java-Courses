package SetAndMaps;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sizes = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int set1size = sizes[0];
        int set2size = sizes[1];

        int size = set1size + set2size;

        Set<Integer> numbers1 = new LinkedHashSet<>();

        Set<Integer> numbers2 = new LinkedHashSet<>();

        for (int i = 0; i < size; i++) {

            int num = Integer.parseInt(scanner.nextLine());

            if (numbers1.contains(num)){
                numbers2.add(num);
            }else {
                numbers1.add(num);
            }
        }
        numbers2.forEach(e -> System.out.print(e + " "));

      /* int[] sizes = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int set1size = sizes[0];
        int set2size = sizes[1];

      //  int size = set1size + set2size;

        Set<Integer> numbers1 = new LinkedHashSet<>();

        Set<Integer> numbers2 = new LinkedHashSet<>();

        for (int i = 0; i < set1size; i++) {
            numbers1.add(Integer.parseInt(scanner.nextLine()));
        }

        for (int i = 0; i < set2size; i++) {
            numbers2.add(Integer.parseInt(scanner.nextLine()));
        }

        Set<Integer> duplicates = new LinkedHashSet<>();


            for (int n: numbers1) {
                for (int num:numbers2) {
                    if (n == num){
                        duplicates.add(n);
                    }
                }
            }

            duplicates.forEach(num -> System.out.print(num + " ")); */

    }
}
