package niopath;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList = new ArrayList<>();

    public void loadBooksFromFile(Path path) throws IOException {
        if (path == null) {
            throw new IllegalArgumentException("Path cannot be found!");
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(path.toString()))))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                //System.out.println(line);
                String[] strArr = line.split(":");
                bookList.add(new Book(Long.parseLong(strArr[0]), strArr[1], strArr[2]));
            }
        } catch (NumberFormatException nfe) {
            throw new IOException("Non-parseable book data!");
        } catch (IndexOutOfBoundsException e) {
            throw new IOException("Wrong book data!");
        }
        //System.out.println(bookList);
    }

    public void writeBookListToFile(Path path) throws IOException {
        StringBuilder sb = new StringBuilder("");
        for (Book book : bookList) {
            sb.append(book.toString()).append("\n");
        }
        String output = sb.toString().trim();
        try (BufferedWriter br = new BufferedWriter(new FileWriter(new File(path.toString())))) {
            br.write(output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int bookListSize() {
        return bookList.size();
    }
}
