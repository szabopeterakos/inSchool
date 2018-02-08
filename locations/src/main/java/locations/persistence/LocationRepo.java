package locations.persistence;

import locations.bl.Location;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository // a spting tudja majd hogy adatbázis kapcsolat, használtal.
public class LocationRepo {

    private final JdbcTemplate jdbcTemplate;

    public LocationRepo(JdbcTemplate jdbcTemplate) { //dependency inection, nem mi példányosítunk hanem a spring. át ad neki egy jdbc templétet is.
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Location location) {
        jdbcTemplate.update("insert into locations(name, lat, lon) values (?, ?, ?)", location.getName(), location.getLat(), location.getLon());
    }

    public List<Location> listLocations() { // * nm használható mert, feleslegesen ne járjon az adatbázis.
        // ez egy táblázatot ad vissza amibe sorokvannak, és ez átforgatja listává.
        return jdbcTemplate.query("select id, name, lat, lon from locations", new RowMapper<Location>() { // return mivel 37ben soronként kell visszatérni.
            // query visszaad egy resoultset-et,

            @Override
            public Location mapRow(ResultSet resultSet, int i) throws SQLException { //a mapROw-t az i megmondja éppen hagyadik sor, spring hivja meg soronént

                return new Location(resultSet.getLong("id"), resultSet.getString("name"), resultSet.getDouble("lat"), resultSet.getDouble("lon"));

            }
        });
    }
}
