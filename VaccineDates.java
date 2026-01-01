import java.util.*;
import java.lang.*;
import java.io.*;

public class VaccineDates {
    // Vaccine Dates
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here		
		Scanner sc = new Scanner(System.in);
        
		int t = sc.nextInt();
		while(t--!=0){
		    int D = sc.nextInt();
		    
		    int L = sc.nextInt();
		    
		    int R = sc.nextInt();
		    
		    if(D < L){
		        System.out.println("Too Early");
		    }else if(D>=L && D<= R){
		        System.out.println("Take second dose now");
		    }else{
		        System.out.println("Too Late");
		    }
		}

	}
}
