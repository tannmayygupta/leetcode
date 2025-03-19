public class CanPlaceFlower {
    public static void main(String[] args) {

        int[] arr = {1,0,0,0,1} ;

        int n = 2 ;

        boolean namm = canPlaceFlowers(arr, n);

        System.out.println(namm);
        
    }
    public static boolean canPlaceFlowers(int[] arr, int n) {

        int m = arr.length;

        if (m == 1) {
            if (arr[0] == 0 && n <= 1){
                return true;
            }
        }

        if (m >= 2 && arr[0] == 0 && arr[1] == 0) {
            arr[0] = 1;
            n = n - 1;
        }

        for (int i = 0; i < m - 2; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0 && arr[i + 2] == 0) {
                arr[i + 1] = 1;
                n--;
            }
        }

        if (m >= 2 && arr[m-2] == 0 && arr[m-1] == 0) {
            arr[m - 1] = 1;
            n = n - 1;
        }

        if (n <= 0) {
            return true;
        }

        return false;
    }
}