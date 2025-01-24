public class Nextpermutation {
    public static void main(String[] args) {
        int arr[] = {2,4,1,7,5,0};
        int n =  arr.length ; // 6
        int pivot = -1;

        for(int i = n - 1 ; i > 1 ; i--){ 
            if(arr[i - 1] < arr[i]){
                pivot = i - 1 ; 
                break ;
            }   
        }

        if(pivot == -1){
            reverse(arr, 0, n - 1);
        }

        for(int j = n - 1 ; j > pivot ; j--){
            if(arr[j] > arr[pivot]){
                swap(arr, j , pivot ) ;
                break;
            }
        }

        reverse(arr,pivot + 1, n - 1);

    }

    static void reverse(int arr[] , int pivot , int n){
        while(pivot < n ){
            swap(arr, pivot++, n--);
        }
    }

    static void swap(int arr[] , int m , int n ){
        int swap ;
        swap = arr[m];
        arr[m] = arr[n];
        arr[n] = swap ;
    }
}