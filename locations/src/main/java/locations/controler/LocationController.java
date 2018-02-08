package locations.controler;

import locations.bl.Location;
import locations.bl.LocationService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocationController { // restful szolgáltatás lez ami visszadja a JSON-t
    // ide JSON-fog beérezni, de a spring át fogja alakítani, ezt a JACKSON végzi.

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @RequestMapping(value = "/api/locations", method = RequestMethod.POST)
    public String save(@RequestBody Location l) { // át kell alakitani location példánnyá.
        locationService.saveLocation(l);
        return "{\"status\": \"ok\"}";
    }

    @RequestMapping(value = "/api/locations", method = RequestMethod.GET)
    public List<Location> listLocation() {
        return locationService.listLocations();
    }

}
