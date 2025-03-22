public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        boolean b = increasingTriplet(nums);

        System.out.println(b);
    }

    public static boolean increasingTriplet(int[] nums) {
        if(nums.length < 3){
            return false ;
        }
        int flag = 0 ;
        for(int i = 0 ; i < nums.length - 2 ; i++){ //n 
            for(int j = i+1 ; j < nums.length - 1 ; j++){ //n
                for(int k = j+1 ; k < nums.length ; k++){ // n O(n^3)
                    if(nums[i] < nums[j] && nums[j] < nums[k]){
                        // flag = 1 ;
                        // break ;
                        return true ;
                    }
                }
            }
        }
        return false ; 
    }
}



