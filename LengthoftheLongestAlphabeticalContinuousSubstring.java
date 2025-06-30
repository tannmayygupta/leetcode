import java.util.Scanner;

public class LengthoftheLongestAlphabeticalContinuousSubstring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    
        String s = sc.nextLine();

        System.out.println(longestContinuousSubstring(s));
    }

    public static int longestContinuousSubstring(String s) {

        int maxlength = 0 ;

        int mam = 1 ;

        for(int i = 0 ; i < s.length() - 1; i++){
            char ch = s.charAt(i);



            char ch1 = s.charAt(i+1);

            if(ch + 1 == ch1){
                mam++;
            }
            else{
                maxlength = Math.max(maxlength,mam);
                mam = 1 ;
            }
        }

        maxlength = Math.max(maxlength, mam);

        return maxlength ;
    }
}
