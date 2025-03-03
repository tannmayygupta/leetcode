public class PartitionArrayAccordingtoGivenPivot {
    public static void main(String[] args) {

        int[] arr = {9,12,5,10,14,3,10};

        int pivot = 10 ;

        int[] arr1 = pivotArray(arr, pivot) ;
        
        for(int i = 0 ; i < arr1.length ; i++){
            System.out.println(arr1[i]);
        }
        
    }

    public static int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length ;

        int[] arr = new int[n];

        int index = 0 ;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] < pivot){
                arr[index++] = nums[i];
            }
        }

        for(int i = 0 ; i < n ; i++){
            if(nums[i] == pivot){
                arr[index++] = nums[i];
            }
        }

        for(int i = 0 ; i < n ; i++){
            if(nums[i] > pivot){
                arr[index++] = nums[i];
            }
        }

        return arr ;

    }
}
