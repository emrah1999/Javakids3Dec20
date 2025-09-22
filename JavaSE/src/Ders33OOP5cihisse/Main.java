package Ders33OOP5cihisse;


public class Main {
    public static void main(String[] args) {
        Shape rectangle=new Rectangle(5,6);

        Shape triangle=new Triangle(8,9);

        Shape circle=new Circle(7);

        rectangle.getArea();
        circle.getArea();
        triangle.getArea();
    }
}
