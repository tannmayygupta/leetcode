public class CheckIfAll1sAreatLeastLengthKPlacesAway {
    public static void main(String[] args) {
        int[] nums = {0,1, 0,0,1,0,0,1};
        int k = 2 ;

        System.out.println(kLengthApart(nums, k));
    }

    // 1437. Check If All 1's Are at Least Length K Places Away

    static boolean kLengthApart(int[] nums, int k) {

        int couzero = 0;
        boolean first1 = false;
        for (int i = 0; i < nums.length; i++) {

            if(nums[i] == 1){
                first1 = true ;
            }

            if (first1) {
                if (nums[i] != 0) {
                    if (couzero < k && i > 0) {
                        return false;
                    }
                    couzero = 0;
                } else {
                    couzero++;
                }
            }

        }
        return true;
    }
}
