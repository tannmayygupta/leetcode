public class FindtheMiddleIndexinArray {
    public static void main(String[] args) {
        int[] nums = {1,4,3,5,8,9};

        int x = findMiddleIndex(nums);

        System.out.println(x);

        
    }
    public static int findMiddleIndex(int[] nums) {
            
            int midinx = -1 ;
    
            for(int i = 0 ; i < nums.length ; i++){
                midinx = sum(nums,i);
                if(midinx != -1){
                    break ;
                }
            }
    
            return midinx;
            
        }
    
        public static int sum(int[] nums, int m){
    
            int leftsum = 0 ; 
            
            int rightsum = 0 ;
            
            if(m == 0){
                int k = 1 ;
                while(k < nums.length){
                    rightsum += nums[k];
                    k++;
                } 
                if(leftsum == rightsum){
                    return m ;
                }
            }
            
            else if(m == nums.length -1){
                int mam = 0 ;
                while(mam < nums.length - 1){
                    leftsum += nums[mam];
                    mam++;
                } 
                if(leftsum == rightsum){
                    return m ;
                }
            }
            
            else{
                int tan = 0 ;
                int sam = m + 1 ;
                while(tan < sam - 1){
                    leftsum += nums[tan];
                    tan++;
                }
                while(sam  < nums.length){
                    rightsum += nums[sam];
                    sam++;
                } 
                if(leftsum == rightsum){
                    return m ;
                }
            }
            
            return -1 ;
        
    }
}
