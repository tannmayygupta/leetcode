import java.util.Scanner;

public class OddString {
    	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t--!=0){
		    int n = sc.nextInt();
		    String s = sc.next();
		  //  char[] ch = new char[n];
		    int[] freq = new int[26];
		    
		    for(int i = 0 ; i < n ; i++){
		        char ch = s.charAt(i);
		        int c = ch - 'a';
		        freq[c]++;
		    }
		    int flag = 0 ;
		    
		    for(int i = 0 ; i < 26 ; i++){
		        if(freq[i] >= 3){
		          //  System.out.println("NO");
		            flag = 1;
		            break;
		        }
		    }
		    
		    if(flag==1){
		        System.out.println("NO");
		    }else{
		        System.out.println("YES");
		    }
		    
		    
		}

	}
}
