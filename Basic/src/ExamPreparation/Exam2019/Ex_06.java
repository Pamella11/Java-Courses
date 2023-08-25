package ExamPreparation.Exam2019;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Любовно послание - 0.60 лв.
        //•	Восъчна роза - 7.20 лв.
        //•	Ключодържател - 3.60 лв.
        //•	Карикатура - 18.20 лв.
        //•	Късмет изненада - 22 лв.


        double maidenParty = Double.parseDouble(scanner.nextLine());
        int loveLetters = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int keychains = Integer.parseInt(scanner.nextLine());
        int photos = Integer.parseInt(scanner.nextLine());
        int surprises = Integer.parseInt(scanner.nextLine());

        int counter = loveLetters + roses + keychains + photos + surprises;

        double sum = loveLetters * 0.60 + roses * 7.20 + keychains * 3.60 + photos * 18.20 + surprises * 22;

        if (counter >= 25) {
            sum = sum - sum * 0.35;
        }

        double expanses = sum - sum * 0.1;

        if (expanses >= maidenParty) {
            System.out.printf("Yes! %.2f lv left.", expanses - maidenParty);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", maidenParty - expanses);
        }




    }
}
