public class CountNumberOfPairsWithAbsoluteDifferenceK {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1};
        int k = 1;
        int x = countKDifference(nums, k);

        System.out.println(x);
    }
    public static int countKDifference(int[] nums, int k) {
    
            int count = 0 ;
    
            for(int i = 0 ; i < nums.length ; i++){
                for(int j = i + 1 ; j < nums.length ; j++ ){
                    if( Math.abs(nums[i] - nums[j]) == k){
                        count++;
                    }
                }
            }
            
            return count ;
    }
}
