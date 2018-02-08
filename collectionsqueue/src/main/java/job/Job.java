package job;

public class Job implements Comparable {
    private int priority;
    private String jobDescription;

    public Job(int priority, String jobDescription) {
        this.priority = priority;
        this.jobDescription = jobDescription;
    }

    public int getPriority() {
        return priority;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public boolean isUrgent () {
        return priority < 5;
    }

    @Override
    public int compareTo(Object o) {
        Job currentJob = (Job) o;
        if(this.getPriority() > currentJob.getPriority()){ // ha az elem nagobb mint amive hasonlítom
            return 1;
        }
        if(this.getPriority() < currentJob.getPriority()){
            return -1;
        }
        return 0;
    }
}
