package Ders33OOP5cihisse;

public class Main2 {
    public static void main(String[] args) {
        Runnable r=new Runnable() {
            public int a;
            @Override
            public void run(int a) {
                this.a=a;
                System.out.println("Run methodu calisti "+a+" addim atildi");
            }
        };
        r.run(5);

        Runnable runnable=new Runnable() {
            @Override
            public void run(int a) {
                System.out.println("Run methodu calisti "+a+" addim atildi");
                this.test();
            }

            public void test() {
                System.out.println("Test methodu calisti");
            }
        };

        runnable.run(10);

    }

}
