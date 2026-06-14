package oop2;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Credited: " + amount +" to account " + this.accountNumber) ;
        } else {
            System.out.println("Invalid credit amount.");
        }
    }
}
