import java.util.*;

public class MaximumValueofanOrderedTripletI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int nums[] = new int[n];

        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }

        long m = maximumTripletValue(nums);

        System.out.println(m);

        
    }
    public static long maximumTripletValue(int[] nums) {

        long maxValue = Integer.MIN_VALUE;

        for(int i = 0 ; i < nums.length - 2 ; i++){
            for(int j = i + 1 ; j < nums.length - 1 ; j++){
                for(int k = j + 1 ; k < nums.length ; k++){
                    long val = (long) (nums[i] - nums[j]) * nums[k];
                    maxValue = Math.max(maxValue,val);
                }
            }
        }

        if(maxValue > 0){
            return maxValue;
        }
        return 0 ;
    }
}
