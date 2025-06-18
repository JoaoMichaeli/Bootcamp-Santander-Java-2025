import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        // Usando supplier com lambda
        Supplier<String> greeting = () -> "Olá, seja bem-vindo(a)!";

        // Obtendo 5 saudaçoes
        List<String> greetingList = Stream.generate(() -> "Olá, seja bem-vindo(a)!")
                .limit(5)
                .toList();

        // Imprimindo
        greetingList.forEach(System.out::println);
    }
}

/*
* Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
* É comumente usada para criar ou fornecer novos objetos de um determinado tipo
*/