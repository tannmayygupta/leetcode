import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesisCC {
public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t--!=0){
		    String s = sc.next();
		    int flag = 0 ;
		    
		    Stack<Character> stk = new Stack<>();
		    
		    int count = 0 ;
		    
		    for(int i = 0 ; i < s.length() ; i++){
		        char ch = s.charAt(i);
		        
		        if(ch == '('){
		            stk.push(')');
		        }
		        else if(!stk.empty() && stk.peek() == ch ){
		            stk.pop();
		        }else{
		            flag = 1 ;
		            break;
		        }
		        
		    }
		    
		    if(stk.empty() && flag == 0){
		        System.out.println("1");
		    }else{
		        System.out.println("0");
		    }
		}
	}

}
