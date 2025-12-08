import java.util.Scanner;

public class CompletePrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt() ;

        System.out.println(completePrime(num));
        
    }
    public static boolean completePrime(int num) {

        String s = Integer.toString(num);

        boolean ans = true ;

        if (!isPrime(num)) return false;

        // prefix
        for(int i = s.length() - 1 ; i > 0 ; i--){
            int n1 = Integer.parseInt(s.substring(0,i));
            ans = ans & isPrime(n1);
        }
        
        //suffix
        for(int i = 1 ; i < s.length() ; i++){
            int n1 = Integer.parseInt(s.substring(i));
            ans = ans & isPrime(n1);
        }

        return ans ;

    }
    public static boolean isPrime(int n){
        if(n <= 1){
            return false ;
        }

        for(int i = 2 ; i * i <= n ; i++){
            if(n % i == 0){
                return false ;
            }
        }

        return true ;
    }
}
