package Elave10052025;

public class Main3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Before continue: "+i);
            if(i==5){
                continue;
            }
            System.out.println("After continue: "+i);
        }

        int a=5;
        do{
            System.out.println(a);
            a++;
        }while (a<5);
        System.out.println("ikinici while bashlayir");
        while (a<5){
            System.out.println(a);
            a++;
        };
    }
}
