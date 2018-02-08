package stringbuilder;

public enum Title {

    PROF("Prof."), MR("Mr.");

    public String value;

    Title(String value) {

        this.value = value;
    }

    public String getValue() {
        return value;
    }



}
