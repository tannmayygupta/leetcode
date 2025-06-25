import java.util.Arrays;


public class KthSmallestProductofTwoSortedArrays {

    public static void main(String[] args) {

        int nums1[] = {-100000,100000};

        int nums2[] = {-100000,100000};

        long k = 1 ;

        System.out.println(kthSmallestProduct(nums1,nums2,k));
    }
    
    public static long kthSmallestProduct(int[] nums1, int[] nums2, long k) {

        long[] n1 = new long[nums1.length * nums2.length];

        int c = 0 ;

        for(int i = 0 ; i < nums1.length ;i++){
            for(int j = 0 ; j < nums2.length ; j++){
                n1[c] = (long) nums1[i] * nums2[j];
                c++; 
            }
        }

        Arrays.sort(n1);

        return (long) n1[(int) k - 1];
        
    }
}
