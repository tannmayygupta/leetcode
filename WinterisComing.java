import java.util.Scanner;

public class WinterisComing {
    	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!= 0){
		    int n = sc.nextInt();
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    sc.nextLine();
		    int[] arr = new int[n];
	    
		    for(int i = 0 ; i < n ; i++){
		        arr[i]=sc.nextInt();
		    }
		    int ans = 0 ;
		    boolean jacket = false ;
		    
		    for(int i = 0 ; i < n ; i++){
		        if(arr[i]<a){
		            if(!jacket){
		                jacket = true ;
		                ans++;
		            }
		        }else if(arr[i] > b){
		            jacket= false ;
		        }
		    }
		    
		    System.out.println(ans);
		    
		}

	}
}
