package homework_45;

//Получить и вывести на экран:
//текущую дату
//        текущий год, месяц и день
//        Создать дату, например Ваш день рождения и вывести на экран
//Создать две даты и проверить на равенство
//Получить и вывести на экран:
//текущее время
//текущее время + 3 часа
//Создать дату:
//которая на неделю позже сегодняшней
//которая была на год раньше сегодняшней используя метод minus
//которая на год позже сегодняшней
//tomorrow и yesterday и проверить находятся ли они до или после сегодняшней


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Task1 {
    public static void main(String[] args) {

        LocalDate todaysDate = LocalDate.now();
        System.out.println("today's date: " + todaysDate);

        LocalDate myBirthday = LocalDate.of(1979, 7, 12);
        myBirthday = LocalDate.of(1979, Month.JULY, 12);
        System.out.println("my birthday: " + myBirthday);
        System.out.println("year: " + myBirthday.getYear() + "; month: " + myBirthday.getMonth() + "; day: " + myBirthday.getDayOfMonth());
        System.out.println("day of week: " + myBirthday.getDayOfWeek() + "; day of year: " + myBirthday.getDayOfYear() + "; month number: " + myBirthday.getMonthValue());

        LocalDate date = LocalDate.of(2020, 9, 1);
        LocalDate date1 = LocalDate.of(2022, Month.SEPTEMBER, 1);
        System.out.println("date.equals(date1): " + date.equals(date1));

        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("current time: " + currentTime.format(formatter));
        LocalTime threeHoursLater = currentTime.plusHours(3);
        System.out.println("current time plus 3 hours: " + threeHoursLater.format(formatter));

        System.out.println("nextWednesday: " + todaysDate.plusDays(7));
        System.out.println("nextWednesday1: " + todaysDate.plusWeeks(1));
        System.out.println("todayLastYear: " + todaysDate.minusYears(1));
        System.out.println("todayLastYear1: " + todaysDate.minusMonths(12));
        System.out.println("todayNextYear: " + todaysDate.plusDays(365));

        LocalDate tomorrow = todaysDate.plusDays(1);
        System.out.println("tomorrow: " + todaysDate.plusDays(1));
        LocalDate yesterday = todaysDate.minusDays(1);
        System.out.println("yesterday: " + todaysDate.minusDays(1));
        System.out.println("tomorrow.isAfter(todaysDate): " + tomorrow.isAfter(todaysDate));
        System.out.println("yesterday.isBefore(todaysDate): " + yesterday.isBefore(todaysDate));

    }
}
