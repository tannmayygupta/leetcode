import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {

        Set<List<Integer>> list = new HashSet<>();
        
        int[] nums = {-1,0,1,2,-1,-4};
        int n = nums.length ;
        Arrays.sort(nums); // as the output where assending order in leetcode :))))))
        
        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1 ; j < n ; j++){
                // List l = new ArrayList<>();
                for(int k = j + 1 ; k < n ; k++){
                    // System.out.println(i+" "+j+" "+k);
                    if(nums[i] + nums[j] + nums[k] == 0 && i!=j && i!=k && j!=k ){
                        // System.out.println(i+" "+j+" "+k);
                        // l.add(nums[i],nums[j],nums[k]); // cant pass 3 elemnt to add 
                        List<Integer> l = new ArrayList<>();
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[k]);
                        // for unique list of three
                        Collections.sort(l); // this will sort all list of three in asencing order so that the next main list added is ignore                        
                        list.add(l); // need to change main list to set such that the duplicate 
                    }
                }
            }
        }

        System.out.println(list);
    }
}
