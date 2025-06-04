import java.util.*;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(longestPalindrome(s));
        
    }
    public static String longestPalindrome(String s) {
        
        int maxleng = 0 ;

        int ind1 = 0 ;

        int ind2 = 0 ;

        // if(s.length() == 1){
        //     return s ;
        // }   

        for(int i = 0 ; i < s.length() ; i++){
            for(int j = i ; j < s.length() ; j++){
                String s1 = s.substring(i,j+1);
                if(palindrome(s1)){
                    int currlen = j - i + 1;
                    if(currlen > maxleng){
                        maxleng = currlen;
                        ind1 = i ;
                        ind2 = j+1 ; 
                    }
                }
            }            
        }
        return s.substring(ind1, ind2);
    }
    public static boolean palindrome(String s1){
        int st = 0 ;
        int end = s1.length() - 1;

        while(st <= end){
            if(s1.charAt(st) != s1.charAt(end)){
                return false ;
            }

            st++;
            end--;
        }
        return true ;
    }
}
