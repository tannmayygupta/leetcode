import java.util.Arrays;

public class FindLuckyIntegerinanArray {
    public static void main(String[] args) {

        int[] arr = {1,2,2,3,3,3};

        System.out.println(findLucky(arr));
        
    }
    public static int findLucky(int[] arr) {

        Arrays.sort(arr);

        int ans = -1 ;

        int cou = 1;

        for(int i = 0 ; i < arr.length - 1; i++){
            if(arr[i] == arr[i+1]){
                cou++;
            }
            else{
                if(cou == arr[i]){
                    ans = arr[i];
                }
                cou = 1 ;
            }
        }

        return ans ;
    }
}
