import java.util.Scanner;
 public class swap{
     public static void main (String[]args){
         Scanner sc = new Scanner(System.in);
         int number1 = sc.nextInt();
         int number2 = sc.nextInt();
         int temp = number1;
         number1 = number2;
         number2 = temp;
         System.out.printf("The swapped numbers are %d and %d", number1, number2);
         sc.close();
     }
 }