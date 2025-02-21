package com.podoseee.section04.date_calendar_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Application4 {
    public static void main(String[] args) {
        /*
            ## java.time.LocalDate|LocalTime|LocalDateTime ##
         */

        LocalDate date1 = LocalDate.now();
        System.out.println(date1);

        System.out.println(date1.getYear());
        System.out.println(date1.getMonth());
        System.out.println(date1.getMonthValue());
        System.out.println(date1.getDayOfMonth());

        LocalDate date2 = LocalDate.of(2024, 6, 11);
        System.out.println(date2);

        System.out.println("==============");

        LocalTime time1 = LocalTime.now();
        System.out.println(time1);
        System.out.println(time1.toString().substring(0, 8));

        // getHour(), getMinute(), getSecond(), getNano()

        LocalTime time2 = LocalTime.of(13, 30, 20);
        System.out.println(time2);

        System.out.println("=============");

        LocalDateTime dateTime1 = LocalDateTime.now();
        System.out.println(dateTime1); // 년-월-일T시:분:초.나노초
        System.out.println(dateTime1.toString().replace("T", " "));

        LocalDateTime dateTime2 = LocalDateTime.of(2024, 6, 11, 13, 0, 15);
        System.out.println(dateTime2);


        
    }
}
