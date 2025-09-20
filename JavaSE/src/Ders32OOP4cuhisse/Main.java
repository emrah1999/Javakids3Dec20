package Ders32OOP4cuhisse;

public class Main {
    public static void main(String[] args) {
        Person person=new Child();

        Child child=(Child) person;


        Person person1=new Teacher();
        person1.name="Mr. John";

        Person person2=new Child();
        child.name="Adil";

        School school=new School();

        school.entered(person1);
        school.entered(person2);



    }
}
