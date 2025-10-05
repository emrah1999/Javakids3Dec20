package Elave10052025;

public class ChildClass extends ParentClass{
    Integer age;
    public ChildClass(Integer age,String name) {
        super(name);
        this.age = age;
    }
    @Override
    public void displayMessage() {
        super.displayMessage();
        System.out.println(age);
        System.out.println("This is the Child Class method.");
    }
}
