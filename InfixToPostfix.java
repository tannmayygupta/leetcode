import java.util.Stack;
// https://www.geeksforgeeks.org/problems/infix-to-postfix-1587115620/1
// gfg stacks ds
public class InfixToPostfix {
    public static void main(String[] args) {

        String s = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(s));
        
    }

    public static String infixToPostfix(String s) {
        // code here
        StringBuilder ans = new StringBuilder("");
        
        int i = 0 ; 
        
        Stack<Character> stk = new Stack<>();
        
        while(i < s.length()){
            
            char ch = s.charAt(i);
            
            if((ch >= 'A' && ch <= 'Z') 
            || (ch >= 'a' && ch <= 'z')
            || (ch >= '0' && ch <= '9')){
                ans.append(ch);
            }else if(ch == '('){
                stk.push(ch);
            }else if(ch == ')'){
                while(!stk.empty() && stk.peek()!='('){
                    ans.append(stk.pop());
                }
                stk.pop();
            }else{
                while(!stk.empty() && ((priority(stk.peek()) > priority(ch)) || (priority(stk.peek()) == priority(ch) && (ch != '^'))) ){
                    ans.append(stk.pop());
                }
                stk.push(ch);
            }
            i++;
        }
        
        while(!stk.empty()){
            ans.append(stk.pop());
        }
        
        return ans.toString();
    }
    
    public static int priority(char ch){
        if(ch == '^'){
            return 3;
        }else if(ch == '*' || ch == '/'){
            return 2 ;
        }else if(ch == '+' || ch == '-'){
            return 1 ;
        }else{
            return -1; 
        }
    }
}
