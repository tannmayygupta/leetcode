import java.util.Arrays;

public class FindGreatestCommonDivisorofArray {
    public static void main(String[] args) {
        int[] nums = {2,5,6,9,10};

        System.out.println(findGCD(nums));
        
    }
    public static int findGCD(int[] nums) {

        Arrays.sort(nums);

        int st = 0 ; 

        int end = nums.length - 1 ; 

        int max = nums[end];

        int min = nums[st];

        int n = 1 ;

        int ans = 1 ;

        while(n <= min){
            if(min % n == 0 && max % n == 0){
                ans = Math.max(ans, n);
            }
            n++;
        }

        return ans ;        
    }
}
