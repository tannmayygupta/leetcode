import java.util.*;
import java.lang.*;
import java.io.*;

public class TechnexTickets {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 1 ; i <= T ; i++){
		    int N = sc.nextInt();
		    int x = TicketQueue(N);
		    System.out.println(x);
		}
        
    }
    public static int TicketQueue(int m){
        if(m == 1){
           // System.out.println(1);
           return 1 ;
        }
        else if(m == 2){
           // System.out.println(2);
           return 2 ;
        }
        else{
            if(m % 2 == 0){
                int y = (m / 2) + 1 ;
                return y ;
            }
            else{
               int z = (m - 1) / 2 ;
               return z ;
            }
        }
 }
}