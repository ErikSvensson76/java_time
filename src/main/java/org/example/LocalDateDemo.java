package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class LocalDateDemo
{
    public static void main( String[] args )
    {
        LocalDate today = LocalDate.now();
        LocalDate _20YearsAgo = today.minus(Period.ofYears(20));
        System.out.println(_20YearsAgo.getDayOfWeek());

        LocalDate chistmasEve = LocalDate.of(2020, 12,24);

        LocalDate fromString = LocalDate.parse("2021-03-25");
        //System.out.println(fromString);

        LocalDate firstDay = LocalDate.ofYearDay(2021, 1);
        LocalDate secondDay = firstDay.plusDays(1);

        //getCalendarOf(2021).forEach(System.out::println);

        Period period = daysToChristmas(LocalDate.now());
        System.out.println(period.getYears() + " years, " + period.getMonths() + " months and " + period.getDays() + " days");
    }

    public static List<LocalDate> getCalendarOf(int year){
        List<LocalDate> yearDays = new ArrayList<>();
        LocalDate firstDay = LocalDate.ofYearDay(year, 1);
        LocalDate endDay = LocalDate.ofYearDay(year+1, 1);

        for(LocalDate date = firstDay; date.isBefore(endDay) ; date = date.plusDays(1)){
            yearDays.add(date);
        }
        return yearDays;
    }

    public static Period daysToChristmas(LocalDate today){
        LocalDate christmas = LocalDate.of(
                today.getYear(),
                12,
                24
        );

        return Period.between(today, christmas);
    }


}
