import java.util.Arrays;

public class NumberofSubsequencesThatSatisfytheGivenSumCondition {
    public static void main(String[] args) {

        int[] nums = {3,5,6,7};

        int target = 9 ;
        

        int a = numSubseq(nums, target);
    }

    // 1498. Number of Subsequences That Satisfy the Given Sum Condition

    public static int numSubseq(int[] nums, int target) {

        int mam = 0 ;

        Arrays.sort(nums);
        
        int sum = 0 ;
        
        for(int i = 0 ; i < nums.length ; i++){

            sum = 0 ;
            
            for(int j = i ; j < nums.length ; j++){
                
                sum += nums[j];

                if(sum <= target){
                    mam++;
                }
                else{
                    break ;
                }
            }
        }

        return mam ;

        // int start = 0 ; 
        // int end = nums.length - 1 ;

        // while(start < end){
        //     int mid = 
        // }
    }
}
