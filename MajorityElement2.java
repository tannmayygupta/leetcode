import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElement2 {
    public static void main(String[] args) {
        // int[] nums = {3,2,3} ;

        int[] nums = {1} ;

        Arrays.sort(nums);

        List<Integer> ele = new ArrayList<Integer>(); 

        int count = 1 ;
        int n = nums.length ;
        for(int i = 0 ; i < n - 1 ; i++){
            if(nums[i] != nums[i+1]){
                count = 1 ;
            }
            else{
                count++;
                if(count >= Math.round(n/3)){
                    ele.add(nums[i]);
                }
            }
        }

        System.err.println(ele);
    }
}
