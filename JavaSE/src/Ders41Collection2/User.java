package Ders41Collection2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class User {
    String name;
    String surname;
    LocalDate birthDate;

    @Override
    public String toString(){
        return "Name: "+name+" Surname: "+surname+" BirthDate: "+birthDate;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        LocalDate today = LocalDate.now();
        long ferq=  ChronoUnit.YEARS.between(birthDate, today);
        if(ferq<18){
            throw new AgeException("Yashiniz 18den balacadir");
        }
        this.birthDate = birthDate;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
