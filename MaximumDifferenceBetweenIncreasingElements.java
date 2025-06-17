public class MaximumDifferenceBetweenIncreasingElements {
    public static void main(String[] args) {
        int[] nums = {9,4,3,2};

        System.out.println(maximumDifference(nums));
    }
    public static int maximumDifference(int[] nums) {

        int max =  -1 ;

        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i + 1 ; j < nums.length ; j++){
                int diff = nums[j] - nums[i];
                if(max < diff){
                    max = diff ;
                }
            }
        }
        
        return max > 0 ? max : -1 ;
    }
}
