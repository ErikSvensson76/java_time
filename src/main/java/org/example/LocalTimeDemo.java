package org.example;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeDemo {

    public static void main(String[] args) {
        LocalTime current = LocalTime.now();
        System.out.println(current);
        System.out.println(current.truncatedTo(ChronoUnit.SECONDS));
        System.out.println(current.truncatedTo(ChronoUnit.MINUTES));

        LocalTime noon = LocalTime.NOON;
        System.out.println(noon.plusHours(12));


        LocalTime _13_39 = noon.plusHours(1).plusMinutes(39);
        System.out.println(_13_39);

        System.out.println(current.plus(3, ChronoUnit.HOURS));

        LocalTime now = LocalTime.of(11, 9);
        LocalTime endOfDay = LocalTime.MAX;

        Duration duration = Duration.between(now, endOfDay);

        System.out.println(duration.getSeconds());
        System.out.println(duration.getSeconds() / 3600);


    }

}
