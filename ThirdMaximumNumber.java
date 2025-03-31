import java.util.Arrays;
import java.util.HashSet;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int nums[] = {3,2,1};

        int x = thirdMax(nums);

        System.out.println(x);
        
    }
    public static int thirdMax(int[] nums) {
        
        Arrays.sort(nums);

        if (nums.length < 3 && nums.length == 2) {
            return nums[1];
        }
        else if (nums.length < 3 && nums.length == 1) {
            return nums[0];
        }

        HashSet<Integer> sett = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            sett.add(nums[i]);
        }
        
        Integer[] nums1 = sett.toArray(new Integer[0]);

        Arrays.sort(nums1);

        if (nums1.length >= 3) {
            return nums1[nums1.length - 3];
        } else {
            return nums1[nums1.length - 1]; 
        }
    }
}
