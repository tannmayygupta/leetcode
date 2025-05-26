public class FindMinimuminRotatedSortedArray {
    public static void main(String[] args) {

        int[] arr = {3,4,5,1,2};

        System.out.println(findMin(arr));
        
    }
    public static int findMin(int[] arr) {
        int found = RBS(arr);

        if(found != -1){
            return found ;
        }
        else{
            return arr[0];
        }
    }

    public static int RBS(int[] arr){
                
        int start = 0 ;
        
        int end = arr.length -1 ;

        while(start <= end){
            int mid = start + (end - start) / 2 ;

            // 4 cases wirtten in yellow diary ultera tech

            if(mid < end && arr[mid] > arr[mid + 1]){
                return arr[mid + 1] ;
            }
            
            if(mid > start && arr[mid] < arr[mid - 1]){
                return arr[mid] ;
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
