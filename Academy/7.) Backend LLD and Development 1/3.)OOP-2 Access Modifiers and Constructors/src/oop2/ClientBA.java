package oop2;

public class ClientBA {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456", 1000.0);
        account1.credit(500.0); // Crediting 500 to the account
        account1.credit(-200.0); // Attempting to credit a negative amount
    }
}
