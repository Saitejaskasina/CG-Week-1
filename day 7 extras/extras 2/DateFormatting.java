import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println("Format dd/MM/yyyy: " + today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Format yyyy-MM-dd: " + today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        System.out.println("Format EEE, MMM dd, yyyy: " + today.format(DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy")));
    }
}