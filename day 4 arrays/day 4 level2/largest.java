
import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int maxDigit = 10;
        int[] arr = new int[maxDigit];
        int index = 0;
        while (number != 0) {
            int digit = number % 10;
            arr[index] = digit;
            number = number / 10;
            index++;
            if (index == maxDigit) {
                break;
            }
        }
        int largest = 0;
        int secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Largest digit: " + largest);
        System.out.println("Second Largest digit: " + secondLargest);
        sc.close();
    }
}

