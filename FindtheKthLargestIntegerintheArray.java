import java.util.Arrays;

public class FindtheKthLargestIntegerintheArray {
    public static void main(String[] args) {
        String[] nums = {"3","6","7","10"};
        
        int k = 4 ;

        System.out.println(kthLargestNumber(nums,k));
    
    }
    public static String kthLargestNumber(String[] nums, int k) {

        int[] arr = new int[nums.length];

        for(int i = 0 ; i < nums.length ; i++){
            arr[i] = Integer.parseInt(nums[i]);
        }        

        Arrays.sort(arr);

        return String.valueOf(arr[arr.length - k]);
    }
}
