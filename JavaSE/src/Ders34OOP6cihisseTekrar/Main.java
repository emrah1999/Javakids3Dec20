package Ders34OOP6cihisseTekrar;

public class Main {
    public static void main(String[] args) {
        Student student=new Student("Ali",20);
        Student.Address address=student.new Address("Istanbul","Kadikoy");
        student.printInfo();
        System.out.println(address.fullAddress());
    }
}
