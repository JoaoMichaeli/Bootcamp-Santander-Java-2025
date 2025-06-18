import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // Lista de palavras
        List<String> words = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        // Predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> moreFiveChar = word -> word.length() > 5;

        words.stream()
                .filter(moreFiveChar)
                .forEach(System.out::println);
    }
}

/*
* Representa uma função que aceita um argumento do tipo T e retorna um valor booleano.
* É comumente usada para filtrar os elementos do Stream com base em alguma condição.
*/
