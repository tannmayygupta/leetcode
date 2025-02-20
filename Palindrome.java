import java.util.*;
public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        Palindrome p = new Palindrome();

        System.out.println(p.palindrome(x));

    }
    static boolean palindrome(int x){
        
        if(x < 0){
            return false ;
        }
        // if (x == 0){
        //     return true ;
        // }
        else{
            int orig = x ;
            int reverse = 0 ;
            while(x > 0){
                int rem = x % 10 ;
                reverse = ( reverse * 10 ) + rem ;
                x = x / 10 ;
            }

            if(orig == reverse){
                return true ;
            }
            else{
                return false ;
            }
            
        }
        
    } 
}