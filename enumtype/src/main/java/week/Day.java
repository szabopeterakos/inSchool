package week;

public enum Day {

    MONDAY(DayType.WORKDAY),
    TUESDAY(DayType.WORKDAY),
    WEDNESDAY(DayType.WORKDAY),
    THURSDAY(DayType.WORKDAY),
    FRIDAY(DayType.WORKDAY),
    SATURDAY(DayType.HOLIDAY),
    SUNDAY(DayType.HOLIDAY);

    private final DayType typeOfTheDay;

    Day(DayType typeOfTheDay) {
        this.typeOfTheDay = typeOfTheDay;
    }

    public DayType getTypeOfTheDay() {
        return typeOfTheDay;
    }
}
