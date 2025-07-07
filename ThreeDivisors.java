// https://leetcode.com/problems/three-divisors/description/
// 1952. Three Divisors
import java.util.Scanner;
public class ThreeDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(isThree(n));

    }
    public static boolean isThree(int n) {

        int i = 1 ;

        int cou = 0 ;

        while(cou < 4 && i <= n){
            if(n % i == 0){
                cou++;
            }
            i++;
        }

        if(cou == 3){
            return true ;
        }

        return false ;

    }
}
