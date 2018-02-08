package iostream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StreamReadWrite {

    public String readUtfInput(String fileName, String charset) {
        if ((isEmpty(fileName)) || !new File(fileName).exists()) {
            throw new IllegalArgumentException("File with given name cannot be found:");
        }

        if (isEmpty(charset)) {
            throw new IllegalArgumentException("This character set is not valid" + charset);
        }

        String line = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), charset));//ctrl-p parameters
            line = br.readLine();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }

    public void writeDataToOutputStream(double[] data, String fileName) {
        try {
            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(fileName));
            for (double c : data) {
                outputStream.writeDouble(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Double> readDataFromInputStream(String fileName) {
        List<Double> temp = new ArrayList<>();
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(fileName));

            while (dataInputStream.available() > 0) {
                temp.add(dataInputStream.readDouble());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return temp;
    }

    private boolean isEmpty(String str) {
        if (str == null || str.trim().length() == 0) {
            return true;
        }
        return false;
    }
}
