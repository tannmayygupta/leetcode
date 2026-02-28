import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {
    public static void main(String[] args) {
        int[] nums2 = {1,3,4,2};
        int[] nums1 = {4,1,2};

        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }
    // https://leetcode.com/problems/next-greater-element-i/description/
    // 496. Next Greater Element I

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length ;
        int n2 = nums2.length ;

        int[] nextGrtforNums2 = nextGreaterElement2(nums2);

        HashMap<Integer , Integer> map = new HashMap<>();
        // why map not list coz list take more time to retrive 
        // map finds element in o(1)

        for(int i = 0 ; i < n2 ; i++){
            map.put(nums2[i] , i);
        }

        for(int i = 0 ; i < n1 ; i++){
            int index = map.get(nums1[i]);
            // above line will give the index of elment of subset in set(nums2)
            nums1[i] = nextGrtforNums2[index];
        }
        return nums1 ;
    }

    public static int[] nextGreaterElement2(int nums[]){
        int n = nums.length ;
        int[] ans = new int[n];

        Arrays.fill(ans,-1);

        Stack<Integer> stk = new Stack<>();

        for(int i = n - 1 ; i >= 0 ; i--){
            int element = nums[i] ;
            
            while(!stk.empty() && stk.peek() < element){
                stk.pop();
            }

            if(!stk.empty()){
                ans[i] = stk.peek();
            }

            stk.push(nums[i]);
        }


        return ans ;
    }

}
