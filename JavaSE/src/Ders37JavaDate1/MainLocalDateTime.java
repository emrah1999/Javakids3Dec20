package Ders37JavaDate1;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class MainLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime date1= LocalDateTime.now();
        System.out.println(date1);

        LocalDateTime date2=LocalDateTime.of(2025,9,30,15,25,14);
        System.out.println(date2);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        System.out.println(date2.format(formatter));


        ZonedDateTime zonedDateTime=ZonedDateTime.now();
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime.getZone());


        System.out.println(Math.abs(ChronoUnit.DAYS.between(date1,date2)));
    }
}
