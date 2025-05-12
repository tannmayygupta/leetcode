public class CountSubarraysofLengthThreeWithaCondition {
    public static void main(String[] args) {
        int nums[] = {1,1,1};
        // int sum = 0 ;
        int mid = 0 ;
        int count = 0 ;
        for(int i = 0 ; i < nums.length - 2 ; i++){
            int sum = 0 ;
            for(int j = i ; j < i + 3 ; j++){
                if(j != i+1){
                    sum += nums[j];
                }
                else{
                    mid = nums[j];
                }
            }
            if(mid == 2*sum){
                count++;
            }
        }
        System.out.println(count);
    }
}