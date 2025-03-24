import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature:");
        double temp = scanner.nextDouble();
        System.out.println("Convert to (C/F):");
        String unit = scanner.next();
        System.out.println("Converted temperature: " + (unit.equals("C") ? toCelsius(temp) : toFahrenheit(temp)));
        scanner.close();
    }

    static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    static double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}