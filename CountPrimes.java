import java.util.Arrays;
import java.util.Scanner;

public class CountPrimes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(countPrimes(n));

    }

    // BRUTEFORCE GETTING TLE NOT OPTIMISED SOLUTION 

    // public static int countPrimes(int n) {
    //     int mam = 0 ;
    //     int n1 = 0 ;
    //     while(n1 < n){
    //         if(isPrime(n1)){
    //             mam++;
    //         }
    //         n1++;
    //     }
    //     return mam ;
    // }

    // public static boolean isPrime(int n1){
    //     if(n1 < 2){
    //         return false ;
    //     }
    //     else{
    //         for(int i = 2 ; i <= Math.sqrt(n1) ; i++){
    //             if(n1 % i == 0){
    //                 return false ;
    //             }
    //         }
    //         return true ;
    //     }
    // }


    // HERE IS THE SIEVE METHOD WHAT IT DO IS I HAVE LEARBED IT 
    // we know 2 is prime then multiple of 2 in range n will not be prime 
    // same goes with 3, 5, 7

    public static int countPrimes(int n) {

        if(n <= 2){
            return 0 ;
        }

        boolean[] arr = new boolean[n];

        Arrays.fill(arr,true);

        arr[0] = arr[1] == false ;

        for(int i = 2 ; i <= (int) Math.sqrt(n) ; i++){
            if(arr[i]){
                for(int j = i * i ; j < n ; j+=i){
                    arr[j] = false ;
                }
            }
        }

        int cou = 0 ;

        for(int i = 2 ; i < arr.length ; i++){
            if(arr[i]){
                ++cou;
            }
        }

        return cou ;

    }
}