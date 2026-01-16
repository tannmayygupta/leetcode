import java.util.HashMap;

public class NumberofCenteredSubarrays {
    public static void main(String[] args) {
        int[] nums = {0,1,1,-1};
        System.out.println(centeredSubarrays(nums));
    }
    // bruteforce approach
    public static int centeredSubarrays(int[] nums) {
        int cou = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            HashMap<Integer , Integer> map = new HashMap<>();
            int sum = 0 ;

            for(int j = i ; j < nums.length ; j++){
                if(map.containsKey(nums[j])){
                    int value = map.get(nums[i]);
                    map.put(nums[j],value + 1);
                }else{
                    map.put(nums[j],1);
                }

                sum+= nums[j];

                if(map.containsKey(sum)){
                    cou++;
                }

            }
        }
        return cou ;
    }

    // we cant think for an optimised solution for this question 
    public static int centeredSubarraysopti(int[] nums) {
        int cou = 0 ;
        HashMap<Integer , Integer> map = new HashMap<>();
        int sum = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                int val = map.get(nums[i]);
                map.put(nums[i],val+1);
            }else{
                map.put(nums[i],1);
            }

            sum+=nums[i];
        }
        return cou ;
    }
}
