package accounts;

import entities.Client;
import interfaces.IAccount;

public abstract class Account implements IAccount {

    private static final int standardAgency = 1;
    private static int sequencial = 1;

    protected int agency;
    protected int number;
    protected double balance;
    protected Client client;

    public Account(Client client) {
        this.agency = Account.standardAgency;
        this.number = sequencial++;
        this.client = client;
    }

    @Override
    public void withdraw(double value) {
        balance -= value;
    }

    @Override
    public void deposit(double value) {
        balance += value;
    }

    @Override
    public void transfer(double value, IAccount destinationAccount) {
        this.withdraw(value);
        destinationAccount.deposit(value);
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    protected void printCommonInfo() {
        System.out.printf("Titular: %s", this.client.getName());
        System.out.printf("\nAgência: %d", this.agency);
        System.out.printf("\nNúmero: %d", this.number);
        System.out.printf("\nSaldo: R$%.2f", this.balance);
        System.out.println(" ");
    }
}
