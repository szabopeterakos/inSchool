package collectionspriorityqueue;

import job.Job;
import job.NoJobException;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class JobDispatcher {

    private Queue<Job> jobQueue = new PriorityQueue<>();

    public Queue<Job> addJob(Job... jobVarargs) {
        jobQueue.addAll(Arrays.asList(jobVarargs));
        return jobQueue;
    }

    public Job dispatchNextJob(Queue<Job> jobs) throws NoJobException {
        if (jobQueue.isEmpty()) {
            throw new NoJobException("No job available");
        }

        return jobQueue.remove();
    }



}
