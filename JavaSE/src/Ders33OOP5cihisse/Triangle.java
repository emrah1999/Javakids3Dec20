package Ders33OOP5cihisse;

public class Triangle implements Shape{
    private double width;
    private double height;
    public Triangle(double width,double height){
        this.width=width;
        this.height=height;
    }


    @Override
    public void getArea() {
        System.out.println("Triangle area: "+(0.5*width*height));
    }
}
