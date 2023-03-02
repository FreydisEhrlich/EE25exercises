package conditionalStatements;

import java.time.*;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        Month month = Month.from(date);
        LocalTime time = LocalTime.now();
        DayOfWeek day = DayOfWeek.from(date);
        MonthDay number = MonthDay.now();

        System.out.println(date);
        System.out.println(month);
        System.out.println(time);
        System.out.println(day);
        System.out.println(number);

    }
}
