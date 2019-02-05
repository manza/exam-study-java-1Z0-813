package topic.b.localization;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.TemporalUnit;

public class DurationEx {

    public static void main(String[] args) {
        Instant start = Instant.now();

        Duration gap = Duration.ofSeconds(30);
        Instant later = start.plus(gap);

        System.out.println(start);
        System.out.println(gap);
        System.out.println(later);



    }
}
