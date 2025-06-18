import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8 ,9 ,10);

        // Usando o Consumer com lambda
        Consumer<Integer> printEvenNumber = number -> {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        };

        // Usando o Consumer com Stream
        numbers.stream().filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}


/*
 * Consumer representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações ou efeitos colaterais nos elementos do Stream sem modificar,
 * ou retornar um valor
 */
