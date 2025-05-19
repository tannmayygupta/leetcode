import java.util.Arrays;

public class TypeofTriangle {
    public static void main(String[] args) {
        
    }
    public String triangleType(int[] nums) {

        Arrays.sort(nums);

        if (nums[0] <= 0 || nums[1] <= 0 || nums[2] <= 0) {
            return "none";
        } else if (nums[0] + nums[1] <= nums[2] || nums[0] + nums[2] <= nums[1] || nums[2] + nums[1] <= nums[0]) {
            return "none";
        }
        else if (nums[0] == nums[1] && nums[1] == nums[2]) {
            return "equilateral";
        } else if (((nums[0] == nums[1]) && (nums[0] != nums[2])) || ((nums[1] == nums[2]) && (nums[1] != nums[0]))) {
            return "isosceles";
        }
        else{
            return "scalene" ;
        }

        // if(nums[0] == nums[1] && nums[1] == nums[2]){
        //     return "equilateral";
        // }
        // else if(( (nums[0] == nums[1])) || ((nums[1] == nums[2])){
        //     return "isosceles";
        // }
        // else if(nums[0] + nums[1] > nums[2] && nums[0] + nums[2] > nums[1] && nums[1] + nums[2] > nums[0] )
        // return "scalene";
        // else{
        //     return "none";
        // }
    }
}
