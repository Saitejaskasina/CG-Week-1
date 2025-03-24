
import java.util.Scanner;
public class BMI2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of persons: ");
        int number = sc.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Enter the weight of person " + (i + 1) + " in kg: ");
            personData[i][0] = sc.nextDouble();
            while (personData[i][0] < 0) {
                System.out.println("Please enter a positive value for weight: ");
                personData[i][0] = sc.nextDouble();
            }
            System.out.println("Enter the height of person " + (i + 1) + " in meters: ");
            personData[i][1] = sc.nextDouble();
            while (personData[i][1] < 0) {
                System.out.println("Please enter a positive value for height: ");
                personData[i][1] = sc.nextDouble();
            }
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >= 25 && personData[i][2] < 40) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("Person\tWeight(kg)\tHeight(m)\tBMI\t\tWeight Status");
        for (int i = 0; i < number; i++) {
            System.out.println((i + 1) + "\t" + personData[i][0] + "\t\t" + personData[i][1] + "\t\t" + personData[i][2] + "\t" + weightStatus[i]);
        }sc.close();
    }
}

