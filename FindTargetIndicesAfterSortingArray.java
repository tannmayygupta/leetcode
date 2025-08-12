import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {
    // 2089. Find Target Indices After Sorting Array 
    // https://leetcode.com/problems/find-target-indices-after-sorting-array/

    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3} ;
        int target = 2 ;

        System.out.println(targetIndices(nums, target));
        
    }
    
    static List<Integer> targetIndices(int[] nums, int target) {

        nums = mergesort(nums);

        List<Integer> ans = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(target == nums[i]){
                ans.add(i);
            }
        }

        return ans ;

    }

    static int[] mergesort(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }

        int mid = nums.length / 2;

        int[] left = mergesort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(nums, mid, nums.length));

        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                merged[k] = left[i];
                i++;
            } else {
                merged[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            merged[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            merged[k] = right[j];
            j++;
            k++;
        }

        return merged ;
    }
}
