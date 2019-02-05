package topic.b.localization;

import java.time.Month;
import java.time.MonthDay;

public class MonthDayEx {

    public static void main(String[] args) {
        MonthDay date1 = MonthDay.of(Month.OCTOBER, 29);
        System.out.println(date1.getDayOfMonth());
        System.out.println(date1.getMonthValue());

    }
}
