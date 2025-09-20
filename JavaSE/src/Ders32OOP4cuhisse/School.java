package Ders32OOP4cuhisse;

public class School {
    public void entered(Person person){
        if(person instanceof Teacher){
            System.out.println(person.name+" entered");
        }else{
            System.out.println(" girish qadagandir");
        }
    }
}
