package accounts;

import entities.Client;

public class Savings extends Account {

    public Savings(Client client) {
        super(client);
    }

    @Override
    public void printStatement() {
        System.out.println("\n=== Extrato Conta Poupança ===");
        super.printCommonInfo();
    }
}
