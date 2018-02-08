package collectionmap;

import java.time.LocalDate;
import java.util.Date;

public class Entry {

    private String login;
    private String ipAddress;
    private Date entryDate;

    public Entry(String login, String ipAddress, Date entryDate) {
        this.login = login;
        this.ipAddress = ipAddress;
        this.entryDate = entryDate;
    }

    public String getLogin() {
        return login;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public Date getEntryDate() {
        return entryDate;
    }
}
