import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {

        int n = 5 ;

        System.out.println(fizzBuzz(n));
        
    }
    static List<String> fizzBuzz(int n) {

        int n1 = 1 ;

        List<String> ans = new ArrayList<>();
        
        while(n1 <= n){
            if(n1 % 3 == 0 && n1 % 5 == 0){
                ans.add("FizzBuzz");
            }
            else if(n1 % 5 == 0){
                ans.add("Buzz");
            }
            else if(n1 % 3 == 0){
                ans.add("Fizz");
            }
            else{
                ans.add(Integer.toString(n1));
            }
            n1++;
        }

        return ans ;
    }
}
