// input a3b2 output aaabb
/* 
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                result.append(ch);
            } else if (Character.isDigit(ch)) {
                int count = Character.getNumericValue(ch);
                char lastChar = result.charAt(result.length() - 1);
                for (int j = 1; j < count; j++) {
                    result.append(lastChar);
                }
            }
        }
        System.out.println(result.toString());
    }
        
    }


*/

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;  
            } else {
                result.append(str.charAt(i - 1)).append(count);
                count = 1;  
            }
        }

        result.append(str.charAt(str.length() - 1)).append(count);

        System.out.println(result.toString());
    }
}
