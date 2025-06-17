public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.showContacts();

        agenda.addContact("João", 123456);
        agenda.addContact("João", 0);
        agenda.addContact("João Victor", 111111);
        agenda.addContact("João DIO", 213241);
        agenda.addContact("Maria Eduarda", 123456);
        agenda.addContact("Maria Eduarda", 123452);
        agenda.addContact("Maria", 123456);

        agenda.showContacts();

        System.out.println(agenda.searchByName("Maria"));

        System.out.println("Contato atualizado: " + agenda.updateContact("João Victor", 777777));

        agenda.showContacts();
    }
}
