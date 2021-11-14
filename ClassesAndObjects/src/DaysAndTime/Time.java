package DaysAndTime;

import java.util.concurrent.TimeUnit;

public class Time {
    final static long Milliseconds = System.currentTimeMillis();
    // Program which calculates how many hours have passed since the 1st of January 1970.
    // Very cool exercise ;d
    final static String LineSeparator = System.lineSeparator();
    public void printTimeLapsed() {
        System.out.println("Since 1st of January 1970 have passed:");
        System.out.printf("%d days, %d hours and %d minutes %s",
                getDays(), getHours(),
                getMinutes(),LineSeparator);

    }

    private static long getDays() {
        return TimeUnit.MILLISECONDS.toDays(Milliseconds);
    }

    private static long getHours() {
        return TimeUnit.MILLISECONDS.toHours(Milliseconds - TimeUnit.DAYS.toMillis(getDays()));
    }

    private static long getMinutes() {
        return TimeUnit.MILLISECONDS.toMinutes(Milliseconds - TimeUnit.DAYS.toMillis(getDays()) - TimeUnit.HOURS.toMillis(getHours()));
    }
}