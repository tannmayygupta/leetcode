import java.util.Arrays;
import java.util.HashSet;
    // 2465. Number of Distinct Averages
public class NumberofDistinctAverages {
    public static void main(String[] args) {
        
        int[] nums = {4,1,4,0,3,5};

        System.out.println(distinctAverages(nums));
    
    }
    public static int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int st = 0 ; 
        int end = nums.length - 1 ; 
        
        HashSet<Double> ans = new HashSet<>();

        while(st < end){
            ans.add( (double) (nums[end]+nums[st])/2 );
            st++;
            end--;
        }

        return ans.size();
    }
}
