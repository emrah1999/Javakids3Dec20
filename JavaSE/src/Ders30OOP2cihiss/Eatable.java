package Ders30OOP2cihiss;

public interface Eatable {
    void eat();

    private void privateMethod(){
        System.out.println("Private method in interface");
    }

    public static  void metod3(){
        System.out.println("Static method in interface");
    }
}
