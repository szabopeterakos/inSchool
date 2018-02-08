package exceptionresource.readLine;

import exceptionresource.accesscontrol.AccessType;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reader01 {

    public List<LogCucc> logCuccs = new ArrayList<>();

    public List<LogCucc> getLogCuccs() {
        return logCuccs;
    }

    public void logCuccCreator(String fileFullName) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("tester.txt"));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] arguments = line.split(",");
                //System.out.println(arguments.length);
                //System.out.println(arguments[0]);

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd. HH:mm:ss");
                LocalDateTime time = LocalDateTime.parse(arguments[0], formatter);

                String id = arguments[1];

                AccessType actAccessType = null;
                if (arguments[2].equals(AccessType.IN.toString())) {
                    actAccessType = AccessType.IN;
                }
                if (arguments[2].equals(AccessType.OUT.toString())) {
                    actAccessType = AccessType.OUT;
                }

                logCuccs.add(new LogCucc(time, id, actAccessType));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Reader01 reader01 = new Reader01();
        reader01.logCuccCreator("tester.txt");
        System.out.println(reader01.getLogCuccs());
    }

}
