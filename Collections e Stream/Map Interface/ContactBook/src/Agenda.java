import java.util.HashMap;
import java.util.Map;

public class Agenda {

    private Map<String, Integer> agendaContactMap;

    public Agenda() {
        this.agendaContactMap = new HashMap<>();
    }

    public void addContact(String name, Integer telephone) {
        agendaContactMap.put(name, telephone);
    }

    public void removeContact(String name) {
        if (!agendaContactMap.isEmpty()) {
            agendaContactMap.remove(name);
        }
    }

    public void showContacts() {
        System.out.println(agendaContactMap);
    }

    public Integer searchByName(String name) {
        Integer numberByName = null;

        if (!agendaContactMap.isEmpty()) {
            numberByName = agendaContactMap.get(name);
        }
        return numberByName;
    }
}
