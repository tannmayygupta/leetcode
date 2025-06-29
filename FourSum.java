// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Set;

// public class FourSum {
//     public static void main(String[] args) {

//         int[] nums = {1,0,-1,0,-2,2};

//         int target = 0 ;

//         System.out.println(fourSum(nums, target));
    
//     }
//     public static List<List<Integer>> fourSum(int[] nums, int target) {
//         Set<List<Integer>> list = new HashSet<>();
//         int n = nums.length ;
//         for(int a = 0 ; a < n ; a++){
//             for(int b = a + 1 ; b < n ; b++){
//                 for(int c = b + 1 ; c < n  ; c++){
//                     for(int d = c + 1 ; d < n ; d++ ){
//                         if(nums[a]+nums[b]+nums[c]+nums[d] == target && a!=b && a!=c && a!=d && b!=c && b!=d && c!=d ){
//                             List<Integer> l = new ArrayList<>();
//                             l.add(nums[a]);
//                             l.add(nums[b]);
//                             l.add(nums[c]); 
//                             l.add(nums[d]);
//                             Collections.sort(l);
//                             list.add(l);
//                         }
//                     }
//                 }
//             }
//         }
//         return new ArrayList<>(list);
//     }
// }

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum{
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0 ;

        System.out.println(fourSum(nums,target));
    }


    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) return result;
        
        Arrays.sort(nums); 
        int n = nums.length;
        
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            for (int j = i + 1; j < n - 2; j++) {

                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                
                int left = j + 1;

                int right = n - 1;
                
                while (left < right) {
                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right]; 
                    
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        
                        left++;
                        right--;

                    } else if (sum < target) {
                        left++;
                        
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
}
}