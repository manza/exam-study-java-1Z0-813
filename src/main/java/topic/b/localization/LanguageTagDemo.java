package topic.b.localization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

public class LanguageTagDemo {

    public static void main(String[] args) {
        // Create a collection of Locale objects to search
        Collection<Locale> locales = new ArrayList<>();
        locales.add(Locale.forLanguageTag("en-GB"));
        locales.add(Locale.forLanguageTag("ja"));
        locales.add(Locale.forLanguageTag("zh-cmn-Hans-CN"));
        locales.add(Locale.forLanguageTag("en-US"));

        // Express the user's preferences with a Language Priority List
        String ranges = "en-US;q=0.4,en-GB;q=0.5,fr-FR;q=0.0";
        List<Locale.LanguageRange> languageRanges = Locale.LanguageRange.parse(ranges);

        // Find the BEST match, and return just one result
        Locale result = Locale.lookup(languageRanges, locales);
        System.out.println(result.toString());

        System.out.println(Locale.getDefault());
    }
}
