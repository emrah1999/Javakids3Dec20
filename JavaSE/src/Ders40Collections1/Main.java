package Ders40Collections1;

public class Main {
    public static void main(String[] args) {
        SimpleClass simpleClass=new SimpleClass();
        simpleClass.a=5;

        GenericsClass<Integer> genericsClass=new GenericsClass<>();
        genericsClass.a=10;

        GenericsClass<String> genericsClass2=new GenericsClass<>();
        genericsClass2.a="Hello";

        GenericsClass<Double> genericsClass3=new GenericsClass<>();
        genericsClass3.a=3.14;

        GenericsClass<SimpleClass> simpleClassGenericsClass=new GenericsClass<>();
        simpleClassGenericsClass.a=new SimpleClass();


        Class2<Integer,String> class2=new Class2<>();
        class2.a=5;
        class2.b="World";

        Class2<Double,Double> class21=new Class2<>();

        class21.a=2.5;
        class21.b=3.5;
    }
}
