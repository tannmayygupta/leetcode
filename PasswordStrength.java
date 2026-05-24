import java.util.HashSet;
// 3941. Password Strength
// https://leetcode.com/problems/password-strength/description/
public class PasswordStrength {
    public static void main(String[] args) {
        String s = "aA1!";
        System.out.println(passwordStrength(s));
    }
    public static int passwordStrength(String password) {
        int ans = 0 ;
        int n = password.length() ;
        HashSet<Character> set = new HashSet<>();

        for(int i = 0 ; i < n ; i++){
            set.add(password.charAt(i));
        }

        for(Character element : set){
            char ch = element ;

            if(ch >= 'a' && ch<='z'){
                ans+=1 ;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ans+=2 ;
            }
            else if(ch >= '0' && ch<='9'){
                ans+=3 ;
            }
            else if((ch == '!' || ch == '$' || ch == '#' || ch == '@')){
                ans+=5 ;
            }
        }

        return ans ;
        
    }
}
