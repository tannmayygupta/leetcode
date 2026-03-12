public class JumpGameII {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6,8,5,2,0,15,6,9,5};
        System.out.println(jump(nums, 0, 0));
        // output 2 ;
    }
    public static int jump(int[] nums , int jump, int currInd ) {
        int n = nums.length ;
        if(currInd >= n - 1){
            return jump ;
        }

        int mini = Integer.MAX_VALUE ;

        for(int i = 1 ; i <= nums[currInd] ; i++){
            // if(currInd )
            mini = Math.min(mini , jump(nums, jump+1, currInd+i));
        }

        return mini ;
    }
}
