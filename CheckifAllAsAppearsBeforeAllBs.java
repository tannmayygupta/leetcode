import java.util.Scanner;

public class CheckifAllAsAppearsBeforeAllBs {
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
