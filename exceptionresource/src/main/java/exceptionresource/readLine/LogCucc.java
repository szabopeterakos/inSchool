package exceptionresource.readLine;

import exceptionresource.accesscontrol.AccessType;

import java.time.LocalDateTime;

public class LogCucc {

    private LocalDateTime localDateTime;
    private String name;
    private AccessType accessType;

    public LogCucc(LocalDateTime localDateTime, String name, AccessType accessType) {
        this.localDateTime = localDateTime;
        this.name = name;
        this.accessType = accessType;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public String getName() {
        return name;
    }

    public AccessType getAccessType() {
        return accessType;
    }
}
