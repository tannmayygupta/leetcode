import java.util.Scanner;

public class GCDofOddandEvenSums {
    // 3658. GCD of Odd and Even Sums
    // https://leetcode.com/problems/gcd-of-odd-and-even-sums/description/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        
    }

    public static int gcdOfOddEvenSums(int n) {

        int sumeven = n*( n + 1 ) ;

        int sumodd = n * n ;

        return gcd(sumeven,sumodd);

    }

    static int gcd(int sumeven , int sumodd){
        
        while(sumodd != 0){
            int temp = sumodd ;
            sumodd = sumeven % sumodd ;
            sumeven = temp ;
        }

        return sumeven ;
    }
}
