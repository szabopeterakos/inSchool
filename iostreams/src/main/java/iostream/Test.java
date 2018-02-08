package iostream;

import java.io.*;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
        File f = new File("text_tample.txt").getAbsoluteFile();
        System.out.println(f);
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // bytok írás olvasás input vagy outputstream
        // szöveg reader v writer leszármazott

        try {
            BufferedReader br = new BufferedReader(new FileReader("text_tample.txt"));
            String g = br.readLine();
            br.close(); // automata flush
            System.out.println(g);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            InputStream is = new BufferedInputStream(new FileInputStream("iostreams.iml"));
            byte[] buffer = new byte[1024];
            int readLength;
            while ((readLength = is.read(buffer)) > 0) {
                //????????????
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        byte[] bb = {0, 1, 1, 0, 0, 0, 0, 0, 0, 1};
        try {
            OutputStream os = new BufferedOutputStream(new FileOutputStream("byte"));
            os.write(bb, 0, bb.length); // byte tömb, honnantól kezdjen el a tömbből írni, menyit,
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ByteArrayInputStream bai = new ByteArrayInputStream(bb);


    }


}
