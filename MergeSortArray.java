import java.util.Arrays;

public class MergeSortArray {
    public static void main(String[] args) {
        
    }
    // class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ind = 0 ;
        for(int i = m ; i < m+n ; i++){
            nums1[i] = nums2[ind];
            ind++;
        }
        Arrays.sort(nums1);
        System.out.println(nums1);
    // }
    }
}
