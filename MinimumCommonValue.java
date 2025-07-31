public class MinimumCommonValue {
    public static void main(String[] args) {

        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4};

        System.out.println(getCommon(nums1, nums2));
        
    }
    public static int getCommon(int[] nums1, int[] nums2) {

        int ptr1 = 0 ;
        int ptr2 = 0 ;

        while(ptr1 < nums1.length && ptr2 < nums2.length){
            
            if(nums1[ptr1] == nums2[ptr2]){
                return nums1[ptr1];
            }
            
            if(nums1[ptr1] < nums2[ptr2]){
                ptr1++;
            }
            else{
                ptr2++;
            }
        }

        return -1 ;
        
    }
}
