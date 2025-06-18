import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        // Criando uma lista de numeros inteiros
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Usando function com lambda pra dobrar
        Function<Integer, Integer> toBend = number -> number * 2;

        // Usando a function pra dobrar todos os numeros
        List<Integer> doubledNumbers = numbers.stream()
                .map(n -> n * 2)
                .toList();

        // Imprimindo
        doubledNumbers.forEach(System.out::println);
    }
}

/*
* Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
* É utilizada para transoformar ou mapear os elementos do Stream em outros valores ou tipos.
*/
