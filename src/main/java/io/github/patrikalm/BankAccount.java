package io.github.patrikalm;

public class BankAccount {

    double saldo;
   static int accountNumber = 10000;

    public double getSaldo() {
        return saldo;
    }

    public void deposit(double saldo) {


        this.saldo += saldo;
    }

    public int getAccountNumber(int accountNumber) {
        return accountNumber;
    }

    public BankAccount() {
        ++accountNumber;
    }

    public BankAccount(double saldo) {
        ++accountNumber;
        this.saldo = saldo;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {

        if (this.saldo < amount) {
            double needs = amount - this.saldo;
            throw new InsufficientBalanceException(needs);
        }
        saldo -= amount;
    }




}
