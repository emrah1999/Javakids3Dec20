package Ders40Collections1;

public class Class2 <T,V>{
    T a;

    V b;

    V name;

    V surname;

    public Class2(){

    }

    public Class2(T a, V b){
        this.a=a;
        this.b=b;
    }
    public void setA(T a){
        this.a=a;
    }
    public T getA(){
        return a;
    }
}
