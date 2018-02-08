package stringconcat;

public enum Title {
    MR("Mr."), MRS("Mrs."), MS("Ms."), DR("Dr.");

    public String STRING;

    Title(String STRING) {
        this.STRING = STRING;
    }

    public String getSTRING() {
        return STRING;
    }
}
