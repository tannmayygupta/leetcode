public class MaxSubArray {
    public static void main(String[] args){

        int nums[] = {4, 3, 1, 5, 6};
        int maxSum = Integer.MIN_VALUE;
        int preSum = Integer.MIN_VALUE;

        for(int i = 0 ; i < nums.length ; i++){
            int curSum = 0 ;
            for(int j = i ; j < nums.length ; j++){
                curSum += nums[j];
                maxSum = max(curSum , maxSum);
            }
        }
        System.out.println(maxSum);
        System.out.println(preSum);
    }
    static int max(int curSum , int maxSum){
        if(curSum > maxSum){
            return curSum ;
        }
        else{
            return maxSum ;
        }
    }
}
