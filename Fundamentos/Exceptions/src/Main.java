import dao.UserDAO;
import exception.CustomException;
import exception.EmptyStorageException;
import exception.UserNotFoundException;
import exception.ValidatorException;
import model.MenuOption;
import model.UserModel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import static validator.UserValidator.verifyModel;

public class Main {

    private final static UserDAO dao = new UserDAO();
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true){
            System.out.println("Bem vindo ao cadastro de usuários, selecione a operação desejada");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Atualizar");
            System.out.println("3 - Excluir");
            System.out.println("4 - Buscar por identificador");
            System.out.println("5 - Listar");
            System.out.println("6 - Sair");

            var userInput = scanner.nextInt();
            var selectedOption = MenuOption.values()[userInput - 1];
            switch (selectedOption){
                case SAVE -> {
                    try{
                        var user = dao.save(requestToSave());
                        System.out.printf("Usuário %s cadastrado", user);
                    }catch (CustomException e){
                        System.out.println(e.getMessage());
                        e.printStackTrace();
                    }
                }
                case UPDATE -> {
                    try {
                        var user = dao.update(requestToUpdate());
                        System.out.printf("Usuário %s atualizado", user);
                    }catch (UserNotFoundException | EmptyStorageException e) {
                        System.out.println(e.getMessage());
                    }catch (CustomException e){
                        System.out.println(e.getMessage());
                        e.printStackTrace();
                    }finally {
                        System.out.println("===================");
                    }
                }
                case DELETE -> {
                    try {
                        dao.delete(requestId());
                        System.out.println("Usuário deletado");
                    }catch (UserNotFoundException | EmptyStorageException e){
                        System.out.println(e.getMessage());
                    }finally {
                        System.out.println("===================");
                    }
                }
                case FIND_BY_ID -> {
                    try {
                        var id = requestId();
                        var user = dao.findById(id);
                        System.out.printf("Usuário %s: ", id);
                        System.out.println(user);
                    }catch (UserNotFoundException | EmptyStorageException e){
                        System.out.println(e.getMessage());
                    }finally {
                        System.out.println("===================");
                    }
                }
                case FIND_ALL ->  {
                    var users = dao.findAll();
                    System.out.println("Usuários cadastrados");
                    System.out.println("====================");
                    users.forEach(System.out::println);
                    System.out.println("====================");
                }
                case EXIT -> System.exit(0);
            }
        }
    }

    private static long requestId(){
        System.out.println("Informe o id");
        return scanner.nextLong();
    }

    private static UserModel requestToSave(){
        System.out.println("Informe o nome");
        var name = scanner.next();

        System.out.println("Informe o email");
        var email = scanner.next();

        System.out.println("Informe a data de nascimento (dd/MM/yyyy)");
        var birthdayString = scanner.next();
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var birthday = LocalDate.parse(birthdayString, formatter);

        return validateInputs(0, name, email, birthday);
    }

    private static UserModel validateInputs(final long id, final String name, final String email, final LocalDate birthday){
        var user = new UserModel(0, name, email, birthday);
        try {
            verifyModel(user);
            return user;
        }catch (ValidatorException e){
            throw new CustomException("O seu usuário contem erros: " + e.getMessage(), e);
        }
    }

    private static UserModel requestToUpdate(){
        System.out.println("Informe o id");
        var id = scanner.nextLong();

        System.out.println("Informe o nome");
        var name = scanner.next();

        System.out.println("Informe o email");
        var email = scanner.next();

        System.out.println("Informe a data de nascimento (dd/MM/yyyy)");
        var birthdayString = scanner.next();
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var birthday = LocalDate.parse(birthdayString, formatter);

        return validateInputs(id, name, email, birthday);
    }

}
