package Ders29TekrarOOP;

public class Person {
    private String name;
    private String surname;
    String id;
    public Person(){
        System.out.println("Person contrutoru");
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public String getSurname(){
        return this.surname;
    }
}
