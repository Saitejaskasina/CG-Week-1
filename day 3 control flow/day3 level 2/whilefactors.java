import java.util.Scanner;
public class whilefactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if (num > 0) {
            int i = 1;
            while (i <= num) {
                if (num % i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Enter a positive number");
        }
        sc.close();
    }
}