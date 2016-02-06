package DailyRule;

import java.time.LocalTime;

/**
 * Created by kaga on 2/6/16.
 */
public class Mainn {
    public static void main(String[] args) {
        Interval interval = new Interval(LocalTime.now(),LocalTime.now(), LocalTime.parse("01:00"));
    }
}
