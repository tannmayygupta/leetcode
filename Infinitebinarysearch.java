public class Infinitebinarysearch{
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,115,140};

        int target = 10 ;
        
        System.out.println(findingrange(arr, target));
        
    }
    public static int infinitebinarysearch(int[] arr, int target, int start, int end){

        while(start <= end){

            int mid = start + (end - start)/ 2 ;

            if(target == arr[mid]){
                return mid ;
            }
            else if(target > arr[mid]){
                start = mid +1 ;
            }
            else{
                end = mid - 1 ;
            }
        }
        return -1 ;

    }
    public static int findingrange(int[] arr, int target){
        int start = 0 ;
        int end = 1;

        while(target > arr[end]){
            int temp = end + 1 ;
            // double the range 
            // end = end + sizeofbox(end - start + 1) * 2

            end = end + (end - start + 1) * 2 ;
            start = temp ;
        }

        return infinitebinarysearch(arr, target, start, end);
    }
}
