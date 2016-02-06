package DailyRule;


/**
 * Created by kaga on 2/6/16.
 */
public class Interval {

    int start;
    int end;
    int slack;
    int slackInterval = 900;


    public Interval(int start, int end, int slack) {
        this.start = start;
        this.end = end;
        if (slack/this.slackInterval<5 && slack%this.slackInterval==0){
            this.slack = slack;
        } else {
            throw new RuntimeException("Bad slack format");
        }
    }

    public Interval addSlackToTimes(){
        this.start += this.slack;
        this.end += this.slack;
        return this;
    }

    public Interval addNegativeSlackToTimes(){
        this.start -= this.slack;
        this.end -= this.slack;
        return this;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getSlack() {
        return slack;
    }

    public void setSlack(int slack) {
        this.slack = slack;
    }

    public int getSlackInterval() {
        return slackInterval;
    }

    public void setSlackInterval(int slackInterval) {
        this.slackInterval = slackInterval;
    }
}
