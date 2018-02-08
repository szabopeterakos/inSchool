package exceptionresource.trainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PrimitiveIterator;

public class TrainerReader {

    public static final String SEPARATOR = ";";
    private String values;

    public TrainerReader(String values) {
        this.values = values;
    }

    public List<Trainer> read() {
        List<Trainer> trainers = new ArrayList<>();
        String line;
        try (BufferedReader bufferedReader = new BufferedReader(new StringReader(values))) {
            while ((line = bufferedReader.readLine()) != null) {
                Trainer trainer = parseLine(line);
                trainers.add(trainer);
            }
        } catch (IOException | IllegalArgumentException io) {
            throw new IllegalStateException("parsing error", io);
        }
        return trainers;
    }

    private Trainer parseLine(String line) {
        String[] fields = line.split(SEPARATOR);
        if (fields.length != 2) {
            throw new IllegalArgumentException("invalid line : " + line);
        }
        if (fields[0].trim().isEmpty()) {
            throw new IllegalArgumentException("empty name : " + line);
        }

        return new Trainer(fields[0], Integer.parseInt(fields[1]));
    }
}
