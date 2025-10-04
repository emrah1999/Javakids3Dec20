package Ders37JavaDate1;

import java.time.LocalDate;

public class MainLocalDate {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());


        LocalDate today= LocalDate.now();
        System.out.println(today);

        LocalDate date1=LocalDate.of(2025,9,30);
        System.out.println(date1);

        LocalDate date2=LocalDate.parse("2025-09-30");
        System.out.println(date2);

        LocalDate date3=date2.plusDays(1);
        System.out.println(date3);

        LocalDate date4=date3.plusYears(2);
        System.out.println(date4);

        LocalDate date5=date4.minusMonths(5);
        System.out.println(date5);

        System.out.println(date4.isAfter(date5));
        System.out.println(date4.isBefore(date5));
        System.out.println(date2.plusYears(3).isLeapYear());

        System.out.println(today.getEra());
        System.out.println(today.getMonth());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getMonthValue());
    }
}
