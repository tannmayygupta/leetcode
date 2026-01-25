import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// 3819. Rotate Non Negative Elements
// https://leetcode.com/problems/rotate-non-negative-elements/description/
public class RotateNonNegativeElements {
    public static void main(String[] args) {
        int[] nums = {1,-2,3,-4} ;
        int k = 2 ;

        System.out.println(Arrays.toString(rotateElements(nums, k)));
    }

    public static int[] rotateElements(int[] nums, int k) {

        List<Integer> pos = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] >= 0){
                pos.add(nums[i]);
            }
        }

        List<Integer> posRot = new ArrayList<>();
        if(pos.size() == 0){
            return nums ;
        }
        k = k % pos.size() ;

        for(int i = k ; i < pos.size() ; i++){
            posRot.add(pos.get(i));
        }

        for(int i = 0 ; i < k ; i++){
            posRot.add(pos.get(i));
        }   

        int j = 0 ;   

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] >= 0){
                // pos.add(nums[i]);
                nums[i] = posRot.get(j);
                j++;
            }
        }


        return nums ;
          
    }
}
