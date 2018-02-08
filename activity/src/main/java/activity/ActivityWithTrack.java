package activity;

public class ActivityWithTrack implements Activity {

    ActivityType activityType;
    Track track;

    public ActivityWithTrack(Track track, ActivityType activityType) {
        this.activityType = activityType;
        this.track = track;
    }

    @Override
    public double getDistance() {
        return track.getDistance();
    }

    @Override
    public ActivityType getType() {
        return activityType;
    }
}
