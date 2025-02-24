import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {

        List<List<Integer>> list = new ArrayList<>();
        int[] nums = {-1,0,1,2,-1,-4};
        int n = nums.length ;
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
                        list.add(l);
                    }
                }
            }
        }
        System.out.println(list);
    }
}
