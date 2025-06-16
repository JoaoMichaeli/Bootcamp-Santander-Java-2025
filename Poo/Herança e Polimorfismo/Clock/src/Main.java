import Clocks.BRClock;
import Clocks.Clock;
import Clocks.USClock;

public class Main {
    public static void main(String[] args) {
        Clock brclock = new BRClock();

        brclock.setSecond(0);
        brclock.setMinute(0);
        brclock.setHour(25);

        System.out.println(brclock.getTime());

        System.out.println(new USClock().convert(brclock).getTime());
    }
}
