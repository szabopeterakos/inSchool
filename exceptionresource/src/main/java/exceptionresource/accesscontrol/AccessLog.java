package exceptionresource.accesscontrol;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccessLog {

    private String logName;
    private List<LogWork> logWorks = new ArrayList<>();

    public AccessLog(String logName) {
        this.logName = logName;
    }

    public void logObjectCreator(String fileName) {
        logWorks.clear();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String actLine;
            while ((actLine = bufferedReader.readLine()) != null) {
                String[] actParameters = actLine.split(",");

                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd. HH:mm:ss");
                LocalDateTime actDateTime = LocalDateTime.parse(actParameters[0], dateTimeFormatter);
                String actName = actParameters[1];

                AccessType actAccessType = null;
                if (actParameters[2].equals(AccessType.IN.toString())) {
                    actAccessType = AccessType.IN;
                }
                if (actParameters[2].equals(AccessType.OUT.toString())) {
                    actAccessType = AccessType.OUT;
                }

                logWorks.add(new LogWork(actDateTime, actName, actAccessType));
            }
        } catch (FileNotFoundException e) {
            throw new LogException();
        } catch (IOException e) {
            throw new LogException();
        }
    }


    public List<String> inAtTime(LocalDateTime ldt) {
        logObjectCreator(logName);

        List<String> temp = new ArrayList<>();

        for (LogWork c : logWorks) {
            if (c.getArrival().isBefore(ldt) && c.getDirection().toString().equals("IN")) {
                temp.add(c.getName());
            }
            if (c.getArrival().isBefore(ldt) && c.getDirection().toString().equals("OUT")) {
                temp.remove(c.getName());
            }
        }
        return temp;
    }

    public List<LocalDateTime> loginsById(String personId) {
        logObjectCreator(logName);
        List<LocalDateTime> localDateTimeList = new ArrayList<>();

        for (LogWork c : logWorks) {
            if (c.getName().equals(personId) && c.getDirection().toString().equals("IN")) {
                localDateTimeList.add(c.getArrival());
            }
        }

        return localDateTimeList;
        //visszaadja a megadott személy belépéseinek időpontját.
    }

    public class LogWork {
        private LocalDateTime arrival;
        private String name;
        private AccessType direction;

        public LogWork(LocalDateTime arrival, String name, AccessType direction) {
            this.arrival = arrival;
            this.name = name;
            this.direction = direction;
        }

        public LocalDateTime getArrival() {
            return arrival;
        }

        public String getName() {
            return name;
        }

        public AccessType getDirection() {
            return direction;
        }

    }

}
