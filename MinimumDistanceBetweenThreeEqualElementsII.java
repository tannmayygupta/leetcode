import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
// 3741. Minimum Distance Between Three Equal Elements II

// https://leetcode.com/problems/minimum-distance-between-three-equal-elements-ii/

public class MinimumDistanceBetweenThreeEqualElementsII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = {2,3,5,4,8,8,8,1,4,7,5,7,5,9,1,5,9,1,2,64,8,4};

        System.out.println(minimumDistance(nums));

    }

    public static int minimumDistance(int[] nums) {

        Map< Integer , List<Integer> > maping = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++ ){
            // i was using wrong == maping.containKeys(nums[i])
            // corrcet syntax mapping.containsKey(nums[0])  

            if(maping.containsKey(nums[i])){
                // as we do ",get" we get the value for the key (nums[i]) 
                // where value we want to store in the form of list so we go add
            
                maping.get(nums[i]).add(i);
            
            }
            else{
                maping.put(nums[i], new ArrayList<>() );
                maping.get(nums[i]).add(i);
            }
        }

        int ans = Integer.MAX_VALUE ;


        // this for loop gives tle as we iterate till nums.legth

        // for(int i = 0 ; i < nums.length ; i++ ){
        //     List<Integer> list = maping.get(nums[i]);
        //     if(list.size() >= 3){
        //         ans = Math.min(ans , cal(list));
        //     }
        // }


        // but this loop helps in little optimization as iteration reduse to 
        
        // why we do keySet() so that we get the set of for map so that its easy to iterate

        for(int key : maping.keySet() ){
            List<Integer> list = maping.get(key);
            if(list.size() >= 3){
                ans = Math.min(ans , cal(list));
            }
        }

        if(ans == Integer.MAX_VALUE){
            return -1 ;
        }

        return ans ;
    }

    static int cal(List<Integer> list){
        int ans = Integer.MAX_VALUE;
        // int list number are sotred in index for and they dont chanfge as they change in map, sets

        for(int i = 1 ; i < list.size() - 1 ; i++){
            int dif1 = list.get(i) - list.get(i-1);
            int dif2 = list.get(i+1) - list.get(i);
            int dif3 = list.get(i+1) - list.get(i-1);
            int sum = dif1 + dif2 + dif3 ;
            ans = Math.min(sum , ans); 
        }

        return ans ;
    }
}
