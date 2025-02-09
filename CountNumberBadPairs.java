public class CountNumberBadPairs {
    public static void main(String[] args) {

        int[] nums = {4,1,2,3};
        int count = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i + 1 ; j < nums.length ; j++){
                if(j - i != nums[j] - nums[i]){
                    count++ ;
                }
            }
        }
        // return count ;
    }
}
