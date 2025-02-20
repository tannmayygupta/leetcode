public class Duplicate {

    public static void main(String[] args) {
        
        int nums[] = {1,1,2,2,3,3,4};
        int n = nums.length ;
        int ptr1 = 1 ;

        for(int ptr2 = 1 ; ptr2 < n  ; ptr2++){
            
            if(nums[ptr1 - 1] != nums[ptr2]){
                nums[ptr1] = nums[ptr2]; 
                ptr1++;
            }
        
        }
        return ptr1 ;

    }
    
}
