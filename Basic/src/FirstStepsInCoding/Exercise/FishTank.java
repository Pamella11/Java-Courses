package FirstStepsInCoding.Exercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.Четем от конзолата
        //1.1.Дължина
        //1.2.Широчина
        //1.3.Височина
        //1.4.Процент
        //2.Пресмятаме обема
        //3.Обръщаме обема в литри
        //4.Пресмятаме колко литри са ни нужни
        //5.Принтираме

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int volume = length * width * height;
        double fullTankLiters = volume * 0.001;
        double neededLiters = fullTankLiters *(1-percent/100);
        System.out.println(neededLiters);



    }
}
