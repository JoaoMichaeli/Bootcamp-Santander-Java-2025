import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ContaTerminal {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Informe o número da sua conta: ");
        var numero = scanner.nextInt();

        System.out.print("Informe a agência: ");
        var agencia = scanner.next();

        System.out.print("Informe o seu nome completo: ");
        var nome = scanner.next();

        double saldo = ThreadLocalRandom.current().nextInt(100, 1001);

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$ %.2f%n já está disponível para saque", nome, agencia, numero, saldo);
    }
}
