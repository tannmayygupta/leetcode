import java.util.HashMap;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2 ;
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        // for(int i = 0 ; i < nums.length ; i++){
        //     for(int j = i + 1 ; j < nums.length ; j++){
        //         if(nums[i] == nums[j] && Math.abs(i - j) <= k){
        //             return true ;
        //         }
        //     }
        // }

        // return false ;

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                int ind = map.get(nums[i]);
                if(i - ind <= k){
                    return true ;
                }
            }
            map.put(nums[i] , i);
        }
        
        return false ;
    }
}
