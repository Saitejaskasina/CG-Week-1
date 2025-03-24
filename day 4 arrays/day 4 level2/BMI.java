import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of persons: ");
        int n = sc.nextInt();
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the weight of person " + (i + 1) + " in kgs: ");
            weight[i] = sc.nextDouble();
            System.out.println("Enter the height of person " + (i + 1) + " in meters: ");
            height[i] = sc.nextDouble();
            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] < 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obesity";
            }
        }
        System.out.println("Person\tWeight(kg)\tHeight(m)\tBMI\t\tWeight Status");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t" + weight[i] + "\t\t" + height[i] + "\t\t" + bmi[i] + "\t" + status[i]);
        }sc.close();
    }
}

