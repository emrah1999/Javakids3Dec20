package Elave10052025;

public class ClassEx {
    // tam eded tipleri: byte,short,int,long,
    // kesr eded tipleri: float,double,
    // simvol tipi: char ,
    // mentiqi tip(true,false): boolean
    int b=5; // Integer
    byte a=10; // Byte
    short c=15; // Short
    long d=20L; // Long

    float e=5.5f;   // Float
    double v=10.5D; // Double

    char m='A'; //Character

    boolean n=true; // Boolean
    String name;
    User user;


    class InnerClass{
        int a;
        String name;
    }
    public ClassEx(){

    }
    protected ClassEx(int a){

    }
    int metod1(){
        return 3;
    }
    int metod1(int a){
        return 3;
    }
    int metod1(float b){
        return 3;
    }
    public int metod1( String d){
        return 3;
    }
    public void metod2(int a){
        if(a<0){
            return;
        }
        System.out.println(a);
    }

    User metod3(){
        User user=new User();
        user.setName("Ali");
        user.setAge(25);
        return user;
    }



}
