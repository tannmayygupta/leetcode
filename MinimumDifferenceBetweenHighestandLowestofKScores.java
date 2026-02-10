import java.util.Arrays;
import java.util.Scanner;

public class MinimumDifferenceBetweenHighestandLowestofKScores {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int[] nums = {1,9,4,7};
        int k = 2 ;
        System.out.println(value(nums, k));
    }
    public static int value(int[] nums, int k ){
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE ; 
        for(int i = 0 ; i < nums.length - k + 1 ; i++){
            if(min > nums[i + k - 1] - nums[i]){
                min = nums[i + k - 1] - nums[i] ;
            }
        }
        return min ;
    }
}
