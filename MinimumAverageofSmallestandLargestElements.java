import java.util.Arrays;

public class MinimumAverageofSmallestandLargestElements {
    public static void main(String[] args) {

        int nums[] = {7,8,3,4,15,13,4,1};
        
        System.out.println(minimumAverage(nums));
        
    }
    public static double minimumAverage(int[] nums) {

        Arrays.sort(nums);

        int st = 0 ;

        int end = nums.length - 1 ;

        double avg = Double.MAX_VALUE;

        double avg1 = 0 ;

        while(st < end){
            avg1 = (double) (nums[st] + nums[end]) / 2 ; 
            avg = Math.min(avg,avg1);
            st++;
            end--;
        }

        return avg ;
        
    }
}
