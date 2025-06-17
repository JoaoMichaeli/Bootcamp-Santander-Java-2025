import java.util.Objects;

public class Contact {

    private String name;

    private int number;

    public Contact(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contact that = (Contact) o;
        return getNumber() == that.getNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNumber());
    }

    @Override
    public String toString() {
        return "Nome: " + name +
                " - Número: " + number +
                " | ";
    }
}
