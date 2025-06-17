import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordering {

    private List<People> peopleList;

    public Ordering() {
        this.peopleList = new ArrayList<>();
    }

    public void addPeople(String name, int age, double height) {
        peopleList.add(new People(name, age, height) {

        });
    }

    public List<People> orderByAge() {
        List<People> peopleByAge = new ArrayList<>(peopleList);
        Collections.sort(peopleByAge);
        return peopleByAge;
    }

    public List<People> orderByHeight() {
        List<People> peopleByHeight = new ArrayList<>(peopleList);
        Collections.sort(peopleByHeight, new ComparatorByHeight());
        return peopleByHeight;
    }
}
