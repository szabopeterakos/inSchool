package collectionsdeque;

import job.Job;
import job.NoJobException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class JobQueueTest {
    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void emptyQueueShouldThrowException() throws NoJobException {
        //Given
        exception.expect(NoJobException.class);
        exception.expectMessage("No job available");

        //When
        new JobQueue().dispatchUrgentJob(new ArrayDeque<>());
    }

    @Test
    public void urgentJobShouldComeFromHead() throws NoJobException {
        //Given
        Job urgent = new Job(4, "urgent");
        Job notUrgent = new Job(5, "not urgent");

        JobQueue jobQueue = new JobQueue();

        //When
        Deque<Job> jobs = jobQueue.addJobByUrgency(urgent, notUrgent); // 4,5

        // Then
        assertThat(jobQueue.dispatchUrgentJob(jobs).getJobDescription(), equalTo("urgent"));
        assertThat(jobQueue.dispatchUrgentJob(jobs).isUrgent(), equalTo(true));
    }

    @Test
    public void notUrgentJobShouldComeFromTail() throws NoJobException {
        //Given
        Job urgent = new Job(4, "urgent");
        Job notUrgent = new Job(5, "not urgent");

        JobQueue jobQueue = new JobQueue();

        //When
        Deque<Job> jobs = jobQueue.addJobByUrgency(urgent, notUrgent);

        // Then
        assertThat(jobQueue.dispatchNotUrgentJob(jobs).getJobDescription(), equalTo("not urgent"));
        assertThat(jobQueue.dispatchNotUrgentJob(jobs).isUrgent(), equalTo(false));
    }
}
