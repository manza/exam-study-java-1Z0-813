package topic.b.localization;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Elipse {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalTime nowTime = LocalTime.now();
        LocalDateTime nowDateTime = LocalDateTime.of(nowDate, nowTime);
        System.out.println("It's currently " + nowDateTime + " where I am");

        // In Madras, OR
        LocalDate eclipseDate1 = LocalDate.of(2017, 8, 21);
        LocalDate eclipseDate2 = LocalDate.parse("2017-08-21");
        System.out.println("Eclipse date: " + eclipseDate1 + ", " + eclipseDate2);

        // Eclipse begins
        LocalTime begins = LocalTime.of(9, 6, 43);

        // Totality
        LocalTime totality = LocalTime.parse("10:19:36");

        System.out.println("Eclipse begins at " + begins + " and totality is at " + totality);

        // DateTimeFormatter
        String eclipseDateTime = "2017-08-21 10:19";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime eclipseDay = LocalDateTime.parse(eclipseDateTime, formatter);
        System.out.println("Eclipse day: " + eclipseDay);

        // Mom time
        System.out.println("Mom time: " + eclipseDay.plusHours(2));

        // Going home
        System.out.println("Going home: " + eclipseDay.plusDays(3));

        // Day of week Eclipse occurs
        System.out.println("Day of week Eclipse occurs: " + eclipseDay.getDayOfWeek());

        // Zone Date Time
        ZoneId zoneId = ZoneId.of("US/Pacific");
        ZonedDateTime zTotalityDateTime = ZonedDateTime.of(eclipseDay, zoneId);
        System.out.println("Date and time totality begins with time zone: " + zTotalityDateTime);
        System.out.println(zoneId.getRules().isDaylightSavings(zTotalityDateTime.toInstant()));

        // Zone Date Time BR
        ZoneId zoneIdSP = ZoneId.of("Brazil/East");
        ZonedDateTime zTotalityDateTimeSP = ZonedDateTime.of(eclipseDay, zoneIdSP);
        System.out.println("Date and time totality begins with time zone: " + zTotalityDateTimeSP);
        System.out.println(zoneIdSP.getRules().isDaylightSavings(zTotalityDateTimeSP.toInstant()));

        // Zone Ids
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        List<String> zoneList = new ArrayList<>(allZoneIds);
        Collections.sort(zoneList);
        for(String strZoneId : zoneList) {
            if (strZoneId.contains("Brazil")) {
                //System.out.println(strZoneId);
            }
        }

        // Instant and Duration
        Instant nowInstant = Instant.now();
        Instant totalityInstant = zTotalityDateTime.toInstant();
        long minsBetween = ChronoUnit.MINUTES.between(nowInstant, totalityInstant);
        System.out.println("Long between: " + minsBetween);
        Duration durationBetweenInstants = Duration.ofMinutes(minsBetween);
        System.out.println("Mins between " + minsBetween + ", is duration " + durationBetweenInstants);

    }
}
