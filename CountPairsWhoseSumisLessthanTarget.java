//https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/
//2824. Count Pairs Whose Sum is Less than Target

import java.util.List;
import java.util.*;

public class CountPairsWhoseSumisLessthanTarget {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);

    }  
    public int countPairs(List<Integer> nums, int target) {
        int cou = 0 ;

        for(int i = 0 ; i < nums.size() ; i++ ){
            for(int j = i + 1 ; j < nums.size() ; j++){
                if(nums.get(i) + nums.get(j) < target){
                    cou++;
                }
            }
        }

        return cou ;
    }
}
