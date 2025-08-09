public class KthMissingPositiveNumber {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        int k = 2 ; 
        
    }

    public static int findKthPositive(int[] arr, int k) {

        int[] nums = new int[2001]; // whyy?? 2001 becoz if we take 1001 then for k = 732 ; and given so we take 2001

        for(int i = 0 ; i < arr.length ; i++){
            nums[arr[i]]++;
        }

        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] == 0){
                k--;
                if(k==0){
                    return i ;
                }
            }
        }
        

        return -1 ;
    }

}
