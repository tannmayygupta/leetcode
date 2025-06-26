import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(lengthOfLongestSubstring(s));
        
    }

    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int[] arr = new int[128];
        int rep = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            arr[c]++;

            while (arr[c] > 1) {
                char repchar = s.charAt(rep);
                arr[repchar]--;
                rep++;
            }

            max = Math.max(max, i - rep + 1);
        }

        return max;
    }

}
