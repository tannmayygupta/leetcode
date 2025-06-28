import java.util.Scanner;


// https://leetcode.com/problems/smallest-index-with-digit-sum-equal-to-index/description/

// 3550. Smallest Index With Digit Sum Equal to Index

public class SmallestIndexWithDigitSumEqualtoIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = {1,3,2};

        
        System.out.println(smallestIndex(nums));

    }
    public static int smallestIndex(int[] nums) {

        for(int i = 0 ; i < nums.length ; i++){
            if( i == sumofdigits(nums[i])){
                return i ;
            }
        }

        return -1 ;
        
    }
    public static int sumofdigits(int n){
        int sum = 0 ;

        while(n > 0){
            int rem = n % 10 ;
            sum += rem ;
            n = n / 10 ;
        }

        return sum ;
    }
}
