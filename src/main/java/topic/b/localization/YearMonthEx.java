package topic.b.localization;

import java.time.Month;
import java.time.YearMonth;

public class YearMonthEx {

    public static void main(String[] args) {
        YearMonth date = YearMonth.now();
        System.out.println(date.lengthOfMonth());

        YearMonth date2 = YearMonth.of(2019, Month.NOVEMBER);
        System.out.println(date2.lengthOfMonth());
    }

}
