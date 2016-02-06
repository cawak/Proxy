package DailyRule;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kaga on 2/6/16.
 */
public class ListOfIntervals {
    List<Intervals> intervalsList = new ArrayList<>();

    //Should be a sorted tree or something to get less runtime.
    //Here we should have the logic of the algorithm itself.

    public List<Intervals> getIntervalsList() {
        return intervalsList;
    }

    public void setIntervalsList(List<Intervals> intervalsList) {
        this.intervalsList = intervalsList;
    }
}
