import java.util.Arrays;

public class SquaresofaSortedArray {
    public static void main(String[] args) {

        int[] nums = {-4,-1,0,3,10};

        System.out.println(sortedSquares(nums).toString());

    }
    public static int[] sortedSquares(int[] nums) {


        for(int i = 0 ; i < nums.length ; i++){
            int n = nums[i] * nums[i];
            nums[i] = n ;
        }

        Arrays.sort(nums);
        

        return nums ;
    }

}
