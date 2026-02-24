import java.util.Stack;
// 20. Valid Parentheses
// https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()]]]]]]";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        
        Stack<Character> stk = new Stack<>();

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            
            if(ch == '(' ){
                stk.push(')');
            }
            else if(ch == '[' ){
                stk.push(']');
            }
            else if(ch == '{') {
                stk.push('}');
            }
            else if(!stk.empty() && stk.peek() == ch ){ // if we dont check for empty
                //tc like s = ']' ;
                // as no opening bracket we will not able to push this and not able to check for peek
                stk.pop();
            }
            else if(!stk.empty() && stk.peek() == ch ){
                stk.pop();   
            }
            else if(!stk.empty() && stk.peek() == ch ){
                stk.pop();
            }else{
                return false ;
            }

        }

        return stk.empty() ;
        
    }
}
