public class MissingNumber {
    public static void main(String[] args) {

        int[] nums = {3,0,1};

        System.out.println(missingNumber(nums));
        
        
    }
    // method 2 without sorting using maths 

    public static int missingNumber(int[] nums) {
        int n = nums.length ;
        int sum = ( n * (n + 1) ) / 2 ;

        int sum1 = 0 ;

        for(int i = 0 ; i < n ; i++){
            sum1 += nums[i] ;
        } 

        return sum - sum1 ;
    }
    


    // done with sorting #m1 

    // public int missingNumber(int[] nums) {
    //    Arrays.sort(nums);
    //    int i = 0 ;
    //    while(i < nums.length){
    //     if(nums[i] != i){
    //         break;
    //     }
    //     i++;
    //    } 
       
    //    return i ;
    // }
}
