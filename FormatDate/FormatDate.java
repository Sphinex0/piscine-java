import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatDate {

    public static String formatToFullText(LocalDateTime dateTime) {
        // Le 22 août de l'an 2021 à 13h25m et 46s
        if (dateTime == null)
            return null;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                "'Le' dd MMMM 'de l''an' yyyy 'à' HH'h'mm'm et' ss's'",
                Locale.FRENCH);
        return formatter.format(dateTime);
    }

    public static String formatSimple(LocalDate date) {
        if (date == null)
            return null;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd YY", Locale.ITALIAN);
        return formatter.format(date);
    }

    public static String formatIso(LocalTime time) {
        if (time == null)
            return null;

        return DateTimeFormatter.ISO_TIME.format(time);
    }

}