import java.util.Arrays;

public class RemoveDuplicatesfromSortedArrayII {
    // 80. Remove Duplicates from Sorted Array II
    public static void main(String[] args) {
        int[] nums = {0,0,0,0,1,1,1,1,1,1};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int ptr1 = 0 ;
        int ptr2 = 0 ;// 0,1,2,3,4,5,6,7,8,9
        int cou = 0 ; // 0,0,0,0,1,1,1,1,1,1
        while(ptr2 < nums.length){
            if(nums[ptr1] == nums[ptr2] && cou < 2){
                ptr1++;
                cou++;
            }else if(nums[ptr1] == nums[ptr2] && cou >= 2){
                cou++ ;
            }else if(nums[ptr1] != nums[ptr2]){
                nums[ptr1]=nums[ptr2];
                ptr1++;
                if(cou <= 1){
                    cou++;
                }else{
                    cou = 1 ;
                }
            }
            ptr2++;
        }
        return ptr1+1 ;
    }
}
