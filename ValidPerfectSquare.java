import java.util.Scanner;

public class ValidPerfectSquare {
    public static void main(String[] args) {

        // https://leetcode.com/problems/valid-perfect-square/description/

        // 367. Valid Perfect Square

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(isPerfectSquare(num));
        
    }
    // 367. Valid Perfect Square

    public static boolean isPerfectSquare(int num) {

        // prefect square ka jab bhi baat hoo 
        // 1) binary search 
        // 2) find pattern in square of num that rem they give when the divide it by 10

        for(long i = 1 ; i * i <= num ; i++){

            long in = i*i ;
            if( in == num){
                return true ;
            }
        }

        return false ;
    }
}
