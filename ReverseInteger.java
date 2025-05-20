import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(reverse(x));
    }
    public static int reverse(int x) {
        // mai soch raha string me convert karke ya fir sadh aprochh le le rcursion wala

        int flag = 0 ;

        if(x < 0){
            flag = 1 ;
        }

        int num = Math.abs(x);
        long temp = 0 ;

        while(num > 0){
            int rem = num % 10 ;
            num = num / 10 ;
            temp = temp * 10 + rem ;
            
            if(temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE){ 
                // after reversing the num is more than 2^31  
                return 0 ;
            }
        }

        if(temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE){
            return 0 ;
        }

        if(flag == 1){
            temp = -temp ;
            return  (int)temp;
        }

        return (int)temp ;
        
    }
}
