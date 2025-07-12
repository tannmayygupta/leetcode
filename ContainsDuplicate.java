import java.util.HashMap;
// 217. Contains Duplicate

// https://leetcode.com/problems/contains-duplicate/description/
public class ContainsDuplicate {
    public static void main(String[] args) {

        int[] nums = {1,1,1,3,3,4,3,2,4,2};

        System.out.println(containsDuplicate(nums));
        
    }
    public static boolean containsDuplicate(int[] nums) {
       
    HashMap<Integer ,Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                return true ;
            }
            map.put(nums[i], i);
        }

        return false;
        
    }
}
