import java.util.Scanner;

// 3258. Count Substrings That Satisfy K-Constraint I

// https://leetcode.com/problems/count-substrings-that-satisfy-k-constraint-i/

public class CountSubstringsThatSatisfyKConstraintI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int k = sc.nextInt();

        System.out.println(countKConstraintSubstrings(s, k));

    }

    public static int countKConstraintSubstrings(String s, int k) {

        int mam = 0 ;

        for(int i = 0 ; i < s.length() ; i++){
            for(int j = i ; j < s.length() ; j++){
                String s1 = s.substring(i,j+1);

                if( k >= CountOnes(s1) ){
                    mam++;
                }
                else if( k >= s1.length() - CountOnes(s1) ){
                    mam++;
                }
            }
        }

        return mam ;
    }

    public static int CountOnes(String s1){
        int cou0 = 0 ;
        int cou1 = 0 ;
        
        for(int i = 0 ; i < s1.length() ; i++){

            char ch = s1.charAt(i);
            
            if(ch == '0'){
                cou0++;
            }
            else{
                cou1++;
            }
        }
        return cou0 ;
    }
}
