public class KthLargestElementinanArray {

    // 215. Kth Largest Element in an Array
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        
        int k = 2;
        
        System.out.println(findKthLargest(nums, k));

    }
    public static int findKthLargest(int[] nums, int k) {
        // frwuency approach but it usses extra space
        int[] arr = new int[20001]; // firstly i made this freq arr of 10000 i thought that contraent is poristve
        // nut for nehative 10000 number increse it by 1000 so 2001 including 0 ;

        for(int i = 0 ; i < nums.length ; i++){
            arr[nums[i] + 10000]++;
        }

        for(int i = arr.length - 1 ; i >= 0 ; i--){
            k-=arr[i];
            if(k<=0){
                return i - 10000 ;
            }
        }

        return  0 ;
    }

    // m1 sorting but ques says not to use sorting 

    // public int findKthLargest(int[] nums, int k) {
    //     Arrays.sort(nums);

    //     return nums[nums.length - k];
    // }
}
