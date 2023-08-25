package Arrays;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsForEmployee1 = Integer.parseInt(scanner.nextLine());
        int studentsForEmployee2 = Integer.parseInt(scanner.nextLine());
        int studentsForEmployee3 = Integer.parseInt(scanner.nextLine());

        int studentsNumber = Integer.parseInt(scanner.nextLine());

        int maxStudents = studentsForEmployee1 + studentsForEmployee2 + studentsForEmployee3;
        int helpedStudents = 0;
        int counter = 0;
        int breakTime = 0;

        while (helpedStudents < studentsNumber) {

            helpedStudents += maxStudents;
            counter ++;

            if (counter % 4 == 0) {
            breakTime ++;
            }

        }
        System.out.printf("Time needed: %dh.", counter + breakTime);

    }
}



        //  1. Създаване на масив:
        //        int[] myArray = new int[5];
        //
        //    2. Достъпване на елемент от масива и задаване на стойност:
        //        myArray[3] = 100;
        //
        //    3. Създаване и инициализиране на масив:
        //        int[] myArray2 = {1, 2, 3, 4, 5, 6};
        //        или
        //        String[] daysOfWeek = {"Monday", "Tuesday", "Friday"};
        //
        //     4. Обръщане на масив в обратен ред:
        //        int[] array = new int[] {1, 2, 3, 4, 5};
        //          4,1. Взимаме дължината на масива:
        //           int length = array.length;
        //          4,2. Създаваме нова променлива за обратния масив:
        //           int[] reversedArray = new int[length];
        //          4,3. Съзадаваме For-цикъл, за да вземем всички индекси:
        //        for (int i = 0; i < length; i++) {
        //            reversedArray[length - i - 1] = array[i];
        //        }
        //        System.out.println(Arrays.toString(reversedArray));
        //
        //    5. Четене на масив от конзолата:
        //        5,1. Четем първо цяло число, което да е размера на масива:
        //        int n = Integer.parseInt(scanner.nextLine());
        //        5,2. Създаваме масив:
        //        int[] array = new int[n];
        //        5,3. Създаваме For-цикъл, за да присвояваме към масива, прочетеното от конзолата число:
        //        for (int i = 0; i < n; i++) {
        //            array[i] = Integer.parseInt(scanner.nextLine());
        //        }



