package topic.b.localization;

import java.awt.*;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class NumbersAndCurrencies {

    public static void main(String[] args) {
        Date currentDate = new Date();
        TextField dateField = new TextField();
        String dateString = currentDate.toString();
        dateField.setText(dateString);

        Date curDate = new Date();
        String dateStr = curDate.toString();
        dateField.setText(dateStr);

        Locale[] availableLocales = DateFormat.getAvailableLocales();
        for(Locale l : availableLocales) {
//            System.out.println(l.toString());
        }

        System.out.println(Locale.forLanguageTag("pr-br"));

        NumberFormat formatter = NumberFormat.getInstance(Locale.ENGLISH);
        System.out.println(formatter.format(10000));

        NumberFormat formatterDe = NumberFormat.getInstance(Locale.GERMAN);
        System.out.println(formatterDe.format(10000));

        DateFormat dateFormatterEN = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ENGLISH);
        System.out.println(dateFormatterEN.format(new Date()));

        DateFormat dateFormatterDE = DateFormat.getDateInstance(DateFormat.SHORT, Locale.GERMAN);
        System.out.println(dateFormatterDE.format(new Date()));

    }
}
