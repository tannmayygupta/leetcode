public class ThreeConsecutiveOdds {
    public static void main(String[] args) {
        int arr[] = {1,5,3,6,9,2};

        boolean x = threeConsecutiveOdds(arr);

        System.out.println(x);

    }
    public static boolean threeConsecutiveOdds(int[] arr) {

        int flag = 0 ;

        for(int i = 0 ; i < arr.length - 2 ;i++){
            if(arr[i] % 2 != 0 && arr[i+1] % 2 != 0 && arr[i+2] % 2 != 0){
                flag = 1 ;
                break;
            }
        }

        if(flag == 1){
            return true ;
        }

        return false;
    }
}
