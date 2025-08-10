public class FindtheArrayConcatenationValue {
    // 2562. Find the Array Concatenation Value
    // https://leetcode.com/problems/find-the-array-concatenation-value/description/
    public static void main(String[] args) {
        int[] nums = {5,14,13,8,12};

        System.out.println(findTheArrayConcVal(nums));
        
    }
    
    public static long findTheArrayConcVal(int[] nums) {

        int i = 0 ;
        int j = nums.length -1 ;
        long concat = 0 ;

        while(i <= j){
            if(i == j){
                concat += nums[i] ;
            }

            concat += nums[i] * Math.pow(10,digit(nums[j])) + nums[j] ;
            i++;
            j--;
        }
        
        return concat ;
    }

    static int digit(int m){
        int count = 0 ; 

        while(m > 0){
            m = m / 10 ;
            count++;
        }

        return count ;
    }
}
