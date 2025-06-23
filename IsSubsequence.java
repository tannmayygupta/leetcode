// Is Subsequence(firstly a thought wrong approach that find ch but not in sequence but after thinking more i got with new approach two pointer by initialising both pointer to 
// the start of String s and t and then after find s char in t then moving s pointer else moving the t pointer

import java.util.Scanner;

public class IsSubsequence {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        
        String t = sc.nextLine();   

        System.out.println(isSubsequence(s, t));
    }

        // my fist thoung was not correct as it returns true for "aec"

    // public boolean isSubsequence(String s, String t) {

    //     for(int i = 0 ; i < s.length() ; i++){
    //         // char c = s.charAt(i);

    //         String s1 = s.substring(i,i+1);
    //         if(!t.contains(s1)){
    //             return false ;
    //         }
    //     }
        
    //     return true ;
    // }


    // two pointer 


    public static boolean isSubsequence(String s, String t) {
            int s1=0;
            int t1=0;

            while(s1 < s.length() && t1 < t.length()){
                if(s.charAt(s1) == t.charAt(t1)){
                    s1++;
                }
                t1++;
            }

            if(s1 == s.length()){
                return true ;
            }

            return false;
    }

}
