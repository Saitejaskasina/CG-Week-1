import java.util.Scanner;
public class UnitConverter {
   public static double convertKmToMiles(double km) {
   	double km2miles = 0.621371;
   	return km * km2miles;
   }

   public static void main(String[] args) {
   	Scanner scanner = new Scanner(System.in);

   	System.out.println("Enter kilometers to convert to miles:");
   	double km = scanner.nextDouble();
   	System.out.println(km + " kilometers is " + convertKmToMiles(km) + " miles.");

   	System.out.println("Enter miles to convert to kilometers:");
   	double miles = scanner.nextDouble();
   	System.out.println(miles + " miles is " + convertMilesToKm(miles) + " kilometers.");

   	System.out.println("Enter meters to convert to feet:");
   	double meters = scanner.nextDouble();
   	System.out.println(meters + " meters is " + convertMetersToFeet(meters) + " feet.");

   	System.out.println("Enter feet to convert to meters:");
   	double feet = scanner.nextDouble();
   	System.out.println(feet + " feet is " + convertFeetToMeters(feet) + " meters.");

   	scanner.close();
   }

   public static double convertMilesToKm(double miles) {
   	double miles2km = 1.60934;
   	return miles * miles2km;
   }

   public static double convertMetersToFeet(double meters) {
   	double meters2feet = 3.28084;
   	return meters * meters2feet;
   }
   public static double convertFeetToMeters(double feet) {
   	double feet2meters = 0.3048;
   	return feet * feet2meters;
   }
}

