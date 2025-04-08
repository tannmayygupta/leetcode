public class MaximumValueofanOrderedTripletII {
    public static void main(String[] args) {
        int[] nums = {12,6,1,2,7};
        long x = maximumTripletValue(nums);
        System.out.println(x);
    }
    public static long maximumTripletValue(int[] nums) {
            long answer = 0 ;
            int diffMax = 0 ;
            int value = 0 ;
    
            for(int i = 0 ; i < nums.length ; i++){
                answer = Math.max(answer, (long) nums[i]*diffMax);
                diffMax = Math.max(diffMax , value - nums[i]);
                value = Math.max(value, nums[i]);
            }
    
            return answer ;
    
    }
}
