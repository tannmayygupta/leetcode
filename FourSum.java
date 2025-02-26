import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum {
    public static void main(String[] args) {

        int[] nums = {1,0,-1,0,-2,2};

        int target = 0 ;

        System.out.println(fourSum(nums, target));
    
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> list = new HashSet<>();
        int n = nums.length ;
        for(int a = 0 ; a < n ; a++){
            for(int b = a + 1 ; b < n ; b++){
                for(int c = b + 1 ; c < n  ; c++){
                    for(int d = c + 1 ; d < n ; d++ ){
                        if(nums[a]+nums[b]+nums[c]+nums[d] == target && a!=b && a!=c && a!=d && b!=c && b!=d && c!=d ){
                            List<Integer> l = new ArrayList<>();
                            l.add(nums[a]);
                            l.add(nums[b]);
                            l.add(nums[c]); 
                            l.add(nums[d]);
                            Collections.sort(l);
                            list.add(l);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(list);
    }
}
