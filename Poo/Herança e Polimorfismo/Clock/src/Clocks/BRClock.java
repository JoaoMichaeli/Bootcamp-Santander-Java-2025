package Clocks;

public non-sealed class BRClock extends Clock {

    @Override
    Clock convert(Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        switch (clock){
            case USClock usClock -> this.hour = (usClock.getPeriodIndicator().equals("PM")) ? usClock.getHour() + 12 : usClock.getHour();
            case BRClock brClock -> this.hour = brClock.getHour();
        }
        return this;
    }
}
