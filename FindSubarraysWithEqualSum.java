import java.util.HashSet;
    // 2395. Find Subarrays With Equal Sum
public class FindSubarraysWithEqualSum {
    public static void main(String[] args) {
        int[] nums = {4,2,4};
        System.out.println(findSubarrays(nums));
    }
    public static boolean findSubarrays(int[] nums) {
        HashSet<Integer> ans = new HashSet<>();
        
        for(int i = 0 ; i < nums.length - 1 ; i++){
            ans.add(nums[i]+nums[i+1]);
        }

        if(ans.size() ==  nums.length - 1){
            return false ;
        }

        return true ;
    }
}
