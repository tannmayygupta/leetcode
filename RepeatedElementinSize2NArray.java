import java.util.HashMap;

public class RepeatedElementinSize2NArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3};
        
        System.out.println(repeatedNTimes(nums));
    }

    public static int repeatedNTimes(int[] nums) {

        HashMap<Integer,Integer> ans = new HashMap<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            if(ans.containsKey(nums[i])){
                int val = ans.get(nums[i]);
                ans.put(nums[i],val+1);
            }
            else{
                ans.put(nums[i],1);
            }
        }

        for(int i = 0 ; i < nums.length ; i++){
            if(ans.get(nums[i]) * 2 == nums.length ) {
                return nums[i];
            }
        }
        
        return -1 ;
    }

}
