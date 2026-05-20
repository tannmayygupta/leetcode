import java.util.Scanner;

public class StringtoIntegeratoi {
    /**
     * @param args
     */
    // 8. String to Integer (atoi)
    // https://leetcode.com/problems/string-to-integer-atoi/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String s) {
        long ans = 0 ;
        int digit = 0 ;
        int plus = 0 ;
        int niga = 0 ;
        boolean neg = false ;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || ch == '.' || digit > 0 && !(ch >= '0' && ch <= '9') || (plus > 0 && digit == 0 && !(ch >= '0' && ch <= '9')) || (niga > 0 && digit == 0 && !(ch >= '0' && ch <= '9')) ){
                break ;
            }else if(ch >= '0' && ch <= '9'){
                digit++;
                int c = ch - '0' ;
                
                ans = ans * 10 + c ; // this sometime overflow the variable
                // so after updation change it to

                if(!neg && ans > Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }

                if(neg && -ans < Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }

            }else if(ch == '-'){
                if(digit == 0){
                    neg = true ;
                }
                niga++;
                continue ;
            }else if(ch == '+'){
                plus++;
            }
        }

        if(neg){
            ans = -1 * ans ;
            if(ans < Integer.MIN_VALUE){
                return Integer.MIN_VALUE ;
            }else{
                return (int) ans ;
            }
        }

        return ans > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) ans ;
    }
}
