public class MaxSumOfPairEqlToSumOfDigits {
    public static void main(String[] args) {
                int[] nums = {10,12,19,14} ;
                int n =  nums.length ;
                int[] sum = new int[n] ;
        
                for(int i = 0 ; i < n ; i++){
                    sum[i] = sumOfDigit(nums[i]);
                }
                int count = 0 ;
                // int index ;
                int maxSum = -1 ;
                for(int i = 0 ; i < n  ; i++){
                    int s = 0 ;
                    for(int j = i + 1 ; j < n ; j++){
                        if(sum[i] == sum[j]){
                            s = nums[i] + nums[j];
                            maxSum = Math.max(s, maxSum);
                        }
                    }
                }

                System.out.println(maxSum);

        }

        static int sumOfDigit(int a){
            int sum = 0 ;
            while(a > 0){
                int rem = a % 10 ;
                sum += rem ; 
                a = a/10 ;
            }
            return sum ;
        }
}
