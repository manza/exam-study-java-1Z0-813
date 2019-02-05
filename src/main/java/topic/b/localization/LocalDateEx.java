package topic.b.localization;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class LocalDateEx {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2019, Month.FEBRUARY, 05);
        System.out.println(date1);
        System.out.println(date1.getDayOfWeek());

        LocalDate nextSunday = date1.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println(nextSunday);
        System.out.println(nextSunday.getDayOfWeek());
    }
}
