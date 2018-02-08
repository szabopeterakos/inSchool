package collectionsdeque;

import job.Job;
import job.NoJobException;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Queue;

public class JobQueue {

    private Deque<Job> jobArrayDeque = new ArrayDeque<>();

    public Deque<Job> addJobByUrgency(Job... jobs){
        jobArrayDeque.addAll(Arrays.asList(jobs));
        return jobArrayDeque;
    }

    public Job dispatchUrgentJob(Deque<Job> jobs) throws NoJobException {
        boolean hasUrgent = false;
        for (Job job: jobs) {
            if (job.isUrgent()) {
                hasUrgent = true;
                break;
            }
        }

        if (!hasUrgent) {
            throw new NoJobException("No job available");
        }

        return jobs.getFirst();
    }
    public Job dispatchNotUrgentJob(Deque<Job> jobs) throws NoJobException{
        boolean hasUrgent = false;
        for (Job job: jobs) {
            if (job.isUrgent()) {
                hasUrgent = true;
                break;
            }
        }

        if (!hasUrgent) {
            throw new NoJobException("No job available");
        }

        return jobs.getLast();
    }

}
