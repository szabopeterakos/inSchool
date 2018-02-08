package niofiles;

import java.io.*;
import java.nio.file.*;

public class FileManager {

    public File createFile(String filePath, String fileName) throws IOException {
        if (isEmpty(filePath)) {
            throw new IllegalArgumentException("Path must not be empty!");
        }

        Path path = Paths.get(filePath + File.separator + fileName);
        Files.createFile(path);

        return path.toFile();
    }

    public Path createSubDirectory(String pathName, String nameOfDirectory) throws IOException {
        if (isEmpty(pathName)) {
            throw new IllegalArgumentException("Path or directory name must not be empty!");
        }

        Path path = Paths.get(pathName + File.separator + nameOfDirectory);
        Files.createDirectory(path);

        return path;
    }

    public void copyFile(String source, String target, CopyOption option) throws IOException {
        if (isEmpty(source)) {
            throw new IllegalArgumentException("Source name must not be empty!");
        }

        Files.copy(Paths.get(source), Paths.get(target), option);
    }

    public void copyFile(InputStream source, String targetPath, String targetFileName) throws IOException {
        if (source == null) {
            throw new NullPointerException("Source must not be null!");
        }

        Path target = Paths.get(targetPath + File.separator + targetFileName);
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }

    public void moveFile(String source, String target) throws IOException {
        if (isEmpty(source)) {
            throw new IllegalArgumentException("Source name must not be empty!");
        }

        Files.move(Paths.get(source), Paths.get(target));
    }

    private boolean isEmpty(String str) {
        return (str == null | str.trim().length() == 0);
    }


    public static void main(String[] args) {
        try {
            File f1 = new File("tamara");
            f1.createNewFile();

            System.out.println(Files.size(new File("pom.xml").toPath()));
            System.out.println(Files.size(new File("size.txt").toPath())); // szóközt is számol új sor kettőt ér :)
            System.out.println(Files.exists(f1.toPath()));
            System.out.println(Files.isRegularFile(f1.toPath()));

            Files.createDirectories(new File("aaa/bbb/ccc/ddd").toPath());
            File fifi = new File("aaa/tomi.txt");
            BufferedWriter br = new BufferedWriter(new FileWriter(fifi));
            br.write("majomcsapda");
            br.close();

            fifi.createNewFile();
            File fifi2 = new File("aaa/tomi2.txt");
            BufferedWriter br2 = new BufferedWriter(new FileWriter(fifi2));
            br2.write("majomcsapda");
            br2.close();
            fifi2.createNewFile();
            Files.move(fifi.toPath(),new File("aaa/bbb/mimi.txt").toPath());

            System.out.println();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
