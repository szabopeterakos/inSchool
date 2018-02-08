package exceptionmulticatch.converter;

public class AnswerStat {

    private BinaryStringConverter bsc;

    public AnswerStat(BinaryStringConverter bsc) {
        this.bsc = bsc;
    }

    public boolean[] convert(String str) {
        try {
            return bsc.binaryStringToBooleanArray(str);
        } catch (NullPointerException | IllegalArgumentException ee) {
            throw new InvalidBinaryStringException("The String is invalid", ee);
        }
//        try {
//            return bsc.binaryStringToBooleanArray(str);
//        } catch (NullPointerException npe) {
//            throw new InvalidBinaryStringException("The String is invalid", npe);
//        } catch (IllegalArgumentException iae) {
//            throw new InvalidBinaryStringException("The String is invalid", iae);
//        }
    }

    public int answerTruePercent(String str) {
        boolean[] arr = bsc.binaryStringToBooleanArray(str);
        int trueCounter = 0;

        for (boolean c: arr) {
            if (c == true) {
                trueCounter++;
            }
        }
        double actPercent = (double) trueCounter / arr.length * 100;

        return (int) actPercent;
    }


}
