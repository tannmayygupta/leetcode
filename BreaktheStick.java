import java.util.*;
import java.lang.*;
import java.io.*;
// https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/BREAKSTICK?tab=statement 
// Break the Stick

public class BreaktheStick {

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t--!=0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            
            if(n % 2 == 0){
                System.out.println("YES");
            }else{
                if(x % 2 == 0){
                    System.out.println("No");
                }else{
                    System.out.println("YES");
                }
            }
        }
	}
}

