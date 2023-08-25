package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class GreeningYards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = Double.parseDouble(scanner.nextLine());
        double priceNoDiscount = 7.61 * area;
        double priceDiscount = priceNoDiscount * 0.18;
        double finalprice = priceNoDiscount - priceDiscount;

        System.out.printf("The final price is: %f lv.%n", finalprice);
        System.out.printf("The discount is: %f lv.", priceDiscount);
    }
}
