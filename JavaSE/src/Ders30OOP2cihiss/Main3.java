package Ders30OOP2cihiss;

public class Main3 {
    public static void main(String[] args) {
        User user =new User();
        user.name="John";
        user.email="jong@mail.ri";
//        user.address=new Address();
//        user.address.street="123 Main St";
//        user.address.city="new York";

        Address address=new Address();
        address.street="123 Main St";
        address.city="new York";
        user.address=address;
    }
}
