import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

// https://leetcode.com/problems/maximize-sum-of-at-most-k-distinct-elements/description/
// 3684. Maximize Sum of At Most K Distinct Elements

public class MaximizeSumofAtMostKDistinctElements {
    public static void main(String[] args) {

        int[] nums = {84,93,100,77,90};

        int k = 3;

        System.out.println(Arrays.toString(maxKDistinct(nums, k)));
        
    }   
    public static int[] maxKDistinct(int[] nums, int k) {

        Arrays.sort(nums);

        HashSet<Integer> set = new HashSet<>();

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(!set.contains(nums[i])){
                arr.add(nums[i]);
                set.add(nums[i]);
            }
        }

        System.out.println(arr);
        System.out.println(set);

        int maxsum = Integer.MIN_VALUE ;
        // int ind = 0 ;
        // for(int i = 0 ; i <= arr.size() - k ; i++){
        //     int sum = 0 ;
        //     for(int j = i ; j < k ; j++ ){
        //         sum += arr.get(j);
        //     }
        //     if(sum > maxsum){
        //         maxsum = sum ;
        //         ind = i ;
        //     }
        // }

        int[] ans = new int[k];
        int n = 0 ;

        for(int m = arr.size() - 1 ; m >= arr.size() - k ; m--){
            // ans[m] = arr.get(ind + k - (m + 1) );
            ans[n] = arr.get(m);
            n++;

        }

        return ans ;
        
    }
}
