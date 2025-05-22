import java.util.ArrayList;
import java.util.List;

public class FindFirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {

        int arr[] = {5,7,7,8,8,10};

        int target = 8 ;

        int arr2[] = searchRange(arr, target);         

        for(int i = 0 ; i < arr2.length ; i++){
            System.out.println(arr2[i]);
        }
    }
        public static int[] searchRange(int[] arr, int target) {
            
            int n = arr.length - 1;
            int left = 0;
            int right = n - 1;
            int index = 0;
            int arr1[] = {-1,-1};
    
            while (left <= right) {
    
                int mid = (left + right) / 2;
    
                if (arr[mid] == target) {
                    arr1[0]= mid ;
                    right = mid - 1;
                } else if (arr[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
    
            left = 0;
            right = n - 1;
    
            while (left <= right) {
                int mid = (left + right) / 2;
    
                if (arr[mid] == target) {
                    arr1[1]= mid ;
                    left = mid + 1;
                } else if (arr[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
    
        return arr1 ;
    }
}
