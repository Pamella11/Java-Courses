package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that receives an array and the number of rotations you have to perform
        //(the first element goes at the end). Print the resulting array.

        String [] numbers = scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());

        // 51 47 32 61 21               ->                    32 61 21 51 47
        //2


        for (int i = 0; i < rotations; i++) {
            
            String firstDigit = numbers[0];

            for (int j = 0; j < numbers.length - 1; j++) {

                numbers[j] = numbers[j + 1];

            }

            numbers[numbers.length - 1] = firstDigit;

        }

        System.out.println(String.join(" ", numbers));




    }
}
