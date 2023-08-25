package DefiningClasses.BankAccount_03;

public class BankAccount {

    private static double interestRate = 0.02;
    private int id;
    private static int counter = 1;
    private double balance;

    BankAccount() {
        this.id = counter++;
    }

    int getId() {
        return this.id;
    }

    static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    double getInterestRate(int years) {
        return BankAccount.interestRate * years * this.balance;
    }

    void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public String toString() {
        return String.format("Account ID%d, balance %.2f", id, this.balance);
    }

}
