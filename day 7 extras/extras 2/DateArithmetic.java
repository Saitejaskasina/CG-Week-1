import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date (yyyy-MM-dd):");
        LocalDate date = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        date = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Updated Date: " + date);

        scanner.close();
    }
}