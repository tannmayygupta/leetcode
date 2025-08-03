import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesinanArray {
    public static void main(String[] args) {
        
        int[] nums = {4,3,2,7,8,2,3,1};

        System.out.println(findDuplicates(nums));
        System.out.println(findDuplicates1(nums));

    }
    
    public static List<Integer> findDuplicates1(int[] nums) {


        // m1 cyclic sort 
        List<Integer> ans = new ArrayList<>();
                
        int i = 0 ;

        while(i < nums.length ){
            if(nums[i] != i + 1){
                if(nums[i] != nums[nums[i] - 1]){
                    int ind = nums[i] - 1 ;
                    int temp = nums[ind];
                    nums[ind] = nums[i];
                    nums[i] = temp ;
                }else{
                    if(!ans.contains(nums[i])){ // this addeds the duplicate elements in the list but when we check na 
                                                // by contains wala method it its complexity in n this makes O(n^2)
                        ans.add(nums[i]);
                    }
                    i++;
                }
            }else{
                i++;
            }
        }

        return ans ;
        
    }

    public static List<Integer> findDuplicates(int[] nums) {


        // m1 cyclic sort 
        List<Integer> ans = new ArrayList<>();
                
        int i = 0 ;

        while(i < nums.length ){
            if(nums[i] != nums[nums[i] - 1]){
                    int ind = nums[i] - 1 ;
                    int temp = nums[ind];
                    nums[ind] = nums[i];
                    nums[i] = temp ;
            }else{
                i++;
            }
        }

        for(int j = 0 ; j < nums.length ; j++){
            if(nums[j] != j + 1){
                ans.add(nums[j]);
            }
        }

        return ans ;
        
    }
}
