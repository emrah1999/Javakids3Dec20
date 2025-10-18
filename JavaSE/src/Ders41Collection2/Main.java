package Ders41Collection2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        User user=new User();
        user.setName("JOhn");
        user.setSurname("Wick");
        try {
            user.setBirthDate(LocalDate.of(2007,5,10));
            System.out.println(user);

        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
