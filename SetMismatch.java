import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMismatch {
    public static void main(String[] args) {
        
        int[] arr = {1,2,2,4} ;

        System.out.println(Arrays.toString(findErrorNums(arr)));
        
    }
    public static int[] findErrorNums(int[] arr) {

        List<Integer> ans = new ArrayList<>();
        // plicated to another number in the set, which results in repetition of one number and loss of another number.
        // as this is said only one repeated and on loss number so there will be return of array of length 2
        // so list not required 

        int i = 0 ; 
        while(i < arr.length){
            if(arr[i] != arr[arr[i] - 1]){
                    int ind = arr[i] - 1 ;
                    int temp = arr[i];
                    arr[i] = arr[ind];
                    arr[ind] = temp ; 
                }else{
                    i++;
            }    
        }
    
        for(int j = 0 ; j < arr.length ; j++ ){
            if(arr[j] != j+1){
                // ans.add(nums[i]);
                // ans.add(i+1);
                return new int[] {arr[j], j+1};
            }
        }
        
        return new int[] {-1,-1};  

    }   
}
