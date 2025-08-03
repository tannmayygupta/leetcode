import java.util.Arrays;

public class FinalArrayStateAfterKMultiplicationOperationsI {
    public static void main(String[] args) {
        
        int[] nums = {2,1,3,5,6} ;

        int k = 5 ;

        int multiplier = 2 ;

        System.out.println(Arrays.toString(getFinalState(nums, k, multiplier)));
        
    }
    public static int[] getFinalState(int[] nums, int k, int multiplier) {

        while(k > 0){

            int indx = smallest(nums);

            nums[indx] = multiplier * nums[indx];
            
            k--;
        }

        return nums ;
        
    }
    static int smallest(int[] nums){
        int ind = 0 ;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[ind] > nums[i]){
                ind = i ;
            }
        }
        return ind ;
    }
}
