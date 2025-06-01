import java.util.ArrayList;
import java.util.List;

public class DecompressRunLengthEncodedList{
    public static void main(String[] args) {

        int[] nums = {1,2,3,4};

        int[] a = decompressRLElist(nums);

        for(int i = 0 ; i < nums.length ; i++){
            System.out.println(a[i]);
        }

        
    }
    public static int[] decompressRLElist(int[] nums) {

        List<Integer> ans = new ArrayList<Integer>();

        for(int i = 0 ; i < nums.length - 1 ; i=i+2){
            int a = nums[i] ;
            int b = nums[i+1];
            while(a != 0){
                ans.add(b);
                a--;
            }

        }
        int arr[] = new int[ans.size()];
        for(int j = 0 ; j < ans.size() ; j++){
            arr[j] = ans.get(j);
        }

        return arr ;
        
    }
}