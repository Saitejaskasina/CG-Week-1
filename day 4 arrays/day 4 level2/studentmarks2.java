
import java.util.Scanner;
public class studentmarks2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        int marks[][] = new int[n][3];
        float percentage[] = new float[n];
        char grade[] = new char[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the marks of student "+(i+1)+": ");
            for(int j=0; j<3; j++){
                marks[i][j] = sc.nextInt();
                if(marks[i][j]<0){
                    System.out.println("Enter positive values only");
                    j--;
                }
            }
        }
        for(int i=0; i<n; i++){
            percentage[i] = (marks[i][0]+marks[i][1]+marks[i][2])/3;
            if(percentage[i]>=90){
                grade[i] = 'A';
            }
            else if(percentage[i]>=80){
                grade[i] = 'B';
            }
            else if(percentage[i]>=70){
                grade[i] = 'C';
            }
            else if(percentage[i]>=60){
                grade[i] = 'D';
            }
            else if(percentage[i]>=40){
                grade[i] = 'E';
            }
            else{
                grade[i] = 'F';
            }
        }
        for(int i=0; i<n; i++){
            System.out.println("Student "+(i+1)+" marks: ");
            for(int j=0; j<3; j++){
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
            System.out.println("Percentage: "+percentage[i]);
            System.out.println("Grade: "+grade[i]);
        }sc.close();
    }
}

