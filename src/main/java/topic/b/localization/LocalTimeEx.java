package topic.b.localization;

import java.time.Clock;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeEx {

    public static void main(String[] args) {
        LocalTime thisSec;
        for(;;) {
            thisSec = LocalTime.now();
            System.out.println(thisSec.getHour() + ":" + thisSec.getMinute());
        }
    }
}
