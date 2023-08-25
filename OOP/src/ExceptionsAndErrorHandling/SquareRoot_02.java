package ExceptionsAndErrorHandling;

import java.util.Scanner;

public class SquareRoot_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int number = Integer.parseInt(scanner.nextLine());
            if (number <= 0){
                throw new Exception();
            }
            System.out.printf("%.2f%n",Math.sqrt(number));
        } catch (Exception e){
            System.out.println("Invalid");
        } finally {
            System.out.println("Goodbye");
        }
    }
}
