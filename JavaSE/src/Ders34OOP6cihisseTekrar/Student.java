package Ders34OOP6cihisseTekrar;

public class Student {
    String name;
    int age;
    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }
    public class Address{
        String city;
        String street;

        public String fullAddress(){
            return this.city+" "+this.street;
        }
        public Address(String city, String street){
            this.city=city;
            this.street=street;
        }
    }
    public void printInfo(){
        System.out.println("Name: "+this.name+" Age: "+this.age);
    }

}
