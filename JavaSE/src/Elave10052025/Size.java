package Elave10052025;

public enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L");
    private  String abbreviation;
    private Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }
    public String getAbbreviation() {
        return abbreviation;
    }
}
