import java.util.Scanner;

public class ReverseWordsinaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String[] s1 = s.trim().split("\\s+");

        StringBuilder ans = new StringBuilder();

        for(int i = s1.length - 1 ; i >= 0 ; i--){
            ans.append(s1[i]);
            if(i!=0){
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}
