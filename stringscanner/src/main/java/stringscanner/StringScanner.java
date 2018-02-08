package stringscanner;

import sun.applet.AppletIllegalArgumentException;

import java.util.Scanner;

public class StringScanner {

    public int readAndSumValues(String intString, String delimiter) {
        Scanner sc = new Scanner(intString).useDelimiter(delimiter);
        int sum = 0;
        while (sc.hasNext()) { // fusson mig van next
            if (!sc.hasNextInt() && sc.hasNext()) {
                throw new AppletIllegalArgumentException("Incorrect");
            }
            sum += sc.nextInt();
        }
        return sum;
    }

    public int readAndSumValues(String intString) {
        Scanner sc = new Scanner(intString);
        int sum = 0;
        while (sc.hasNext()) {
            if (!sc.hasNextInt() && sc.hasNext()) {
                throw new AppletIllegalArgumentException("Incorrect");
            }
            sum += sc.nextInt();
        }
        return sum;
    }

    public String filterLinesWithWordOccurrences(String text, String word) {
        Scanner sc = new Scanner(text);
        StringBuilder temp = new StringBuilder("");
        while (sc.hasNextLine()) {

            String currentLine = sc.nextLine();
            if (currentLine.contains(word) && sc.hasNextLine()) {
                temp.append(currentLine);
                temp.append("\n");
            } else if (currentLine.contains(word)) {
                temp.append(currentLine);
            }

        }
        return temp.toString();
    }

}
