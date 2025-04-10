import java.util.*;

public class MinimumOperationstoMakeArrayValuesEqualtoK {
    public static void main(String[] args) {
        int nums[] = {1,2,2,3};
        int k = 2 ;
    }
    public static int minOperations(int[] nums, int k) {
        int n = nums.length ;

        HashSet<Integer> l = new HashSet<>();

        for(int i = 0 ; i < n ; i++){
            if(nums[i] < k){
                return -1;
            }
            else if(nums[i] > k){
                l.add(nums[i]);
            }
        }
        return l.size();
        // int h = nums[0];

        // for(int i = 0 ; i < nums.length ; i++){
        //     if(nums[i] > h){
        //         nums[i] = h ;
        //     }
        // }

    }       
}

