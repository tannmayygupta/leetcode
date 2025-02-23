public class RemoveElement27 {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int value = 3 ;
        int a = removeElement(nums,value);
        System.out.println(a);
        
    }
    // class Solution {
        public static int removeElement(int[] nums, int val) {
            // List<Integer> list = new ArrayList<Integer>();
            int count = 0 ;
            for(int i = 0 ; i < nums.length ; i++){
                if(nums[i] != val){
                    // list.add(nums[i]);
                    nums[count]=nums[i];
                    count++;
                }
            }
            return count ;
        }
    // }
}
