package Elave10052025;

public enum WeekDays {
    MONDAY("Bazar ertesi"),
    TUESDAY("Cersebne axshami"),
    WEDNESDAY("3cu ghun"),
    THURSDAY("Cume axshami"),
    FRIDAY("Cume"),
    SATURDAY("Shenbe"),
    SUNDAY("Bazar");
    private String dayName;
    private WeekDays(String dayName) {
        this.dayName = dayName;
    }
    public String getDayName() {
        return dayName;
    }
}
