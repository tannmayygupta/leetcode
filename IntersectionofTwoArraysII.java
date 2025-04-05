import java.util.ArrayList;
import java.util.List;

public class IntersectionofTwoArraysII {
    public static void main(String[] args) {
       int[] nums1 = {1,2,2,1};
       int[] nums2 = {2,2}; 
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();

        boolean[] a = new boolean[nums2.length];

        for(int i = 0 ; i < nums1.length ; i++){
            for(int j = 0 ; j < nums2.length ; j++){
                if(nums1[i] == nums2[j] && !a[j]){
                    list.add(nums1[i]);
                    a[j] = true;
                    break;
                }
            }
        }

        int[] ans = new int[list.size()];

        for(int i = 0 ; i < list.size() ; i++){
            ans[i] = list.get(i);
        }

        return ans ;
        
    }
}
