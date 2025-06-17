import java.util.HashSet;
import java.util.Set;

public class Agenda {

    private Set<Contact> contactSet;

    public Agenda() {
        this.contactSet = new HashSet<>();
    }

    public void addContact(String name, int number) {
        contactSet.add(new Contact(name, number));
    }

    public void showContacts() {
        System.out.println(contactSet);
    }

    public Set<Contact> searchByName(String name) {
        Set<Contact> contactsByName = new HashSet<>();

        for (Contact c : contactSet) {
            if (c.getName().startsWith(name)) {
                contactsByName.add(c);
            }
        }
        return contactsByName;
    }

    public Contact updateContact(String name, int newNumber) {
        Contact updatedContact = null;

        for (Contact c : contactSet) {
            if (c.getName().equalsIgnoreCase(name)) {
                c.setNumber(newNumber);
                updatedContact = c;
                break;
            }
        }
        return  updatedContact;
    }
}
