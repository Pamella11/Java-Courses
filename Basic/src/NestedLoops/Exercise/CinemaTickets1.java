package NestedLoops.Exercise;

import java.util.Scanner;

public class CinemaTickets1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();

        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;
        int totalTickets = 0;

        while (!movieName.equals("Finish")) {

            int freeSeats = Integer.parseInt(scanner.nextLine());
            String ticketType = scanner.nextLine();
            int seats = 0;

            while (!ticketType.equals("End")) {

                seats ++;

                switch (ticketType) {
                    case "student":
                        studentTickets++;
                        break;
                    case "standard":
                        standardTickets ++;
                        break;
                    case "kid":
                        kidTickets ++;
                        break;
                }

                if (seats >= freeSeats) {
                    break;
                }

                ticketType = scanner.nextLine();
            }

            totalTickets += seats;

            double percentCapacity = 1.0 * seats / freeSeats * 100;

            System.out.printf("%s - %.2f%% full.%n", movieName, percentCapacity);


            movieName = scanner.nextLine();
        }

        double percentStudentTickets = 1.0 * studentTickets / totalTickets * 100;
        double percentStandardTickets = 1.0 * standardTickets / totalTickets * 100;
        double percentKidTickets = 1.0 * kidTickets / totalTickets * 100;

        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", percentStudentTickets );
        System.out.printf("%.2f%% standard tickets.%n", percentStandardTickets );
        System.out.printf("%.2f%% kids tickets.%n", percentKidTickets );

    }
}
