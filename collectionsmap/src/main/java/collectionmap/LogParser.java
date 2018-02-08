package collectionmap;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
 * elvégzi a dátum String konvertálását, a sor feldolgozását, és Map-be szortírozását.
 * A fő tevékenységet a (parseLog(String log)) metódus végzi,
 * amely egy (Map<String, List<Entry>>) értéket ad vissza.
 */

public class LogParser {

    private static final int PART_COUNT = 3;
    private static final int IP_ADDRESS_INDEX = 0;
    private static final int DATE_INDEX = 1;
    private static final int LOGIN_INDEX = 2;

    private Entry lineMaker(String line) throws IOException {
        try {
            String parts[] = line.split(":");

            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(parts[1]);

            return new Entry(parts[2], parts[0], date);
        } catch (ParseException | IndexOutOfBoundsException e) {
            throw new IOException("Incorrect log");
        }
    }

    public Map<String, List<Entry>> parseLog(String log) throws IOException {
        Map<String, List<Entry>> entries = new HashMap<>();
        List<String> lines = Arrays.asList(log.split("\n"));
        for (String line : lines) {
            Entry entry = lineMaker(line);
            if (!entries.containsKey(entry.getIpAddress())) {
                entries.put(entry.getIpAddress(), new ArrayList<>());
            }
            entries.get(entry.getIpAddress()).add(entry);
        }
        return entries;
    }


}
