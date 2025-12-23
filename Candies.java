import java.util.*;
import java.lang.*;
import java.io.*;


public class Candies {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t--!= 0){
		    int n = sc.nextInt();
		    int[] arr = new int[2*n];
		    
		    for(int i = 0 ; i < 2 * n ; i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    int flag = 0 ;
		    
		    HashMap<Integer , Integer > ans = new HashMap<>();
		    for(int i = 0 ; i < 2 * n ; i++){
		        if(ans.containsKey(arr[i])){
		            int val = ans.get(arr[i]) + 1;
		            if(val == 3){
		                flag = 1 ;
		                break ;
		            }
		            ans.put(arr[i] , val);
		        }else{
		            ans.put(arr[i],1);
		        }
		    }
		    
		    if(flag == 1){
		        System.out.println("NO");
		    }else{
		        System.out.println("YES");
		    }
		}

	}
}

