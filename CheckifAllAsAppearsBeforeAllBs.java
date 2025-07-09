import java.util.Scanner;

public class CheckifAllAsAppearsBeforeAllBs {

    // 2124. Check if All A's Appears Before All B's

    // https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/description/
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(checkString(s));

    }

    public static boolean checkString(String s) {
        int coub = 0 ;

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);

            if(ch == 'a' && coub > 0){
                return false ;
            }
            if(ch == 'b'){
                coub++;
            }

        }

        return true ;
    }
}
