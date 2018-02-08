package gereicsclass;

public class DataPair<XX> { // ketrec amibe bele lehet tenni T tipusu példányt

    private XX[] datapair; // tetszőleges

    public DataPair(XX[] datapair) {
        this.datapair = datapair;
    }

    public XX getFirstObject() {
        return datapair[0];
    }

    public XX getSecondObject() {
        return datapair[datapair.length-1];
    }

}
