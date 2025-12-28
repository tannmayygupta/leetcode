import java.util.*;
import java.lang.*;
import java.io.*;

public class EncodingMessage {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        // https://www.codechef.com/viewsolution/1221901057 
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t--!=0){
		    int n = sc.nextInt();
		    
		    String s = sc.next();
		    
		    char[] ch = s.toCharArray();
		    
		    for(int i = 0 ; i < ch.length - 1 ; i+=2){
		        char temp = ch[i];
		        ch[i] = ch[i+1];
		        ch[i+1] = temp ;
		    }
		    
		    for(int i = 0 ; i < ch.length ; i++){
		        int c = ch[i] - 'a' ;
		        char ch1 = (char) ('z' - c) ;
		        ch[i] = ch1 ;
		    }
		    
		    System.out.println(String.valueOf(ch));
		    
		}

	}
}
