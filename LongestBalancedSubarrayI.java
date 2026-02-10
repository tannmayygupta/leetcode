import java.util.* ;

public class LongestBalancedSubarrayI{
    public static void main(String[] args){
        int[] nums = {3,2,2,5,4};
        System.out.println(longestBalanced(nums));
    }
    public static int longestBalanced(int[] nums) {

        // as constraints are lesss 

        int maxlength = -1 ;
        
        for(int i = 0 ; i < nums.length ; i++){
            int oddCou = 0 ;
            int evenCou = 0 ;
            HashSet<Integer> set = new HashSet<>();
            for(int j = i ; j < nums.length ; j++){

                if(!set.contains(nums[j])){
                    set.add(nums[j]);
                    if(nums[j] % 2 == 0){
                        evenCou++;
                    }else{
                        oddCou++;
                    }
                }

                if(oddCou == evenCou){
                    maxlength = Math.max(maxlength, (j - i + 1) );
                }
            }
        }

        return maxlength ;
    }
}