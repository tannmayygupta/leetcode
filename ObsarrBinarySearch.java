public class ObsarrBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,6,8,70,80,90};
        int target = 90 ;

        System.out.println(BinarySearch(arr, target));


    }
    public static int BinarySearch(int[] arr , int target){
        int start = 0 ;
        int end = arr.length - 1 ;

        boolean isass = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start)/ 2 ;

            if(target == arr[mid]){
                return mid ;
            }

            if(isass){
                if(target > arr[mid]){
                    start = mid +1 ;
                }
                else{
                    end = mid - 1 ;
                }
            }
            else{
                if(target < arr[mid]){
                    start = mid +1 ;
                }
                else{
                    end = mid - 1 ;
                }
            }
        }
        return -1 ;
    }
}
