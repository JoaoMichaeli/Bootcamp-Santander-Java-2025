import accounts.Account;
import accounts.Current;
import accounts.Savings;
import entities.Client;

public class Main {
    public static void main(String[] args) {
        Client joao = new Client();
        joao.setName("João");

        Account cc = new Current(joao);
        Account cp = new Savings(joao);

        cc.deposit(100);
        cc.transfer(100, cp);

        cc.printStatement();
        cp.printStatement();
    }
}
