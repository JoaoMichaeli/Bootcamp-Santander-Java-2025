import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            int option;
            GeometricForm geometricForm = null;

            System.out.println("Escolha a forma geométrica para calcular a área");
            System.out.println("\n1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Círculo");
            System.out.println("0 - Sair");

            System.out.print("\nEscolha uma opção: ");
            option = scanner.nextInt();

            if (option == 1) {
                geometricForm = createSquare();
            }
            else if (option == 2) {
                geometricForm = createRectangle();
            }
            else if (option == 3) {
                geometricForm = createCircle();
            } else if (option == 0) {
                break;
            } else {
                System.out.println("Opção inválida");
                continue;
            }
            System.out.println("Resultado: " + geometricForm.getArea());
        }
    }

    private static GeometricForm createSquare(){
        System.out.print("Lados: ");
        return new Square(scanner.nextDouble());
    }

    private static GeometricForm createRectangle(){
        System.out.print("Base: ");
        var base = scanner.nextDouble();
        System.out.print("Altura: ");
        var height = scanner.nextDouble();

        return new Rectangle(base, height);
    }

    private static GeometricForm createCircle(){
        System.out.print("Raio: ");
        var radius = scanner.nextDouble();
        return new Circle(radius);
    }
}
