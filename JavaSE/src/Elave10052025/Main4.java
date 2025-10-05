package Elave10052025;

public class Main4 {
    public static void main(String[] args) {
        Coffee coffee=new Coffee("Latte",Size.MEDIUM);
        System.out.println("Coffee: "+coffee.name+", Size: "+coffee.size.getAbbreviation());
    }
}
