import java.util.Scanner;

public class SortingtheSentence {
    public static void main(String[] args) {

        // 1859. Sorting the Sentence
        // https://leetcode.com/problems/sorting-the-sentence/description/

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(sortSentence(s));
        
    }

    public static String sortSentence(String s) {

        String[] s1 = s.split(" ");

        String[] s2 = new String[s1.length];

        for(int i = 0 ; i < s1.length ; i++){
            String sm = s1[i];
            int n = sm.length() - 1 ;
            int m = sm.charAt(n) - '0';

            s2[m - 1] = sm.substring(0,n);

        }

        StringBuilder sb = new StringBuilder(" ") ;

        for(int j = 0 ; j < s2.length ; j++){
            sb.append(s2[j]);
            sb.append(" ");
        }

        return sb.toString().trim();

    }
}
