// leetcode que no. 33. Search in Rotated Sorted Array
// Link of que :
// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};

        int target = 0 ;

        int pivot = RBS(arr);
        
        int found = binaryS(arr, target, 0, pivot);

        if(found != -1){
            System.out.println(found);
        }
        else{
            System.out.println(binaryS(arr, target, pivot + 1, arr.length - 1));
        }
    }
    public static int binaryS(int[] arr, int target , int start , int end){
        
        while(start <= end){
            int mid = start + (end - start) / 2 ;

            if(arr[mid] == target){
                return mid ;
            }
            else if(arr[mid] > target){
                end = mid - 1 ;
            }
            else{
                start = mid + 1 ;
            }
        }
        return -1 ;

    }
    public static  int RBS(int[] arr){
        int start = 0 ;
        int end = arr.length -1 ;

        while(start <= end){
            int mid = start + (end - start) / 2 ;

            // 4 cases wirtten in yellow diary ultera tech

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid ;
            }
            
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1 ;
            }
            
            if(arr[start] >= arr[mid]){
                end = mid - 1;
            }
            
            else{
                start = mid + 1 ;
            }
        
        }
        return -1;
    }
}
