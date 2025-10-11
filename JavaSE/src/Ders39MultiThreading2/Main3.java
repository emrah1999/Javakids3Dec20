package Ders39MultiThreading2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main3 {
    public static void main(String[] args) {
        LocalTime time1 = LocalTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Format time "+time1.format(formatter));
    }
}
