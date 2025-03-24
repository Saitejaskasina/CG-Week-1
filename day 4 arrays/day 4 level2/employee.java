
import java.util.Scanner;
public class employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] newSalary = new double[10];
        double[] bonus = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the salary of employee " + (i + 1));
            salary[i] = sc.nextDouble();
            System.out.println("Enter the years of service of employee " + (i + 1));
            years[i] = sc.nextDouble();
            if (salary[i] < 0 || years[i] < 0) {
                System.out.println("Invalid input. Please enter again");
                i--;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("The total bonus payout is " + totalBonus);
        System.out.println("The total old salary payout is " + totalOldSalary);
        System.out.println("The total new salary payout is " + totalNewSalary);
        sc.close();
    }
}

