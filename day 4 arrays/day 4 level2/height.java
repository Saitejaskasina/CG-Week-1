
import java.util.Scanner;
public class height{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3];
        int[] height = new int[3];
        for(int i=0;i<3;i++){
            System.out.println("Enter the age of friend "+(i+1));
            age[i] = sc.nextInt();
            System.out.println("Enter the height of friend "+(i+1));
            height[i] = sc.nextInt();
        }
        int youngest = age[0];
        int tallest = height[0];
        for(int i=0;i<3;i++){
            if(age[i]<youngest){
                youngest = age[i];
            }
            if(height[i]>tallest){
                tallest = height[i];
            }
        }
        System.out.println("The youngest friend is "+youngest+" years old");
        System.out.println("The tallest friend is "+tallest+" cm tall");
        sc.close();
    }
}

