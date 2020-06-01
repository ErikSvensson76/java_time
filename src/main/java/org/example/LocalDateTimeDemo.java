package org.example;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {

    public static void main(String[] args) {
        LocalDateTime timestamp = LocalDateTime.now();
        System.out.println(timestamp);

        LocalDateTime nextLecture = LocalDateTime.of(2020,6,2,9,0);

        LocalDateTime endOfWorkWeek = LocalDateTime.parse("2020-06-05T17:00");
        System.out.println(endOfWorkWeek);
        LocalDateTime unknown = endOfWorkWeek.plusMinutes(2000);
        System.out.println(unknown);
    }

}
