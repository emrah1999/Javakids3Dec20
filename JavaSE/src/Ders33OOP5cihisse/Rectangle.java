package Ders33OOP5cihisse;

public class Rectangle implements Shape{
    private double width;
    private double height;
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    @Override
    public void getArea() {
        System.out.println("rectangle area: "+(width*height));
    }
}
