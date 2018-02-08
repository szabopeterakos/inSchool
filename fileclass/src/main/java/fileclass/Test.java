package fileclass;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        File test = new File("tesztcucc.dir");
        try {
            test.createNewFile();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(test.canWrite());
        System.out.println(test.getAbsolutePath());
        System.out.println(test.getAbsoluteFile());
        System.out.println(test.getPath());
        System.out.println(test.getParent());
        System.out.println(test.isDirectory());
        System.out.println(test.isFile());
        System.out.println(test.listFiles());
        System.out.println(test.canRead());
        System.out.println("\n");
        File tt = new File("tom");

        System.out.println(tt.getAbsolutePath());
        tt.mkdirs(); // csak akkor ha a küzbülső mappák léteznek
        System.out.println(tt.getAbsolutePath());
        System.out.println(tt.isDirectory());
        System.out.println(tt.exists());
        for (File f : tt.listFiles()) {
            System.out.println(f.getName());
        }


        File file = new File(File.separator + "D:\\JAVA_PROJECTS", "tomika.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file2 = new File("C:\\Users\\Training\\yellowroad-java-03", "fileclass");
        System.out.println(file2.getAbsolutePath());
        for (File f : file2.listFiles()) {
            System.out.println(f.getName());
        }


        // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        // File.createTempFile(String prefix, String suffix)
    }

}
