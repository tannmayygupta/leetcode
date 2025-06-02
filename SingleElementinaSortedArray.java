/*
 * https://leetcode.com/problems/single-element-in-a-sorted-array/description/
 * 540. Single Element in a Sorted Array
 * for understanding youva book with yellow cover page
 * 
 */

public class SingleElementinaSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        
        System.out.println(nums);
    }
    public static int singleNonDuplicate(int[] nums) {

        int end = nums.length - 2 ; // for corner element as we are checking elemnt before our 
        // mid pointer and elemnet after the mid pointer

        int start = 1 ; // similar reason as end ; 

        if(1 == nums.length){ 
            return nums[0];
        }
        if(nums[0] != nums[1]){
            return nums[0];
        }
        if(nums[nums.length - 1] != nums[nums.length - 2]) {
            return nums[nums.length - 1];
        }

        while(start <= end){
            int mid = start + (end - start)/2 ;

            if(nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]){
                return nums[mid] ;
            }

            if((mid % 2 == 0 && nums[mid]==nums[mid+1]) || (mid % 2 != 0 && nums[mid - 1]==nums[mid])){
                start = mid + 1 ;
            }
            else{
                end = mid - 1 ;
            }
        }
        
        return -1 ;
    }
}
