import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(
            findDisappearedNumbers(nums)
        );
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        boolean[] arr = new boolean[nums.length + 1];

        for(int i = 0 ; i < nums.length ; i++){
            arr[nums[i]] = true ; 
        }

        for(int i = 1 ; i < arr.length ; i++){
            if(!arr[i]){
                ans.add(i);
            }
        }

        return ans ;
    }
}
