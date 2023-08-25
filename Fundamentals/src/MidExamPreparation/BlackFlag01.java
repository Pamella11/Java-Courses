package MidExamPreparation;

import java.util.Scanner;

public class BlackFlag01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int plunderPerDay = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double totalGain = 0;
       // double totalGain = 0;

        for (int i = 1; i <= days ; i++) {
            totalGain += plunderPerDay;
            if (i % 3 == 0) {
                totalGain += plunderPerDay / 2.0;
            }
            if (i % 5 == 0) {
               totalGain = totalGain * 0.7;
            }
        }

        double percentage = (totalGain / expectedPlunder)  * 100;

        if (totalGain >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", totalGain);
        } else if (totalGain < expectedPlunder){
            System.out.printf("Collected only %.2f%% of the plunder.", percentage);
        }

    }
}
