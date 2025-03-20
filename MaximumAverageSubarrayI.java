public class MaximumAverageSubarrayI {
    public static void main(String[] args) {

        int nums[] = {1,12,-5,-6,50,3};
        int k = 4 ;
        double maxAvg = Integer.MIN_VALUE ;
        
        for(int i = 0 ; i <= nums.length - k ; i++){
            int sum = 0 ;
            for(int j = i ; j < i+k ; j++){
                // System.out.println(" "+j);
                sum += nums[j];
            }
            double avg = (double) sum / k ;
            maxAvg = Math.max(avg,maxAvg);
            // System.out.println();
        }

        System.out.println(maxAvg);
    }
}
