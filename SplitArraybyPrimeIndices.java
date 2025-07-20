import java.util.Arrays;

public class SplitArraybyPrimeIndices {
    public static void main(String[] args) {

        int[] nums ={-462260177,-142373969,-305864676,-357426459};

        System.out.println(splitArray(nums));
        
    }
    // 3618. Split Array by Prime Indices
    public static long splitArray(int[] nums) {
        int n = nums.length ;
        long sum2 = nums[0] + nums[1] ;
        
        if(n < 2){
            return (long) Math.abs(sum2) ;
        }

        boolean[] arr = new boolean[n];

        Arrays.fill(arr,true);

        long sumA = 0 ;

        long sumB = 0 ;

        for(int i = 2 ; i < n || i <= (int) Math.ceil(Math.sqrt(n)) ; i++){
            if(arr[i]){
                sumA += nums[i] ;
                for(int j = i * i ; j < n ; j+=i){
                    sumB+=nums[j];
                    nums[j] = 0 ;
                    arr[j] = false ;
                }
            }
        }

        sumB = sumB + sum2 ;

        return (long) Math.abs(sumA - sumB);
        
    }
}
