public class Temperature {

    public double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
 
    public static void main(String[] args) {
        Temperature temp = new Temperature();
        double temperature = 30.0;
        double windSpeed = 10.0;
        double windChill = temp.calculateWindChill(temperature, windSpeed);
        System.out.println("Wind Chill Temperature: " + windChill);
    }
 }
 
 