package duration;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkHoursCalculator {

    List<Duration> workHours = new ArrayList<>();

    public void addWorkTime(Duration duration) {
        workHours.add(duration);
    }

    public void addWorkTime(int days, int hours, int minutes) {
        long minutesLong = ((days * 24) * 60) + (hours * 60) + minutes;
        workHours.add(Duration.ofMinutes(minutesLong));
    }

    public void addWorkTime(String durationString) {
        patternValidator(durationString);

        workHours.add(Duration.parse(durationString));
    }

    public int calculateWorkHours() {
        long count = 0;
        for (Duration duration : workHours) {
            count += duration.toHours();
        }
        return (int) count;
    }

    public Duration getWorkDuration() {
        Duration sumDuration = Duration.ofDays(0);
        for (Duration duration : workHours) {
            sumDuration = sumDuration.plus(duration);
        }
        return sumDuration;
    }

    public String toString() {
        Duration sumDuration = getWorkDuration();

        return "Days: " + sumDuration.toDays() + ", hours: " + sumDuration.toHours() % 24 + ", minutes: " + sumDuration.toMinutes() % 60;
    }

    private void patternValidator(String durationPattern) {
        if (isEmpty(durationPattern)) {
            throw new IllegalArgumentException("Parameter must not be empty!");
        }

        Pattern pattern = Pattern.compile("^P[0-9]DT[0-2]*[0-9]H[0-5]*[0-9]M$");
        Matcher matcher = pattern.matcher(durationPattern);

        if (!matcher.matches()) {
            throw new IllegalArgumentException("Parameter must match PnDTnHnM pattern, but found:");
        }
    }

    private boolean isEmpty(String str) {
        if (str == null || str.trim().isEmpty()) {
            return true;
        }
        return false;
    }

}
