package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class java_date_program {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));


    }
}
