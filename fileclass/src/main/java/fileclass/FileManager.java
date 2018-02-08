package fileclass;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    public File createFile(String fileName) throws IOException {
        File temp = new File(fileName);

        if (temp.exists()) {
            throw new IllegalArgumentException("File with this name already exists");
        }

        temp.createNewFile();

        return temp;
    }

    public File createSubDirectory(String pathName, String directory) {
        File temp = new File(pathName, directory);

        if (temp.exists()) {
            throw new IllegalArgumentException("Directory with this name already exists");
        }

        temp.mkdir();
        return temp;
    }

    public boolean deleteFile(String fileName) {
        File temp = new File(fileName);

        if (!temp.exists()) {
            throw new IllegalArgumentException("File with this name does not exists");
        }

        return temp.delete();
    }

    public List<String> findDirectories(String rootDir, List<String> directories) {
        File root = new File(rootDir);

        if (!root.isDirectory()) {
            throw new IllegalArgumentException("This file is not a directory" + rootDir);
        }

        for (File file : root.listFiles()) {
            if (file.isDirectory()) {
                directories.add(file.getName());
                if (file.isDirectory()) {
                    root = file;
                    findDirectories(root.toString(), directories); //nice first elegant recursion
                }
            }
        }

        return directories;
    }

    public List<String> listFilesByExtension(String directory, String extension) {
        File myDirectory = new File(directory);
        List<String> temp = new ArrayList<>();

        if (!myDirectory.isDirectory()) {
            throw new IllegalArgumentException("This file is not a directory" + myDirectory);
        }

        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File file, String extension) {
                String fileString = file.toString();
                int index = fileString.lastIndexOf(".");
                return fileString.substring(index + 1).equals(extension);
            }

        };

        for (File c : myDirectory.listFiles()) {
            if (filter.accept(c, extension)) {
                temp.add(c.getName());
            }

        }

        if (temp.size() == 0){
            throw new NullPointerException("No files found with extension");
        }

        return temp;
    }
}
