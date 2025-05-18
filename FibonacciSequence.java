import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(fib(n));
        
    }
    public static int fib(int n) {
        int fn = 0 ;
        int f0 = 0 ;
        int f1 = 1 ;

        if(n == 1){
            fn = 1;
        }
        else if(n == 0){
            fn = 0 ;
        }
        else{
            while(n > 1){
                fn = f0 + f1;
                f0 = f1 ;
                f1 = fn ;
                n--;
            }
        }

        return fn ;

    }
}
