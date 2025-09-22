package Ders33OOP5cihisse;

public class Circle implements Shape{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public void getArea() {
        System.out.println("Circle Area: "+(Math.PI*radius*radius));
    }
}
