import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class KFrequentElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {1,1,1,2,2,3};
        int k = 2 ;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
    public static int[] topKFrequent(int[] nums, int k) {

        int[] arr = new int[20001];

        for(int i = 0 ; i < nums.length ; i++){
            arr[nums[i]+10000]++;
        }

        ArrayList<Integer> a1 = new ArrayList<>();
        // int[] a = new int[k];
        
        int n = 0 ;
        
        for(int m = 0 ; m < arr.length ; m++){
            // a[m] = ans.get(m);
            if(arr[m] >= k){
                a1.add(m+10000);
            }
        }

        int[] a = new int[k];

        return  a ;
    }
}
