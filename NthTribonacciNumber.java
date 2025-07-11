import java.util.*;
// 1137. N-th Tribonacci Number

// https://leetcode.com/problems/n-th-tribonacci-number/

public class NthTribonacciNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(tribonacci(n));

    }
    public static int tribonacci(int n) {
        
        // m1 iterative 

        int t0  = 0 ; 

        int tn  = 0 ;

        int t1  = 1 ; 

        int t2  = 1 ;

        if(n == 0){
            return 0 ;
        }
        else if(n == 1 || n == 2){
            return 1 ;
        } 
        else{
            while(n > 2){
                tn = t0 + t1 + t2 ;
                t0 = t1 ;
                t1 = t2 ;
                t2 = tn ;
                n--;

            }
        }

        return tn ;

        // m2: recursion (but getting tle in recursion)

        // base conditions 
        // if(n == 0){
        //     return 0 ;
        // }
        // else if(n == 1 || n == 2){
        //     return 1 ;
        // } 

        // // recursive calls
        // return tribonacci(n - 3) + tribonacci(n - 2) + tribonacci(n - 1) ;
        
    }
}
