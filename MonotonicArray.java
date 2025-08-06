public class MonotonicArray {
    // https://leetcode.com/problems/monotonic-array/description/
    // 896. Monotonic Array
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};

        System.out.println(isMonotonic(arr));
    }

    public static boolean isMonotonic(int[] arr) {
        int n = arr.length ;
        if(n == 1){
            return true;
        }
        int incre = 0 ;
        int decre = 0 ;

        int i = 0 ;
        while(i < n -1){
            if(arr[i] <= arr[i+1]){
                incre++;
            }
            i++;
        }

        int j = 0 ;
        while(j < n -1){
            if(arr[j] >= arr[j+1]){
                decre++;
            }
            j++;
        }

        if(incre == n - 1 || decre == n - 1){
            return true ;
        }

        return false ;
    }
}
