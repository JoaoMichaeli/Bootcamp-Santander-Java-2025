public class Main {
    public static void main(String[] args) {
        SetOfGuests setOfGuests = new SetOfGuests();

        System.out.println("Existem " + setOfGuests.countGuests() + " convidados dentro do set de convidados");

        setOfGuests.addGuest("Convidado 1", 1234);
        setOfGuests.addGuest("Convidado 2", 1235);
        setOfGuests.addGuest("Convidado 3", 1235);
        setOfGuests.addGuest("Convidado 4", 1236);

        System.out.println("\nExistem " + setOfGuests.countGuests() + " convidados dentro do set de convidados");

        setOfGuests.removeByCode(1234);

        System.out.println("\nExistem " + setOfGuests.countGuests() + " convidados dentro do set de convidados");

        setOfGuests.showGuests();
    }
}
