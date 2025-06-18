package interfaces;

public interface IConta {

    void withdraw(double value);

    void deposit (double value);

    void transfer (double value, IConta destinationAccount);

    void printStatement();
}
