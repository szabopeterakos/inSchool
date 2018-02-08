package inheritanceconstructor.classroom;

public class ClassRoom extends Room {

    private Facility facility;

    public ClassRoom(String location, int capacity, Facility facility) {
        super(location, capacity);
        this.facility = facility;
    }

    public boolean isSuitable(Course course) {
        if (getCapacity() >= course.getParticipants() && getFacility().toString().equals(course.getFacilityNeeded().toString())) {
            return true;
        }
        return false;
    }


    public Facility getFacility() {
        return facility;
    }

}
