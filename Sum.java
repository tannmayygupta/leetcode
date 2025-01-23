import java.util.Scanner;
public class Sum {

    public static void main(String[] args) {
        int n ; 
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sum = digit(n,sum);
        
        System.out.println(sum);
        
    }
    static int digit(int n , int sum ){
        if(n==0){
            return sum;
        }
        int m = 0 ; // 123
        m = n % 10 ;
        sum += m * m ;
        n = n / 10 ;
        sum = digit(n , sum );
        return sum ;
    }
}
