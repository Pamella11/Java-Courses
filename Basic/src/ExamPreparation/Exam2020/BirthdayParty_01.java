package ExamPreparation.Exam2020;

import java.util.Scanner;

public class BirthdayParty_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rent = Double.parseDouble(scanner.nextLine());

        double cake = rent * 0.2;
        double drinks = cake - cake * 0.45;
        double animator = rent / 3;

        double budget = rent + cake + drinks + animator;

        System.out.println(budget);

    }
}
