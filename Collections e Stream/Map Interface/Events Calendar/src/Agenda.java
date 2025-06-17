import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Agenda {

    private Map<LocalDate, Event> eventMap;

    public Agenda() {
        this.eventMap = new HashMap<>();
    }

    public void addEvent(LocalDate date, String name, String attraction) {
        eventMap.put(date, new Event(name, attraction));
    }

    public void showAgenda() {
        Map<LocalDate, Event> eventTreeMap = new TreeMap<>(eventMap);

        System.out.println(eventTreeMap);
    }

    public void getNextEvent() {
        LocalDate currentDate = LocalDate.now();
        LocalDate nextDate = null;
        Event nextEvent = null;

        Map<LocalDate, Event> eventTreeMap = new TreeMap<>(eventMap);
        for (Map.Entry<LocalDate, Event> entry : eventMap.entrySet()) {
            if (entry.getKey().isEqual(currentDate) || entry.getKey().isAfter(currentDate)) {
                nextDate = entry.getKey();
                nextEvent = entry.getValue();
                System.out.println("O próximo evento: " + nextEvent + " acontecerá na data " + nextDate);
                break;
            }
        }
    }
}
