package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        DecimalFormat difference = new DecimalFormat("0.####");

        System.out.println(difference.format(poweredNumber(number, power)));

    }


    public static double poweredNumber (double num, int power) {

        return Math.pow(num, power);

    }
}
