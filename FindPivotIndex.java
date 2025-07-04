public class FindPivotIndex {
    public static void main(String[] args) {

        // 724. Find Pivot Index 

        // https://leetcode.com/problems/find-pivot-index/solutions/

        int[] nums = {1,7,3,6,5,6};

        System.out.println(pivotIndex(nums));
        
    }

    public static int pivotIndex(int[] nums) {

        for(int i = 0 ; i < nums.length ; i++){
            int n1 = leftsum(nums , i);
            int n2 = rightsum(nums,i);

            if(n1 == n2){
                return i ;
            }
        }

        return -1;
        
    }

    public static int leftsum(int[] nums , int index){
        int sum = 0 ; 

        index = index - 1 ;

        while(index > 0){
            sum += nums[index];
            index--;
        }

        return sum ;
    }

    public static int rightsum(int[] nums , int index){
        int sum = 0 ; 

        index = index + 1 ;

        while(index < nums.length){
            sum += nums[index];
            index++;
        }

        return sum ;
    }

}
