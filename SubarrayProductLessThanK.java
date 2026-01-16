public class SubarrayProductLessThanK {
    // 713. Subarray Product Less Than K
    public static void main(String[] args) {
        int[] nums = {10,5,2,6};
        int k = 100;
    }
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int product = 1 ;
        int j = 0 ;
        int ans = 0 ; 

        if(k <= 1){
            return 0 ; 
        }

        // this expand the window till the condition of window get true
        for(int i = 0 ; i < nums.length ; i++){
            product = product * nums[i];

            // if we get the window holding thw condtion we shrik the window
            while(product >= k){
                product = product / nums[j] ;
                j++;
            }
            ans = ans + i - j + 1 ;
        }

        return ans ;
    }
}
