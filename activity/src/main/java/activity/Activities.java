package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {

    private List<Activity> activityList = new ArrayList<>();

    public Activities(List<Activity> activityList) {
        this.activityList = activityList;
    }

    public void addActivity(Activity activity) {
        activityList.add(activity);
    }

    public List<Report> distancesByTypes() {
        List<Report> reports = new ArrayList<>();  // új üres
        for (ActivityType activityType : ActivityType.values()) {
            Report report = new Report(activityType, 0);
            reports.add(report);
        }

        for (Activity activity : activityList) {
            double defaultDistance = reports.get(activity.getType().ordinal()).getDistance();
            double newDistance = defaultDistance + activity.getDistance();

            reports.set(activity.getType().ordinal(), new Report(activity.getType(), newDistance));
        }

        return reports;
    }

    public int numberOfTrackActivities() {
        int counter=0;
        for (Activity c : activityList) {
            if(c instanceof ActivityWithTrack){
                counter++;
            }
        }
        return counter;

    }

    public int numberOfWithoutTrackActivities() {
        int counter=0;
        for (Activity c : activityList) {
            if(c instanceof ActivityWithoutTrack){
                counter++;
            }
        }
        return counter;

    }

}
