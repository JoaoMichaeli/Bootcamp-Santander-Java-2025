import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Valor salário: ");
        double valorSalario = leitor.nextDouble();

        System.out.print("Valor benefícios: ");
        double valorBeneficios = leitor.nextDouble();

        double valorImposto = 0;

        if (valorSalario >= 0 && valorSalario <= 1100)
            valorImposto = 0.05D * valorSalario;
        else if (valorSalario > 1100 && valorSalario <= 2500)
            valorImposto = 0.10D * valorSalario;
        else
            valorImposto = 0.15D * valorSalario;

        double saida = (valorSalario - valorImposto) + valorBeneficios;

        System.out.printf("\nValor recebido: R$: %.2f", saida);
    }
}