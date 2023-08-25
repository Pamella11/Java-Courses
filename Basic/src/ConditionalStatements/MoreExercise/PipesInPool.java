package ConditionalStatements.MoreExercise;

        import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //За 3 часа:
        //Първата тръба е напълнила – 300 л.
        //Втората тръба е напълнила – 360 л.
        //Общо – 660 л. < 1000 л. => 66% са запълнени
        //Първата тръба е допринесла с 45% (300 от 660 л.).
        //Втората тръба е допринесла с 54% (360 от 660 л.).
        // V - обем

        int poolV = Integer.parseInt(scanner.nextLine());
        int pipe1 = Integer.parseInt(scanner.nextLine());
        int pipe2 = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double pipe1Liters = pipe1 * hours;
        double pipe2Liters = pipe2 * hours;
        double sumLiters = pipe1Liters + pipe2Liters;

        if (sumLiters <= poolV) {
            double percent = (sumLiters / poolV) * 100;
            double pipe1percent = (pipe1Liters / sumLiters) * 100;
            double pipe2percent = (pipe2Liters / sumLiters) * 100;
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", percent, pipe1percent, pipe2percent);

        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, sumLiters - poolV);


        }
    }
}
