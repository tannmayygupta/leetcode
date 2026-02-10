import java.util.Arrays;

public class TransformedArray {
    public static void main(String[] args) {
        int[] nums = {-10,5,2,4,5};
        System.out.println(Arrays.toString(constructTransformedArray(nums)));
    }
    public static int[] constructTransformedArray(int[] nums) {

        if(nums.length == 1){
            return nums ;
        }
        
        int[] ans = new int[nums.length];

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > 0){
                // move right 
                if( i + nums[i] < nums.length){
                    ans[i] = nums[nums[i] + i];
                }else{
                    int ind = ( nums[i] + i ) % nums.length ;
                    ans[i] = nums[ind];
                }

            }else if(nums[i] < 0){
                // ans[i] = nums[i];
                // move element left
                if( (int) i - Math.abs(nums[i]) >= 0 ){
                    ans[i] = nums[ i - Math.abs(nums[i]) ];
                }else{
                    int ind = nums.length - (((int) Math.abs(i - Math.abs(nums[i]))) % nums.length );
                    ans[i] = nums[ind];
                }

            }else{
                // 
                ans[i] = nums[i];
            }
        }

        return ans ;
    }
}
