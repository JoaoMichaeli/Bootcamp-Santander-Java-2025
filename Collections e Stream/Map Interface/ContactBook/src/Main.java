public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.addContact("João", 123456);
        agenda.addContact("João", 222456);
        agenda.addContact("João Victor", 777777);
        agenda.addContact("João Michaeli", 222456);
        agenda.addContact("Maria", 223456);
        agenda.addContact("Maria Eduarda", 333456);
        agenda.addContact("João", 666666);

        agenda.showContacts();

        agenda.removeContact("João Michaeli");
        agenda.showContacts();

        System.out.println("O número é: " + agenda.searchByName("Maria"));
    }
}
