import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // BinaryOperator com lambda
        BinaryOperator<Integer> sum = Integer::sum;

        // Somando
        int result = numbers.stream()
                .reduce(0, sum);

        System.out.println("A soma dos números é: " + result);
    }
}

/*
* Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
* É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
*/
