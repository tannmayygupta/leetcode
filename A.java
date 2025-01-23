public class A{
    public static void main(String[] args) {

        int nums[] = {0,0,0,1,1};
        
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                int m = i ;
                while(m < nums.length - 1){
                    int temp = nums[m+1];
                    nums[m+1]=nums[m];
                    nums[m] = temp ;
                    m++;
                }

            }
        }

        for(int j = 0 ; j<nums.length ; j++){
            System.err.println(nums[j]);
        }
        
    }

}