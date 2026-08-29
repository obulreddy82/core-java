package com.rajtechnolgies.java8.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeEx {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("Local Date now: "+localDate);
        System.out.println("Local Time now:"+localTime);
        System.out.println("Local Date and Time now"+localDateTime);

        // Set date and time
        LocalDate date = LocalDate.of(2020, 9,15);
        LocalTime time = LocalTime.of(12,30,30);
        LocalDateTime dateTime= LocalDateTime.of(2026,9,12,12,30,30);
        System.out.println("Date: "+date);
        System.out.println("Time: "+time);
        System.out.println("Date and Time: "+dateTime);

        //Formatting date and time
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Formatted Date: "+formatter.format(localDateTime));

        //parsing string into a date
        LocalDate parseDate= LocalDate.parse("2020-09-15");
        System.out.println("Parsed Date: "+parseDate);

        //Custom format
        LocalDate customDate= LocalDate.parse("15-09-2020",DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("Custom Date: "+customDate);

        //Comparing dates

        LocalDate date1= LocalDate.of(2020,9,15);
        LocalDate date2= LocalDate.of(2020,9,15);
        System.out.println("Date1: "+date1);
        System.out.println("Date2: "+date2);
        System.out.println("Date1 is equal to Date2: "+date1.equals(date2));
        System.out.println("Date1 is before Date2: "+date1.isBefore(date2));
        System.out.println("Date1 is after Date2: "+date1.isAfter(date2));

        //Difference between two dates — Period

        LocalDate start = LocalDate.of(2020, 1, 1);
        LocalDate end = LocalDate.of(2026, 8, 27);
        Period period = Period.between(start, end);
        System.out.println("Period between 2 dates: "+period);
        System.out.println("Period between years: "+period.getYears());
        System.out.println("Period between months: "+period.getMonths());
        System.out.println("Period between days: "+period.getDays());

        //Difference between two times — Duration
        LocalTime start1 = LocalTime.of(10, 30, 0);
        LocalTime end1 = LocalTime.of(12, 30, 0);
        Duration duration = Duration.between(start1, end1);
        System.out.println("Duration between 2 times: "+duration);
        System.out.println("Duration between hours: "+duration.toHours());
        System.out.println("Duration between minutes: "+duration.toMinutes());
        System.out.println("Duration between seconds: "+duration.getSeconds());

        //Working with time zones — ZonedDateTime
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Zoned Date Time: "+zonedDateTime);

        //India    ` Zone
        ZoneId zoneId = ZoneId.of("Asia/Kolkata");
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now(zoneId);
        System.out.println("Zoned Date Time in India: "+zonedDateTime1);

        //Instant

        //Instant represents a point on the UTC timeline. It is particularly useful for timestamps, logging, APIs, and database-related work.

        Instant now = Instant.now();
        System.out.println("Instant datetime now: "+now);
    }
}
