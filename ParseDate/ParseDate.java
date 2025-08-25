import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        return LocalDateTime.parse(stringDate);
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        // lundi 25 avril 2022
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", Locale.FRENCH);
        return LocalDate.parse(stringDate, formatter);
    }

    public static LocalTime parseTimeFormat(String stringDate) {
    
        // "09 heures du soir, 07 minutes et 23 secondes"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H 'heures du soir,' mm 'minutes et' ss 'secondes'",
                Locale.FRENCH);
        if (stringDate != null && stringDate.contains("heures du soir")) {
            return LocalTime.parse(stringDate, formatter).plusHours(12);

        }

        return LocalTime.parse(stringDate, formatter);
    }

}