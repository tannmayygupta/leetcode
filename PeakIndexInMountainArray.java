public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,1,0};

        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        // to revise this ques
        // see your ultratech yellow diary (ulti dairy me piche meh)
        int start = 0 ;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2 ;

            if(arr[mid] > arr[mid+1]){
                // means we are in decreasing part of array
                // we will change our end pointer to 
                end = mid ;
            }
            else{
                // means we are in increasing/ ascending part of array 
                start = mid + 1;
            }

            // this loop will end we will 
        }

        return start ;   
    }
}
