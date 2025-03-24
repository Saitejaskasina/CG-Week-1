
import java.util.Scanner;
public class largestremake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        while(num > 0){
            int digit = num % 10;
            digits[index] = digit;
            index++;
            num = num / 10;
            if(index == maxDigit){
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for(int i = 0; i < digits.length; i++){
                    temp[i] = digits[i];
                }
                digits = temp;
            }
        }
        int largest = 0;
        int secondLargest = 0;
        for(int i = 0; i < index; i++){
            if(digits[i] > largest){
                secondLargest = largest;
                largest = digits[i];
            }
            else if(digits[i] > secondLargest){
                secondLargest = digits[i];
            }
        }
        System.out.println("Largest digit: " + largest);
        System.out.println("Second Largest digit: " + secondLargest);
        sc.close();
    }
}

