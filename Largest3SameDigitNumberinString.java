import java.util.Scanner;

public class Largest3SameDigitNumberinString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();

        System.out.println(num);


    }
    public static String largestGoodInteger(String num) {
        int max = Integer.MIN_VALUE ;

        for(int i = 0 ; i < num.length() - 2 ; i++){
            char c = num.charAt(i);
            char c2 = num.charAt(i+1);
            char c3 = num.charAt(i+2);

            if(c == c2 && c2 == c3){
                int n = c - '0' ;
                max = Math.max(max,n);
            }
        }

        StringBuilder sb = new StringBuilder("");

        if(max == Integer.MIN_VALUE){
            return "" ;
        }

        else{
            for(int j = 0 ; j < 3 ; j++){
                String p = Integer.toString(max);
                sb.append(p);
            }

            return sb.toString();
        }
        
    }
}
