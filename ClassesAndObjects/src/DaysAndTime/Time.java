package DaysAndTime;
import java.util.concurrent.TimeUnit;

public class Time {
    static long Milliseconds = System.currentTimeMillis();

    public static void main(String[] args) {
        // Program which calculates how many hours have passed since the 1st of January 1970.
        // Very cool exercises ;d

        long millisecondsNow = System.currentTimeMillis();
        System.out.println("Since 1st of January 1970 have passed:");
        System.out.printf("%d days, %d hours and %d minutes", getDays(), getHours(), getMinutes());

    }

    static long getDays() {
        return TimeUnit.MILLISECONDS.toDays(Milliseconds);
    }

    static long getHours() {
        return TimeUnit.MILLISECONDS.toHours(Milliseconds - TimeUnit.DAYS.toMillis(getDays()));
    }

    static long getMinutes() {
        return TimeUnit.MILLISECONDS.toMinutes(Milliseconds - TimeUnit.DAYS.toMillis(getDays()) - TimeUnit.HOURS.toMillis(getHours()));
    }
}
