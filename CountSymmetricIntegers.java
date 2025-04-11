import java.util.*;

public class CountSymmetricIntegers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int low = sc.nextInt();

        int high = sc.nextInt();

        int x = countSymmetricIntegers(low, high);

        System.out.println(x);
        
    }

    public static int countSymmetricIntegers(int low, int high) {
    
            int cou = 0 ;
    
            for(int i = low ; i <= high ; i++ ){
                int x = countDigit(i);
    
                if(x % 2 == 0){
                    int y = sum(i);
                    cou = cou + y ;
                }
            }
            return cou ;
        }
    
    public static int sum(int u){
            String s = String.valueOf(u);
    
            int sum1 = 0 ;
    
            int sum2 = 0 ;
    
            for(int i = 0 ; i < s.length()/2 ; i++){
                sum1 += (s.charAt(i) - '0') ;
            }
    
    
            for(int j = s.length()/2 ; j < s.length() ; j++){
                sum2 += (s.charAt(j) - '0') ;
            }
    
            if(sum1 == sum2){
                return 1 ;
            }
            return 0 ;
        }
    
        public static int countDigit(int m){
            int count = 0 ;
            if(m < 10){
                return -1; 
            }
            while(m > 0){
                int rem = m % 10 ;
                m = m / 10 ;
                count++;
            }
            return count ;
    }
}
