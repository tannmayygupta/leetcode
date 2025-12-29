import java.util.*;
import java.lang.*;
import java.io.*;

// // Bear and Candies 123
// https://www.codechef.com/practice/course/1-star-difficulty-problems/DIFF1200/problems/CANDY123

public class BearandCandies123
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		// thing is that we dont have limitation iin turns 
		// but the one who completes eating A or B atmost 
		// wins 
		
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t--!=0){
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    
		    int turn = 1 ;
		    int Limak = 0 ;
		    int bob = 0 ;
		    
		    while(true){
		        if(turn % 2 == 0){
		            // this even means bobs turn 
		            bob += turn ;
		            if(bob > B){
		                // why we print Limbak because this as bob reached the limit of B
		                // he cant eat any more so he loses
                        System.out.println("Limak");
		                break;
		            }
		        }else{
		            // this odd means limbal turn
		            Limak+= turn;
		            if(Limak > A){
		                // why we print Bob because this as bob reached the limit of A
		                // he cant eat any more so he loses
                        System.out.println("Bob");
		                break;
		            }
		        }
		        turn++;
		    }
		}

	}
}




