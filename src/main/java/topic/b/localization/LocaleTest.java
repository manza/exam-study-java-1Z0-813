package topic.b.localization;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        Locale myLocale = Locale.getDefault();
        System.out.println("My locale: " + myLocale);

        LocalDateTime aDateTime = LocalDateTime.of(2024,4, 8, 13, 35, 56 );
        System.out.println("The date and time: " + aDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));

        ZonedDateTime zDateTime = ZonedDateTime.of(aDateTime, ZoneId.of("US/Pacific"));
        Locale locIT = new Locale("it", "IT");
        Locale locPT = new Locale("pt", "BR");

        System.out.println("Italy " + zDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withLocale(Locale.ITALY)));
        System.out.println("Italy " + zDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(locIT)));

        System.out.println("Display Country IT: " + locIT.getDisplayCountry());
        System.out.println("Display Language IT: " + locIT.getDisplayLanguage());

        System.out.println("Display Country PT: " + locPT.getDisplayCountry());
        System.out.println("Display Language PT: " + locPT.getDisplayLanguage());
    }
}
