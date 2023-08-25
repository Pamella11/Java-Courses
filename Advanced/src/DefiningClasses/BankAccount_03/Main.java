package DefiningClasses.BankAccount_03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split("\\s+");

        Map<Integer, BankAccount> clients = new HashMap<>();

        while (!command[0].equals("End")) {

            switch (command[0]) {
                case "Create":
                    BankAccount account = new BankAccount();
                    clients.put(account.getId(), account);
                    System.out.println("Account ID" + account.getId() + " created");
                    break;
                case "Deposit":
                    int ID = Integer.parseInt(command[1]);
                    double amount = Double.parseDouble(command[2]);
                    if (clients.containsKey(ID)) {
                        clients.get(ID).deposit(amount);
                        System.out.printf("Deposited %.0f to ID%d%n", amount, ID);
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
                case "SetInterest":
                    double interest = Double.parseDouble(command[1]);
                    BankAccount.setInterestRate(interest);
                    break;
                case "GetInterest":
                    int id = Integer.parseInt(command[1]);
                    int years = Integer.parseInt(command[2]);
                    if (clients.containsKey(id)) {
                        System.out.printf("%.2f%n", clients.get(id).getInterestRate(years));
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
            }
            command = scanner.nextLine().split("\\s+");
        }
    }
}

