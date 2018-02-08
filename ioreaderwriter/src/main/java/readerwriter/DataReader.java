package readerwriter;

import javafx.scene.control.Separator;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    private List<Book> bookList = new ArrayList<>();
    public static final String CHARSET_UTF8 = "UTF-8";

    public List<Book> readBookData(String fileName, String encoding) {
        if (encoding.trim().length() == 0) {
            throw new IllegalArgumentException("Encoding must not be empty!");
        }
        if (fileName.trim().length() == 0) {
            throw new IllegalArgumentException("File name must not be empty!");
        }
        if (!new File(fileName).exists()) {
            throw new IllegalArgumentException("File not found:");
        }


        bookList.clear();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), encoding));
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(":");
                bookList.add(new Book(Long.parseLong(temp[0]), temp[1], temp[2]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return bookList;
    }

    public List<Book> readBookData(String fileName) {
        return readBookData(fileName, "UTF-8");
    }

}
