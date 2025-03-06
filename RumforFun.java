import java.util.Scanner;

public class RumforFun {
    public static void main(String[] args) {
        
        int breaks = 0 ;
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		if(X >= Y){
		    System.out.println(0);
		}
		else if(X == 1){
		    breaks = Y - 1 ;
		    System.out.println(breaks);
        }
		else{
		    breaks = ( Y - 1) / X ;
		    System.out.println(breaks);
		}
    }
}