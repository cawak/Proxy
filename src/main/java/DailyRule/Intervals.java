package DailyRule;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kaga on 2/6/16.
 */
public class Intervals {
    List<Interval> intervals = new ArrayList<>();

    LocalTime[] localTimes = {LocalTime.parse("00:00"), LocalTime.parse("00:15")};

    public void addInterval(Interval interval){
        Interval originalInterval = interval;
        int counter = 0;
        intervals.add(interval);
        while ((counter+=900)<originalInterval.getSlack()){
            interval=originalInterval;
            interval.setSlack(counter);
            intervals.add(interval.addSlackToTimes());
            intervals.add(interval.addNegativeSlackToTimes().addNegativeSlackToTimes());
        }
    }

    public List<Interval> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<Interval> intervals) {
        this.intervals = intervals;
    }
}
