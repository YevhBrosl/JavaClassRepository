package homework_45;

//Написать метод, принимающий список из нескольких дат типа LocalDate
//и возвращающий количество дней между самой ранней и поздней датами в этом списке

import homework_42.Transaction;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Task2 {
    public static void main(String[] args) {

        List<LocalDate> dates = new ArrayList<>(List.of(
                LocalDate.of(2002, 12, 4),
                LocalDate.of(1983, 4, 27),
                LocalDate.of(2012, 10, 12),
                LocalDate.of(2020, 6, 8),
                LocalDate.of(2004, 9, 30),
                LocalDate.of(1983, 2, 19),
                LocalDate.of(1994, 11, 7),
                LocalDate.of(2020, 6, 7)
        ));

        System.out.println(daysBetween(dates));

    }


    private static long daysBetween(List<LocalDate> dates) {
        LocalDate minDate = dates.stream()
                .min(LocalDate::compareTo)
                .get();

        System.out.println("minDate: " + minDate);

        LocalDate maxDate = dates.stream()
                .max(LocalDate::compareTo)
                .get();

        System.out.println("maxDate: " + maxDate);

        long daysBetween = minDate.until(maxDate, ChronoUnit.DAYS);

        return daysBetween;
    }
}
