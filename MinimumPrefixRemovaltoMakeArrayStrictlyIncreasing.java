public class MinimumPrefixRemovaltoMakeArrayStrictlyIncreasing {
    public static void main(String[] args) {
        int[] nums = {1,-1,2,3,3,4,5};

        System.out.println(minimumPrefixLength(nums));
    }
    public static int minimumPrefixLength(int[] nums) {
        
        int flag = 0 ;
        int idx = -1 ;
        for(int i = nums.length - 1 ; i > 0 ; i--){
            if(nums[i] <= nums[i-1]){
                flag = 1 ;
                idx = i ;
                break ;
            }
        }

        if(flag == 1){
            return idx ;
        }
        return 0 ;
    }
}
