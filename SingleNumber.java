import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2,2,1};

        System.out.println(singleNumber(nums));
    }

    
    public static int singleNumber(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }

        Arrays.sort(nums);

        int i = 0 ; 

        int n = nums.length ;
        while(i < n){
            if(i == 0 && nums[i] != nums[i+1] ){ // for first elemnet
                return nums[i];
            }
            else if(i == n - 1 && nums[i]!= nums[i-1]){ // for last elememt
                return nums[i];
            }
            else if(i < n - 1 && nums[i] == nums[i+1]){ // for bich ke elment 
                i= i+2 ; // when equal skiped
            }
            else if(i > 0 && i < n - 1 && nums[i] != nums[i+1] && nums[i] != nums[i-1]){
                return nums[i]; // if betwween me no elenet come closer 
            }
            else {
                i++;
            }
        }

        return -1 ;    
    }
}
