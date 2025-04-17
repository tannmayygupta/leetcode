public class CountEqualandDivisiblePairsinanArray {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        int k = 1 ; 

        int x = countPairs(nums, k);

        System.out.println(x);
        
    }
    public static int countPairs(int[] nums, int k) {
            int count = 0 ;
            for(int i = 0 ; i < nums.length - 1 ; i++){
                for(int j = i+1 ; j < nums.length ; j++){
                    if((nums[i] == nums[j]) && ((i*j) % k == 0)){
                        count++;
                    }
                }
            }
    
        return count;
    }
}
