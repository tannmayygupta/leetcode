import java.util.*;

public class ReverseWordsinaStringIII{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(s);
    }

    public static String reverseWords(String s) {
        String[] s2 = s.split("\\s+");
        StringBuilder s1 = new StringBuilder();

        for (int i = 0; i < s2.length; i++) {
            StringBuilder word = new StringBuilder(s2[i]);
            s1.append(word.reverse());

            if (i != s2.length - 1) {
                s1.append(" ");
            }
        }

        return s1.toString();
    }
}
