import java.util.HashSet;
import java.util.Set;

public class SetOfGuests {

    private Set<Guests> guestsSet;

    public SetOfGuests() {
        this.guestsSet = new HashSet<>();
    }

    public void addGuest(String name, int invitationCode){
        guestsSet.add(new Guests(name, invitationCode));
    }

    public void removeByCode(int invitationCode){
        Guests invitedToRemove = null;

        for (Guests c : guestsSet) {
            if (c.getInvitationCode() == invitationCode) {
                invitedToRemove = c;
                break;
            }
        }
        guestsSet.remove(invitedToRemove);
    }

    public int countGuests(){
        return guestsSet.size();
    }

    public void showGuests(){
        System.out.println(guestsSet);
    }
}
