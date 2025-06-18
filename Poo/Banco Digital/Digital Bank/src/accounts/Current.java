package accounts;

import entities.Client;

public class Current extends Account{

    public Current(Client client) {
        super(client);
    }

    @Override
    public void printStatement() {
        System.out.println("\n=== Extrato Conta Corrente ===");
        super.printCommonInfo();
    }
}
