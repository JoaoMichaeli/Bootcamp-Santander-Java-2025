import java.util.Objects;

public class Guests {

    private String name;

    private int invitationCode;

    public Guests(String name, int invitationCode) {
        this.name = name;
        this.invitationCode = invitationCode;
    }

    public String getName() {
        return name;
    }

    public int getInvitationCode() {
        return invitationCode;
    }

    @Override
    public String toString() {
        return "Nome: " + name +
                " - Código de convite: " + invitationCode +
                " | ";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Guests guests = (Guests) o;
        return getInvitationCode() == guests.getInvitationCode();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getInvitationCode());
    }
}
