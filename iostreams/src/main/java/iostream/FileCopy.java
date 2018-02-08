package iostream;

import java.io.*;

public class FileCopy {

    public void copyFile(String source, String target) {
        if (isEmpty(source) || isEmpty(target)) {
            throw new IllegalArgumentException("Source or target file name must not be empty");
        }
        if (!new File(source).exists()) {
            throw new IllegalArgumentException("Source file cannot be found!");
        }

        byte[] buffer = new byte[1024];

        try (
                InputStream in = new BufferedInputStream(new FileInputStream(source));
                OutputStream out = new BufferedOutputStream(new FileOutputStream(target))
        ) {

            int actualLength;
            while ((actualLength = in.read(buffer)) > 0) {
                out.write(buffer, 0, actualLength);
                out.flush();
            }

            System.out.println(new BufferedReader(new FileReader(target)).readLine());

        } catch (
                IOException ioe) {
            ioe.printStackTrace();
        }
    }


    public void copyFile(File source, File target) {
        if (!source.exists()) {
            throw new IllegalArgumentException("Source file cannot be found!");
        }

        byte[] buffer = new byte[1024];

        try (
                InputStream in = new BufferedInputStream(new FileInputStream(source)); // BufferedInputStream csak a byte-onként miatt
                OutputStream out = new BufferedOutputStream(new FileOutputStream(target))
        ) {
            int actualLength;
            while ((actualLength = in.read(buffer)) > 0) {
                out.write(buffer, 0, actualLength);
                out.flush();
            }

            System.out.println(new BufferedReader(new FileReader(target)).readLine());

        } catch (
                IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private boolean isEmpty(String str) {
        if (str == null || str.trim().isEmpty()) {
            return true;
        }
        return false;
    }

}
