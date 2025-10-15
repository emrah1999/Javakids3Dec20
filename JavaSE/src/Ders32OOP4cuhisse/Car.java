package Ders32OOP4cuhisse;

import java.util.Objects;

public class Car implements Cloneable{
    String model;

    Integer price;

    public Car(String model, Integer price){
        this.model = model;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Car){
            Car car=(Car) obj;
            if(car.model.equals(this.model) && car.price.equals(this.price)){
                return true;
            } else {
                return false;
            }
        }else {
            return false;
        }
    }

    @Override
    public int hashCode(){
        return Objects.hash(model, price);
    }

    @Override
    public String toString(){
        return "Model: " + model + " Price: " + price;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Silindi ");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
