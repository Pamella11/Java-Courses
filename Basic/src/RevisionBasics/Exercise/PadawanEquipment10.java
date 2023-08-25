package RevisionBasics.Exercise;

import java.util.Scanner;

public class PadawanEquipment10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double georgeMoney = Double.parseDouble(scanner.nextLine());
        int studentsNumber = Integer.parseInt(scanner.nextLine());
        double lightSaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        double saberSumWithPercent = Math.ceil(studentsNumber + studentsNumber * 0.1);

        int freeBelts = studentsNumber / 6;

        double total = (saberSumWithPercent * lightSaberPrice ) + (studentsNumber * robePrice) + ((studentsNumber - freeBelts) * beltsPrice);

        if (georgeMoney >= total) {
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        }else {
            System.out.printf("George Lucas will need %.2flv more.", total - georgeMoney);
        }




    }
}
