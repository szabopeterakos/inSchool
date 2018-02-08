package duration;

import java.time.Duration;
import java.time.Instant;

public class StringCreationStudies {

    public long measureStringCreationTimeRequiredOnHeap(int objectsCount) {
        Instant start = Instant.now();

        for (int i = 0; i < objectsCount; i++) {
            String string = new String("John Snow");
        }

        long duration = Duration.between(start, Instant.now()).toNanos();
        System.out.println("Heap calculate time: " + duration + " nanosecond.");
        return duration;
    }

    public long measureStringCreationTimeRequiredInPool(int objectsCount) {
        Instant start = Instant.now();

        for (int i = 0; i < objectsCount; i++) {
            String string = "Mr. Propper";
        }

        long duration = Duration.between(start, Instant.now()).toNanos();
        System.out.println("Pool calculate time: " + duration + " nanosecond.");
        return duration;
    }
}
