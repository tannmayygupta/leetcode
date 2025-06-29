public class HowManyNumbersAreSmallerThantheCurrentNumber {
    public static void main(String[] args) {
        
        int[] nums = {8,1,2,2,3};

        System.out.println(smallerNumbersThanCurrent(nums));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        // what i am thinking is of 2 pointer approach for this

        int[] arr = new int[nums.length];
        
        for(int i = 0 ; i < nums.length ; i++){

            arr[i] = smallElement(i,nums);
            
        }

        return arr ;
    }
    public static int smallElement(int n , int[] nums){
        int st = n ; 

        int end = n ;

        int count = 0 ;

        while(st >= 0){
            if(nums[n] > nums[st] ){
                count++;
            }
            st--;
        }

        while(end < nums.length ){
            if(nums[n] > nums[end] ){
                count++;
            }
            end++;
        }

        return count ;

    }
}
