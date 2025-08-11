public class MostFrequentNumberFollowingKeyInanArray {
    public static void main(String[] args) {

        int[] nums = {1,1000,2};

        int key = 1000;

        System.out.println(mostFrequent(nums, key));
        
    }

    public static int mostFrequent(int[] nums, int key) {
        int max = 0 ;
        int maxtar = 0 ;
        for(int i = 0 ; i < nums.length - 1 ; i++){
            if(nums[i] == key){
                int cou = 0 ;
                int target = nums[i+1] ;
                cou = 1 ;
                for(int j = i + 2 ; j < nums.length ; j++){
                    if(target == nums[j]){
                        cou++;
                    }
                    if(max < cou ){
                        max = cou ;
                        maxtar = nums[j];
                    }
                }
            }
        }

        return maxtar ;
        
    }

}
