package locations.bl;


import locations.persistence.LocationRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService { // üzleti logika réteg, tipikusan egy példánya van.(spring csinálja, amit több szálon hív meg (szingleton).)

    // függőségként beinjecktáljuk
    private final LocationRepo locationRepo;

    public LocationService(LocationRepo locationRepo) {
        this.locationRepo = locationRepo;
    }

    public void saveLocation(Location location) {
        locationRepo.save(location);
    }

    public List<Location> listLocations() {
        return locationRepo.listLocations();
    }

}
