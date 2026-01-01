import java.util.Arrays;
import java.util.Scanner;

public class OnePlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = {9,9,9,9,8,9,1} ;
        
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Start from the last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // Increment and return if no carry
                return digits;
            } else {
                digits[i] = 0; // Set to 0 and carry over
            }
        }

        // If all digits were 9 (but none are 9 in this case)
        int[] result = new int[n + 1];
        result[0] = 1; // First digit is 1, rest are 0 by default
        return result;
    }
}
