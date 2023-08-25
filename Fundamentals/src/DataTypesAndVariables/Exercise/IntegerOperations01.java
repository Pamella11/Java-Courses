package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class IntegerOperations01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        //Read four integer numbers.
        // Add first to the second,
        // divide (integer) the sum by the third number,
        // and multiply the result by the fourth number.
        // Print the result.


        for (int i = 1; i <= 4; i++) {

            int number = Integer.parseInt(scanner.nextLine());

            if (i==1){
                sum = number;
            }else if (i==2){
                sum += number;
            } else if (i==3) {
                sum=sum/number;
            } else if (i==4) {
                sum= sum*number;
            }

        }
        System.out.println(sum);


    }
}
