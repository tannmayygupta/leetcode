import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ClosestPrimeNumbersinRange {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int left = sc.nextInt() ;

        int rigth = sc.nextInt() ;

        int[] arr = closestPrimes(left, rigth) ;

        System.out.println(Arrays.toString(arr));

    }

    public static int[] closestPrimes(int left, int right) {
        List<Integer> list = new ArrayList<>();

        for(int i = left ; i <= right ; i++){
            if(isPrime(i) == true){
                list.add(i) ;
            }
        }

        if (list.size() < 2) {
            return new int[]{-1, -1};
        }

        // the array list contain all the prime 

        Integer[] array = list.toArray(new Integer[0]);

        int min = Integer.MAX_VALUE;
        
        int[] res = new int[2];
        

        for (int i = 0; i < array.length - 1; i++){
            int diff = array[i + 1] - array[i];
            if (diff < min) {
                min = diff;
                res[0] = array[i];
                res[1] = array[i + 1];
            }
        }
        
        return res;
}

    public static boolean isPrime(int i){
        if(i < 2){
            return false ;
        }
        else{
            for(int j = 2 ; j <= (int) Math.sqrt(i) ; j++){
                if(i % j  == 0){
                    return false ;
                }
            }
            return true ; 
        }
    }
    
}
