public class MinimumNumberofOperationstoMakeElementsinArrayDistinct {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,2,3,3,5,7};
        int x = minimumOperations(nums);
        System.out.println(x);
    }
    public static int minimumOperations(int[] nums) {

        int n = nums.length;

        int count = 0;

        for (int i = 0; i < n; i += 3) {
            if(HaveDuplicate(nums,i) == true){
                count++;
            }
        }

        return count;

    }

    public static boolean HaveDuplicate(int[] nums , int start ) {

        for (int i = start; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;

    }
}
