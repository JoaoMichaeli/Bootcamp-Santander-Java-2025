import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        List<User> users = List.of(new User("Maria", 20), new User("João", 23),
                new User("Luisa", 19), new User("Magna", 49));

        printStringValue(Record::toString, users);
    }

    private static void printStringValue(Function<User, String> callback, List<User> users){
        users.forEach(u -> System.out.println(callback.apply(u)));
    }

}
