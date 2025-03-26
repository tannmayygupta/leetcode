import java.util.ArrayList;
import java.util.List;

public class MinimumSizeOfSubarraySum{
    public static void main(String[] args) {

        // int[] nums = {2,3,1,2,4,3};
        // int target = 7 ;

        int minlength = Integer.MIN_VALUE;

        int[] nums = {1,4,4};
        int target = 4 ;

        int count = 0 ;

        // List<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++){
            int sum = 0 ;
            for(int j = i ; j < nums.length ; j++){
                sum+=nums[j];
                if(sum >= target){
                    minlength = Math.min(minlength , j - i + 1);
                }
            }
        }

        if(minlength != Integer.MIN_VALUE){
            System.out.println(minlength);
        }
        else{
            System.out.println("0");
        }

        // System.out.println(list);
        
    }
}
