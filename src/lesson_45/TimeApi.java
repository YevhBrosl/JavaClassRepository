package lesson_45;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class TimeApi {
    public static void main(String[] args) {
        /*
        LocalDate
        LocalTime
        LocalDateTime
        ZonedDateTime
        Duration
        Period
         */

        //LocalDate - presents a date (year, month, day)

        LocalDate date = LocalDate.now(); // returns current date
        System.out.println("now: " + date);
        LocalDate tomorrow = date.plusDays(1);// adds x days to current date
        System.out.println(tomorrow);

        System.out.println("plusWeeks (2): " + date.plusWeeks(2));// adds x weeks to current date
        System.out.println("plusMonths (12): " + date.plusMonths(12));// adds x months to current date

        System.out.println("yesterday: " + date.minusDays(1));// subtracts x days (weeks, months, years) from current date

        // Get an object matching a specific date
        LocalDate date1 = LocalDate.of(2002, 2, 11);
        date1 = LocalDate.of(2002, Month.FEBRUARY, 11);
        System.out.println("date1: " + date1);

        System.out.println("year: " + date1.getYear() + "; month: " + date1.getMonth() + "; day: " + date1.getDayOfMonth());
        System.out.println("day of week: " + date1.getDayOfWeek() + "; day of year: " + date1.getDayOfYear() + "; month number: " + date1.getMonthValue());
        System.out.println("date1.lengthOfMonth(): " + date1.lengthOfMonth());

        // LocalTime - presents time (hours, minutes, seconds, nanoseconds)

        LocalTime time = LocalTime.now(); // current time
        System.out.println("now: " + time);

        time = LocalTime.of(21, 33, 55);
        time = LocalTime.of(21, 33, 55, 1534362);
        System.out.println(time);

        System.out.println("time.plusHours(1): " + time.plusHours(1)); // adds x hours to current time
        System.out.println("time.plusMinutes(65): " + time.plusMinutes(65)); // adds x minutes to current time
        System.out.println("time.minusSeconds(30): " + time.minusSeconds(30)); // subtracts x seconds (minutes, hours, nanoseconds) from current time

        System.out.println("o'clock: " + time.getHour() + "; minutes: " + time.getMinute() + "; seconds: " + time.getSecond() + "; nano: " + time.getNano());

        String timeString = "12:13:45";
        LocalTime parseTime = LocalTime.parse(timeString);
        System.out.println(parseTime.getHour() + " | " + parseTime.getMinute());
        // expects the string format ISO-8601 ("2001-01-15T08:15:45+01:00")
        String isoString = "2001-01-15T08:15:45+01:00";
        isoString = "18:34:42";

        isoString = "2001-01-02T10:15:45";
        LocalDateTime dateTime = LocalDateTime.parse(isoString);
        System.out.println("parse LDT: " + dateTime);

        isoString = "18:34:42";
        LocalTime parse = LocalTime.parse(isoString);
        System.out.println(parse);

        System.out.println("\n========LocalDateTime============\n");

        //LocalDateTime - presents date and time without account of time zone

        LocalDateTime localDateTime = LocalDateTime.now(); // current date and time
        System.out.println("LocalDateTime: " + localDateTime);

        LocalDate localdate = LocalDate.of(2023, Month.MARCH, 8);
        LocalTime localTime = LocalTime.of(15,31,25);

        LocalDateTime dateTime5 = LocalDateTime.of(localdate, localTime);
        System.out.println("dateTime: " + dateTime);

        System.out.println("dateTime.getDayOfWeek(): " + dateTime.getDayOfWeek());
        System.out.println("dateTime.getDayOfWeek().getValue(): " + dateTime.getDayOfWeek().getValue());

        dateTime = LocalDateTime.now();
        System.out.println(dateTime.plusDays(15));
        System.out.println(dateTime.minusMinutes(30));

        System.out.println("\n========ZonedDateTime============\n");

        //ZonedDateTime - presents date and time with the account of time zone

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime: " + zonedDateTime);
        System.out.println("zonedDateTime.getZone(): " + zonedDateTime.getZone());

        String isoStringZoned = "2001-01-15T08:15:45+01:00";
        ZonedDateTime zonedDateTime1 = ZonedDateTime.parse(isoStringZoned);
        System.out.println("zonedDateTime1: " + zonedDateTime1 + " | " + zonedDateTime1.getDayOfYear());

        System.out.println("getOffset().getTotalSeconds(): " + zonedDateTime1.getOffset().getTotalSeconds());

        System.out.println("\n================== isAfter, isBefore, until ===================\n");

        // isAfter, isBefore, until, equals - all objects representing date and / or time have these methods

        // isAfter - checks that the current object isAfter the specified object
        LocalDate date2 = LocalDate.of(2020, 10,15);
        LocalDate date3 = LocalDate.of(2020, 6,25);

        System.out.println("date2.isAfter(date3): " + date2.isAfter(date3));

        // isBefore - checks that the current object isBefore the specified object
        System.out.println(date2.isBefore(date3));

        //equals - checks if dates and / or times are equal
        System.out.println("date2.equals(date2): " + date2.equals(date2));

        // until - measures difference between current and specified date/time object. Returns long
        long daysBetween = date3.until(date2, ChronoUnit.DAYS);
        System.out.println("daysBetween: " + daysBetween);

        long yearsBetween = date3.until(date2, ChronoUnit.YEARS);
        System.out.println("yearsBetween: " + yearsBetween);

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime dateTime1 = LocalDateTime.of(2022, 11, 15, 15, 30);

        long hours = now.until(dateTime1, ChronoUnit.HOURS);
        System.out.println("hours: " + hours);

        long hoursBetween = ChronoUnit.HOURS.between(now, dateTime1);
        System.out.println("hoursBetween: " + hoursBetween);

        System.out.println("\n================== Duration ===================\n");

        // Duration - represents duration in seconds or nanoseconds

        System.out.println(System.currentTimeMillis());
        Instant start = Instant.now();
        System.out.println(start.toEpochMilli());

        for (int i = 0; i < 100000; i++) {

        }
        Instant end = Instant.now();

        Duration duration = Duration.between(start, end);
        System.out.println(duration.toSeconds());
        System.out.println(duration.toMillis());
        System.out.println(duration.toDays());

        System.out.println("\n================== Period ===================\n");

        // Period - represents a period in years, months and days

        LocalDate now2 = LocalDate.now();
        LocalDate dateTime2 = LocalDate.of(2022, 11, 15);

        Period period = Period.between(now2, dateTime2);
        System.out.println(period);

        System.out.println(period.getYears() + " | " + period.getMonths() + " | " + period.getDays());
        System.out.println("period.toTotalMonths(): " + period.toTotalMonths());

        System.out.println("\n================== DateTimeFormatter ===================\n");

        // DateTimeFormatter - formats date and time

        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println(localDateTime1);

        // 24-date-month
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy|dd|MM HH:mm:ss a");

        String formattedDate = localDateTime1.format(formatter);
        System.out.println(formattedDate);

        String dateForParseString = "2024|19|03 20:37:27";
        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("yyyy|dd|MM HH:mm:ss");

        LocalDateTime parseDateTime = LocalDateTime.parse(dateForParseString, formatterDate);

        System.out.println(parseDateTime + " - " + parseDateTime.getYear());

        /*
        y - year
        M - month
        d - day
        H - hour in 0 - 23 format
        h - hour in 0 - 12 format, a flag - displays AM/PM
        m - minutes
        s - seconds
         */

        /*
        The number of symbols specified in formatter determines the (year/month) display format

        yy - 2-symbol year, i.e. 24 for year 2024
        yyyy - y-symbol
        M - month: 3
        MM - month: 03
        d - 1-symbol day: 9
        dd - 2-symbol day: 09
         */

        /*
        "15-12-2022 20-46"
        parse LocalDateTime
        print + print month, day, hour

        "13-01-2023 00-47"
        day of week matching the second date
        days between
         */

        String dateString1 = "15-12-2022 20-46";
        String dateString2 = "13-01-2023 00-47";

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
        LocalDateTime dateFromString1 = LocalDateTime.parse(dateString1, formatter1);
        LocalDateTime dateFromString2 = LocalDateTime.parse(dateString2, formatter1);

        System.out.println(dateFromString1);
        System.out.println(dateFromString1.getYear());
        System.out.println(dateFromString1.getMonth());
        System.out.println(dateFromString1.getHour());

        System.out.println(dateFromString2.getDayOfWeek());
        System.out.println(dateFromString1.until(dateFromString2, ChronoUnit.DAYS));
















    }
}
