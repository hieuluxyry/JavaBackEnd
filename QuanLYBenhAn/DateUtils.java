import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateUtils {
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static LocalDate parseDate(String dateStr) throws DateTimeParseException {
        return LocalDate.parse(dateStr, DATE_FORMATTER);
    }

    public static String formatDate(LocalDate date) {
        return date.format(DATE_FORMATTER);
    }

    public static boolean isDateBeforeOrEqual(LocalDate date1, LocalDate date2) {
        return !date1.isAfter(date2);
    }
}

