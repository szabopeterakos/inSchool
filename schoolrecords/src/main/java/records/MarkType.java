package records;

public enum MarkType {

    A(5, "excellent"),
    B(4, "very good"),
    C(3, "improvement needed"),
    D(2, "close fail"),
    F(1, "fail");

    private int markAsNumber;
    private String markAsString;

    MarkType(int markAsNumber, String markAsString) {
        this.markAsNumber = markAsNumber;
        this.markAsString = markAsString;
    }

    public int getMarkAsNumber() {
        return markAsNumber;
    }

    public String getMarkAsString() {
        return markAsString;
    }
}
