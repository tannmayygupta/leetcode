import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        int left = 1 ;
        int right = 22 ;

        System.out.println(selfDividingNumbers(left, right));
    }
    public static List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> ans = new ArrayList<>();

        int st = left ;
        
        while(st <= right){
            if(isselfdiv(st)){
                ans.add(st);
            }
            st++;
        }

        return ans ;

    }
    static boolean isselfdiv(int n){
        int n1 = n ;

        while(n > 0){

            int rem = n % 10 ;
            
            if(rem == 0){
                return false ;
            }

            if(n1 % rem != 0){
                return false ;
            }
            
            n = n / 10 ;
        }
        return true ;
    }
}
