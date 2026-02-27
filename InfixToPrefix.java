import java.util.Stack;
// https://www.geeksforgeeks.org/problems/infix-to-prefix-notation/1
// Infix To Prefix Notation
public class InfixToPrefix {
    public static void main(String[] args) {
        String s = "a*b+c/d";
        System.out.println(infixToPrefix(s));
    }

    public static String infixToPrefix(String s) {
        // code here
        char[] arr = s.toCharArray();
        
        int i = 0 ;
        int j = arr.length - 1;
        
        while(i <= j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp ;
            i++;
            j--;
        }
        
        for(int m = 0 ; m < arr.length ; m++){
            if(arr[m] == ')'){
                arr[m]='(';
            }
            
            if(arr[m] == '('){
                arr[m]=')';
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int m = 0 ; m < arr.length ; m++){
            sb.append(arr[m]);
        }
        
        String s1 = sb.toString();
        
        System.out.println(s1);

        return infixToPostfix(s1);
    }
    
    public static String infixToPostfix(String s1){
        
        int i = 0 ; 
        
        StringBuilder ans = new StringBuilder();
        
        Stack<Character> stk = new Stack<>();
        
        while(i < s1.length()){
            char ch = s1.charAt(i);
            if( (ch>='A' && ch<='Z') ||
                (ch>='a' && ch<='z') ||
                (ch>='0' && ch<='9')
            ){
                ans.append(ch);
            }else if(ch == '('){
                stk.push(ch);
            }else if(ch == ')'){
                while(!stk.empty() && stk.peek()!='('){
                    ans.append(stk.pop());
                }
                stk.pop(); // ye issliye kyoki apan ne '(' pop hi nhi kiye 
            }else{ // operators ke liye
                while(!stk.empty() && ( (priority(stk.peek()) > priority(ch)) || 
                (priority(stk.peek()) == priority(ch) && ch == '^'))){
                    ans.append(stk.pop());
                }
                stk.push(ch);
            }
            i++;
        }
        
        while(!stk.empty()){
            ans.append(stk.pop());
        }
        
        return ans.reverse().toString();
    }
    
    public static int priority(char ch){
        if(ch == '^'){
            return 3 ;
        }else if(ch == '*' || ch == '/'){
            return 2 ;
        }else if(ch == '-' || ch == '+'){
            return 1 ;
        }else{
            return -1 ;
        }
    }
}
