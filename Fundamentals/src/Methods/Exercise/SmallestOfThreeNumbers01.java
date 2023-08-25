package Methods.Exercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        System.out.println(smallestNumber(n1, n2, n3));

    }

    public static int smallestNumber (int num1, int num2,int num3) {

        int min = Math.min(num1, num2);

        if (min < num3) {
            return min;
        } else {
            return num3;
        }
    }

}
