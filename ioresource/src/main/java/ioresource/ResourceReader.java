package ioresource;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ResourceReader {

    public List<Book> readResource(String resource) {
        return readBookData(ClassLoader.getSystemResourceAsStream(resource));
    }

    public List<Book> readBookData(InputStream inputStream) {
        if (inputStream == null) {
            throw new DataException("Resource cannot be found!");
        }

        String line;
        List<Book> books = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            while ((line = br.readLine()) != null) {
                String[] bookData = line.split( ":");
                books.add(new Book(Integer.parseInt(bookData[0]), bookData[1], bookData[2]));
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new DataException("Data corrupted at:");
        } catch (Exception e) {
            throw new DataException("Data cannot be read or data corrupted at line:");
        }
        return books;
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(ClassLoader.getSystemResourceAsStream("texter.tcx")));
        try {
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
