import java.util.*;
public class LengthofLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int x = lengthOfLastWord(s);
        System.out.println(x);
        
    }
    public static int lengthOfLastWord(String s) {
        int n = s.length();
        int end = n - 1;

        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }

        if (end < 0) {
            return 0;
        }

        int start = end;
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
        }
        int len = end - start ;
        return len;
    }
}
