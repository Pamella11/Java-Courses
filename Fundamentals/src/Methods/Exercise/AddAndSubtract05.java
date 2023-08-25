package Methods.Exercise;

import java.util.Scanner;

public class AddAndSubtract05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        System.out.println(sum(num1, num2, num3));

    }

    public static int sum (int n1, int n2, int n3) {
        return n1 + n2 - n3;
    }

}
