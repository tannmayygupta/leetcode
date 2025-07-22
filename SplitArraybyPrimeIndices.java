import java.util.Arrays;

public class SplitArraybyPrimeIndices {
    public static void main(String[] args) {

        int[] nums ={-462260177,-142373969,-305864676,-357426459};

        System.out.println(splitArray(nums));
        
    }
    public static long splitArray(int[] nums) {

    //     int n = nums.length ; 
        
    //     if(n == 1 ){
    //         return (long) Math.abs(nums[0]);
    //     }

    //     long sum2 = nums[0] + nums[1] ;

    //     if(n == 2){
    //         return (long) Math.abs(sum2) ;
    //     }

    //     boolean[] isprime = new boolean[n];

    //     Arrays.fill(isprime,true);

    //     isprime[0]= false ;
        
    //     isprime[1]= false ;

    //     for(int i = 2 ; i <= Math.ceil(Math.sqrt(n)) ; i++){
    //         if(isprime[i]){
    //             for(int j = i * i ; j < n ; j+=i){
    //                 isprime[j] = false ;
    //             }
    //         }
    //     }

    //     long sumA = 0 ;

    //     long sumB = 0 ;

    //     for(int i = 0 ; i < n ; i++){
    //         if(isprime[i]){
    //             sumA+=nums[i];
    //         }
    //         else{
    //             sumB+=nums[i]; 
    //         }
    //     }

    //     return (long) Math.abs(sumA - sumB);

        // sieves thoda complicate kar diya mai 

        int n = nums.length ;
        
        long sum2 = nums[0] + nums[1] ;
        
        if(n == 1 ){
            return (long) Math.abs(nums[0]);
        }
        if(n == 2){
            return (long) Math.abs(sum2) ;
        }

        boolean[] arr = new boolean[n];

        Arrays.fill(arr,true);

        long sumA = 0 ;

        long sumB = 0 ;

        for(int i = 2 ; i < n ; i++){
            if(arr[i]){
                sumA += nums[i] ;
                for(long j =(long) i * i ; j < n ; j+=i){
                    int ind = (int) j;
                    sumB += (long) nums[ind] ;
                    nums[ind] = 0 ;
                    arr[ind] = false ;
                }
            }
        }

        sumB = sumB + sum2 ;

        return (long) Math.abs(sumA - sumB);
        
    }
}
