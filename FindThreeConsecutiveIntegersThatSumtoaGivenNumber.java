import java.util.*;

public class FindThreeConsecutiveIntegersThatSumtoaGivenNumber {

    // https://leetcode.com/problems/find-three-consecutive-integers-that-sum-to-a-given-number/

    // 2177. Find Three Consecutive Integers That Sum to a Given Number
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();

        System.out.println(sumOfThree(num).toString());

    }

    public static long[] sumOfThree(long num) {

        long[] arr = new long[3];

        long n = num - 3 ;

        if(n % 3 != 0){
            return new long[0]  ;
        }

        arr[0] = n / 3 ;

        arr[1] = arr[0] + 1 ;

        arr[2] = arr[0] + 2 ;

        return arr ;
        
    }

}
