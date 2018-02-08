package readerwriter;

import java.io.*;
import java.util.List;

public class DataWriter {

    public void writeBookData(List<Book> bookList, String fileName, String encoding) {
        if (encoding.trim().length() == 0) {
            throw new IllegalArgumentException("Encoding must not be empty!");
        }
        if (fileName.trim().length() == 0) {
            throw new IllegalArgumentException("File name must not be empty!");
        }
        if (!new File(fileName).exists()) {
            throw new IllegalArgumentException("File not found:");
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (Book c : bookList) {
            stringBuilder.append(c.toString() + "\n");
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), encoding))) {
            bufferedWriter.write(stringBuilder.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeBookData(List<Book> bookList, String fileName) {
        writeBookData(bookList, fileName, "UTF-8");
    }

}
