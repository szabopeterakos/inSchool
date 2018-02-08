package exceptions.faults;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FaultList {

    public List<String> processing(String[] lines) {
        if (lines == null) {
            throw new IllegalArgumentException("null list is not allowed");
        }

        List<String> temp = new ArrayList<>();

        for (String c : lines) {
            String[] strArr = c.split(",");
            ProcessingResult lineCode = lineProcesser(strArr);
            if (lineCode != ProcessingResult.NO_ERROR && lineCode != ProcessingResult.COMMENT) { // a vagy b tagadása nem a és nem b
                temp.add(strArr[0] + "," + lineCode.getCode());
            }
        }

        return temp;
    }

    public ProcessingResult lineProcesser(String[] arr) { // sorrend
        if (!isValidLength(arr)) {
            return ProcessingResult.WORD_COUNT_ERROR;
        }
        if (!isDoubleNum(arr[0])) {
            return ProcessingResult.COMMENT;
        }
        if (!isDoubleNum(arr[1]) && !isValidDate(arr[2])) {
            return ProcessingResult.VALUE_AND_DATE_ERROR;
        }
        if (!isDoubleNum(arr[1])) {
            return ProcessingResult.VALUE_ERROR;
        }
        if (!isValidDate(arr[2])) {
            return ProcessingResult.DATE_ERROR;
        } else {
            return ProcessingResult.NO_ERROR;
        }
    }

    public boolean isValidDate(String srt) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY.MM.DD.");
            Date d = simpleDateFormat.parse(srt);
            return true;
        } catch (ParseException pe) {
            return false;
        }
    }

    public boolean isDoubleNum(String isDouble) {

        try {
            Double temp = Double.parseDouble(isDouble);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }

    }

    public boolean isValidLength(String[] str) {
        if (str.length != 3) {
            return false;
        }
        return true;
    }


}
