import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        var option =- 1;

        do {
            System.out.println("\n===Escolha uma das opções===");
            System.out.println("\n1 - Dar banho");
            System.out.println("2 - Abastecer máquina com água");
            System.out.println("3 - Abastecer máquina com shampoo");
            System.out.println("4 - Verificar nivel de água");
            System.out.println("5 - Verificar nivel de shampoo");
            System.out.println("6 - Verificar disponibilidade");
            System.out.println("7 - Colocar pet");
            System.out.println("8 - Retirar pet");
            System.out.println("9 - Limpar máquina");
            System.out.println("0 - Sair");

            System.out.print("\nDigite sua opção: ");
            option = scanner.nextInt();

            switch (option){
                case 1 -> petMachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida");
            }
        }while (true);
    }

    private static void setWater(){
        System.out.println("Reabastecendo água");
        petMachine.addWater();
    }

    private static void setShampoo(){
        System.out.println("Reabastecendo shampoo");
        petMachine.addShampoo();
    }

    private static void verifyShampoo() {
        var amout = petMachine.getShampoo();
        System.out.println("Nivel de shampoo " + amout + " litros");
    }

    private static void verifyWater() {
        var amout = petMachine.getWater();
        System.out.println("Nivel de água " + amout + " litros");
    }

    private static void checkIfHasPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Indisponível" : "Disponível");
    }

    public static void setPetInPetMachine(){
        var name = "";
        while (name.isBlank()){
            System.out.print("Informe o nome do pet: ");
            name = scanner.next();
        }
        var pet = new Pet(name);

        petMachine.setPet(pet);
    }
    
}