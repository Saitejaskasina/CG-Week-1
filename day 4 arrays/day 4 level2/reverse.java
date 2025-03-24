
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int count = 0;
        int temp = num;
        while(temp>0){
            temp = temp/10;
            count++;
        }
        int[] arr = new int[count];
        int i = 0;
        while(num>0){
            arr[i] = num%10;
            num = num/10;
            i++;
        }
        System.out.println("The reverse of the number is: ");
        for(int j = count-1; j>=0; j--){
            System.out.print(arr[j]);
        }sc.close();
    }
}

