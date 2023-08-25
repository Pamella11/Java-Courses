package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int num2 = Integer.parseInt(scanner.nextLine());

        double finalResult = resultOfCalculation(operator, num1, num2);
        DecimalFormat dif = new DecimalFormat("0.##");
        //System.out.printf("%.2f", finalResult);
        System.out.println(dif.format(finalResult));

    }

    public static double resultOfCalculation (String operator, int firstNumber, int secondNumber) {
         // / * + -
        double result = 0;

        switch (operator){
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result =1.0 * firstNumber / secondNumber;
                break;
        }
      return result;
    }
}
