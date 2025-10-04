package Ders37JavaDate1;

import java.time.LocalTime;

public class MainLocalTime {
    public static void main(String[] args) {
        LocalTime time1= LocalTime.now();
        System.out.println(time1);

        LocalTime time2=LocalTime.of(15,30,45);
        System.out.println(time2);

        LocalTime time3=LocalTime.parse("15:30:45");
        System.out.println(time3);

        LocalTime time4=time1.plusHours(5);
        System.out.println(time4);

        LocalTime time5=time1.minusMinutes(20);
        System.out.println(time5);

        System.out.println(time1.getHour());
        System.out.println(time1.getMinute());


    }
}
