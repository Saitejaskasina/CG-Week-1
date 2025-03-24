
import java.util.Scanner;
public class studentmarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        float[] percentage = new float[n];
        char[] grade = new char[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the marks of student " + (i + 1) + " in physics: ");
            marks[i] = sc.nextInt();
            if (marks[i] < 0) {
                System.out.println("Please enter positive values");
                i--;
                continue;
            }
            System.out.println("Enter the marks of student " + (i + 1) + " in chemistry: ");
            marks[i] += sc.nextInt();
            if (marks[i] < 0) {
                System.out.println("Please enter positive values");
                i--;
                continue;
            }
            System.out.println("Enter the marks of student " + (i + 1) + " in maths: ");
            marks[i] += sc.nextInt();
            if (marks[i] < 0) {
                System.out.println("Please enter positive values");
                i--;
                continue;
            }
            percentage[i] = (marks[i] / 3);
            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Marks of student " + (i + 1) + " in physics, chemistry, and maths are: " + marks[i]);
            System.out.println("Percentage of student " + (i + 1) + " is: " + percentage[i]);
            System.out.println("Grade of student " + (i + 1) + " is: " + grade[i]);
        }sc.close();
    }
}



