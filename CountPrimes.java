import java.util.Scanner;

public class CountPrimes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(countPrimes(n));

    }
    public static int countPrimes(int n) {
        int mam = 0 ;
        int n1 = 0 ;
        while(n1 < n){
            if(isPrime(n1)){
                mam++;
            }
            n1++;
        }
        return mam ;
    }

    public static boolean isPrime(int n1){
        if(n1 < 2){
            return false ;
        }
        else{
            for(int i = 2 ; i <= Math.sqrt(n1) ; i++){
                if(n1 % i == 0){
                    return false ;
                }
            }
            return true ;
        }
    }
}