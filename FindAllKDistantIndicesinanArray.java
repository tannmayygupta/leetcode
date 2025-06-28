import java.util.*;

public class FindAllKDistantIndicesinanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] nums = {3,4,9,1,3,9,5};

        int key = sc.nextInt() ;

        int k = sc.nextInt() ;

        System.out.println(findKDistantIndices(nums, key, k));
    }

    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {

        List<Integer> ans = new ArrayList<>();


        for(int i = 0 ; i < nums.length ; i++){
            for(int j = 0 ; j < nums.length ; j++){
                int n1 = Math.abs(i - j);

                if(n1 <= k && key == nums[j]){
                    ans.add(i);
                    // duplicate aa rahe the i ke toh vo loop ko break karne ke liye
                    break; 
                }

            }
        }
        
        return ans ;
    }
}
