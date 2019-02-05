package topic.b.localization;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class ChronoUnitEx {

    public static void main(String[] args) {
        Instant previous, current, gap;

        previous = Instant.now();
        current = Instant.now().plusMillis(20);
        if (previous != null) {
            //gap = ChronoUnit.MILLIS.between(previous, current);
        }
    }
}
