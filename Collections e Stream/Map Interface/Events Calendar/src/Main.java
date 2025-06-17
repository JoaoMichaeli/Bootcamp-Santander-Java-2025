import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.addEvent(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
        agenda.addEvent(LocalDate.of(2025, Month.DECEMBER, 5), "Evento 2", "Atração 2");
        agenda.addEvent(LocalDate.of(2027, Month.JANUARY, 18), "Evento 3", "Atração 3");

        agenda.showAgenda();

        agenda.getNextEvent();

    }
}
