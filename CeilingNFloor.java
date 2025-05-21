public class CeilingNFloor{
    public static void main(String[] args) {
        
    }
    public static int Ceil(int[] arr , int target){
        // ceil means that smallest number that greater or equal to the target

        int start = 0 ;
        int end = arr.length - 1 ;

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
        return start ;
    }

    public static int Floor(int[] arr , int target){
        // Floor means that greatest number that smaller or equal to the target
        int start = 0 ;
        int end = arr.length - 1 ;

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
        return end ;
    }

}