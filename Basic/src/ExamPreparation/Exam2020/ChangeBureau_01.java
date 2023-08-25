package ExamPreparation.Exam2020;

import java.util.Scanner;

public class ChangeBureau_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scanner.nextLine());
        double chineseMoney = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());


        //•	1 биткойн = 1168 лева.
        //•	1 китайски юан = 0.15 долара.
        //•	1 долар = 1.76 лева.
        //•	1 евро = 1.95 лева.

        int bitcoinToLv = bitcoin * 1168;
        double chineseToDollars = chineseMoney * 0.15;
        double dollarsToLv = chineseToDollars * 1.76;

        double allMoneyEuro = (bitcoinToLv + dollarsToLv) / 1.95;
        double euroWithCommission = allMoneyEuro - allMoneyEuro * (commission/100);

        System.out.printf("%.2f", euroWithCommission);

    }
}
